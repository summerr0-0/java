# 삼항연산자 사용 중 NPE 발생

```java
Integer occursNullPointerException() {
  boolean check = false;
  Integer number1 = null;
  Integer number2 = check ? 0 : number1; // NPE
  return number2;
}
```

-   이럴 경우 check가 false니 null이 나올거 같지만 `NullPointerExcpetion` 이 발생한다
-   이것에 대한 해석

## 0. Conditional Operator

-   삼항연산자는 항이 셋인 연산자라는 의미
-   `? :` 로 표현하는 연산자만을 지칭하는 단어는 아니다
-   [Java 8 Language Specification](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.25)에서는 삼항 연산자를 Conditional Operator라고 부르고 있다.

## 1. JAVA의 언박싱 형변환

-   문제 이해하기 위해 언박싱 형변환이 무엇인지 알아야 한다
-   [Java 8 Language Specification 5.1.8. Unboxing Conversion](https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.8) 참고
-   다음의 8가지 경우만을 언박싱 형변환이라 부른다

🍀 **언박싱 형변환** From type `Boolean` to type `boolean`

From type `Byte` to type `byte`

From type `Short` to type `short`

From type `Character` to type `char`

From type `Integer` to type `int`

From type `Long` to type `long`

From type `Float` to type `float`

From type `Double` to type `double`


-   언박싱 형변환은 런타임에 다음과 같이 처리된다

🍀 **언박싱 형변환의 런타임 처리** If r is a reference of type `Boolean`, then unboxing conversion converts r into `r.booleanValue()`

If r is a reference of type `Byte`, then unboxing conversion converts r into `r.byteValue()`

If r is a reference of type `Character`, then unboxing conversion converts r into `r.charValue()`

If r is a reference of type `Short`, then unboxing conversion converts r into `r.shortValue()`

If r is a reference of type `Integer`, then unboxing conversion converts r into `r.intValue()`

If r is a reference of type `Long`, then unboxing conversion converts r into `r.longValue()`

If r is a reference of type `Float`, unboxing conversion converts r into `r.floatValue()`

If r is a reference of type `Double`, then unboxing conversion converts r into `r.doubleValue()`

_**If r is `null`, unboxing conversion throws a `NullPointerException`**_



-   즉 null을 언박싱 하려하면 NPE가 발생한다는 뜻이다

## 2. JAVA의 조건 연산자

-   Conditional Operator 를 참고
    -   [JAVA 7](https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.25)
    -   [JAVA 8](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.25) (모든 경우의 수를 표로 정리해둬서 복잡)
-   조건 연산자는 if와 다르다 결과가 특정 타입으로 평가되는 표현식이다

### 조건연산자의 타입 결정

<aside> 🍀 **조건 연산자 표현식의 타입 결정 규칙** 두번째와 세번째 피연산자의 타입이 같다면(null 포함), 그 타입이 조건 표현식의 타입이다. 만약 두번째와 세번째 피연산자 둘 중 하나가 T 라는 primitive 타입이고, 다른 하나가 T를 박싱 형변환한 결과라면, 조건 표현식의 타입은 T 이다.

</aside>

-   `check ? null : null` 이면 타입은 `null`이다.
-   `check ? Double : Double` 이면 타입은 `Double`이다.
-   `check ? Boolean : boolean` 이면 타입은 `boolean`이다.
-   `check ? int : Integer` 이면 타입은 `int`이다.

## 3. NPE가 발생한 과정

```java
Integer occursNullPointerException() {
  boolean check = false;
  Integer number1 = null;
  Integer number2 = check ? 0 : number1;    // NPE
  return number2;
}
```

-   primitive 0이 이으므로 조건 연산자의 타입은 int가 된다
-   따라서
    -   조건절이 true면 int인 0이 된다
        -   아무런 예외가 발생하지 않는다
    -   조건절이 false이면 Integer인 number1을int로 언박싱한다
        -   하지만 null을 언박싱 하는 것이므로 NPE가 발생한다

## NPE가 발생하지 않게 하려면?

### 1. 그냥 if문을 사용하자!

```java
Integer getNumberWithoutNPE() {
  boolean check = false;
  Integer number1 = null;
  if (check) {
    return 0;
  }
  return number1;
}
```

### 2. 조건 언산자의 타입을 맞춰준다

-   0을 Integer로 제공해주면 조건 연산자의 타입이 Integer가 되므로 문제가 해결된다

```java
Integer getNumberWithoutNPE() {
  boolean check = false;
  Integer number1 = null;
  Integer number2 = check ? Integer.valueOf(0) : number1;
  return number2;
}
```