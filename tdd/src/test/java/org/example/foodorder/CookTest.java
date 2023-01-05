package org.example.foodorder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {
    @Test
    void 요리를_생성한다() {
        assertThatCode(()->new Cook("김밥",2000)).doesNotThrowAnyException();
    }
}
