> `@ParameterizedTest` 를 이용하면 파라미터에 변수들을 넣어 유동적으로 테스트 할 수 있다

***개인적인 의견으론 가독성에 문제가 있을 수도 …***
> 

- `@ParameterizedTest` 를 이용해 다양한 값을 넣어서 테스트를 할 수 있다.
- `@ValueSource` 는 단일 파라미터일 경우 사용한다.

```java
@ParameterizedTest
@ValueSource(strings = {"1234567","123456"})
void 비밀번호가_8자_미만일_수는_없다(String password) {
    Password sut = new Password();

		assertThatCode(() -> sut.verify(password))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage(PASSWORD_WRONG_MESSAGE);

}
```

- `@MethodSource` 는 여러 값을 입력받을 수 있다. 안에 Stream을 리턴하는 메서드 명을 넣으면 된다.
- 메서드는 Stream 타입을 리턴해야 하며 static이여야 한다
    - 혹은 `@TestInstance(Lifecycle.PER_CLASS)`

```java
@ParameterizedTest
@MethodSource("formulaAndResult")
void 한번에_테스트_할_수도_있다(int operand1, String operator, int operand2, int expected) {
    Calculator sut = new Calculator();
    int actual = sut.calculate(operand1, operator, operand2);

    assertThat(actual).isEqualTo(expected);
}

private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
            arguments(1, "+", 2, 3),
            arguments(1, "-", 2, -1),
            arguments(4, "*", 2, 8),
            arguments(4, "/", 2, 2)
        );
    }

```
