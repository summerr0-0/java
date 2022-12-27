package org.example.password;

import org.assertj.core.api.Assertions;
import org.example.password.PasswordGeneratorImpl;
import org.example.password.User;
import org.junit.jupiter.api.Test;

//인터페이스에 @FunctionalInterface를 선언한 경우
// Impl없이 람다로 인스턴스 클래스를 생성해서 만들 수 있다.
class UserTest {
    @Test
    void 비밀번호가_5글자_이상이여야_세팅이_된다() {
        User sut = new User();

//        sut.init(new CorrectPasswordGeneratorImpl());
        sut.init(()->"12345");
        Assertions.assertThat(sut.getPassword()).isNotNull();
    }

    @Test
    void 비밀번호가_5글자_이하면_세팅이_안된다() {
        User sut = new User();

//        sut.init(new WrongPasswordGeneratorImpl());
        sut.init(()->"1234");
        Assertions.assertThat(sut.getPassword()).isNull();
    }
}
