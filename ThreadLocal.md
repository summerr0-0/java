## 환경

-   배치를 실행할 때 운영db환경에서도 테스트를 하기 위해서 CustomSessionTemplate가 있다
-   템플릿에서는 `TEST` 로 배치가 실행되면 insert,update,delete 가 적용되지 않는다

### 문제발생

-   배치 A를 `TEST` 로 실행시킨 후 배치 B를 `MANUAl` 로 실행시키면 배치 A도 `MANUAL` 로 변경되어 DB에 값이 저장되는 문제가 발생했다

### 원인

-   `CustomSessionTemplate` 에 있던 배치 실행타입 변수가 문제였다.
-   `CustomSessionTemplate` 은 싱글톤으로 관리되는데 배치가 들어올때마다 해당 배치실행타입이 변경되었다
-   동시성 문제

### 해결

-   여러가지 의견이 나왔었다
    -   파라미터 값에 insert를 할때마다 실행타입을 넣자
    -   실행별로 SessionTemplate을 나누자
    -   ...
-   결론은 `ThreadLocal`을 사용하는 것이었다

# ThreadLocal

-   자바 1.2버전부터 제공되고 있는 기능
-   쓰레드 단위로 로컬변수를 할당한다

```java
// 현재 쓰레드와 관련된 로컬 변수를 하나 생성한다.
ThreadLocal<UserInfo> local = new ThreadLocal<UserInfo>();

// 로컬 변수에 값 할당
local.set(currentUser);

// 이후 실행되는 코드는 쓰레드 로컬 변수 값을 사용
UserInfo userInfo = local.get();
```

## 주의사항

-   쓰레드 풀 환경에서 ThreadLocal을 사용하는 경우 ThreadLocal 변수에 보관된 데이터의 사용이 끝나면 반드시 해당 데이터를 삭제해 주어야 한다.
-   그렇지 않을 경우 재사용되는 쓰레드가 올바르지 않은 데이터를 참조할 수 있다.