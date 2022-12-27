package org.example.password;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.example.password.Password.PASSWORD_WRONG_MESSAGE;
import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    //여러 파라미터를 이용할 때
    @ParameterizedTest
    @ValueSource(strings = {"1234567","123456"})
    void 비밀번호가_8자_미만일_수는_없다(String password) {
        Password sut = new Password();

        assertThatThrownBy(() -> sut.verify(password))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(PASSWORD_WRONG_MESSAGE);

        //깔끔하게 하기 위해
        assertThatCode(() -> sut.verify(password))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(PASSWORD_WRONG_MESSAGE);

    }

    //    Password must be less than 13 characters
    @Test
    void 비밀번호가_12자_초과일_수는_없다() {
        Password sut = new Password();

        assertThatThrownBy(() -> sut.verify("1234567890123"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(PASSWORD_WRONG_MESSAGE);


        assertThatCode(() -> sut.verify("1234567890123"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(PASSWORD_WRONG_MESSAGE);
    }

    @Test
    void 정상케이스() {
        Password sut = new Password();

        assertThatCode(() -> sut.verify("12345678")).doesNotThrowAnyException();
        assertThat(sut.verify("12345678")).isTrue();
    }


}