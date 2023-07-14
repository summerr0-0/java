
-   List나 ArrayList를 for문에 직접 집어넣고 돌리며 remove를 호출했을 때 발생

```java
ArrayList<String> list = new ArrayList<String>();
//~ ~ ~        
for(String name : list){
    list.remove(name);
}
 //=> 에러
```

### 원인

-   for 문은 list에서 index를 비교하며 그에 맞는 값을 name에 넣어주고 돌리는 방식
-   for문을 돌리는 도중 remove를 호출하면 기존 index 값과 remove 호출로 인해 줄어든 size 값이 맞지 않기 때문에 예외가 발생함

### 해결 1

```java
ArrayList<String> list = new ArrayList<String>();
~ ~ ~
ArrayList<String> Remove = new ArrayList<String>();
for (String name : list) 
    Remove.add(name);
for (String name : Remove) 
    list.remove(name);
```

-   삭제해야 할 리스트(이하 Remove)를 따로 만들고 Remove를 for 문에 집어넣어 돌려 list를 제거하는 방식
-   효율적이지 않고 속도도 느림

### 해결2

```java
ArrayList<String> list = new ArrayList<String>();
~ ~ ~
Iterator<String> iter = list.iterator();
while (iter.hasNext()) {
    String s = iter.next();
    iter.remove();
}

```

-   반복자(Iterator)를 이용하는 방식
-   `.remove()` 메서드보다 무조건 `.next()` 메서드가 먼저 호출되어야만 예외가 발생하지 않는다.
-   해결법 1보다는 이 방법이 더 효율적이고 쓸모없는 코드들이 없다 하니 이 방법을 많이 사용하는 것을 권장함