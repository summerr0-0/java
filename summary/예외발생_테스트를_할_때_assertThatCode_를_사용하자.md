# ****assertThatThrownBy()과 assertThatCode() 의 차이****

**assertThatThrownBy()**

- 예외가 던져지지 않으면 바로 실패한다
- 예외가 던져지지 않으면 as()의 설명도 에러 메세지에 나타나지 않는다

**assertThatCode()**

- 예외가 던져지지 않아도 실패하지 않는다
- 예외가 던져지지 않아도 as()의 설명이 에러 메세지에 나타난다

즉 예외가 발생하지 않음을 테스트를 할땐 *`assertThatCode`* 를 사용해야 하는데 통일감을 위해 예외 테스트를 할 때도 `assertThatCode` 를 사용하자

# 예시

```java
assertThatCode(() -> sut.verify(password))
            t
            .hasMessage(PASSWORD_WRONG_MESSAGE);

assertThatCode(() -> sut.verify("12345678")).doesNotThrowAnyException();
```
