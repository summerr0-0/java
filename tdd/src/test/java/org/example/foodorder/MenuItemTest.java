package org.example.foodorder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @Test
    void 메뉴를_생성한다() {
        assertThatCode(() -> new MenuItem("김밥", 3000)).doesNotThrowAnyException();
    }
}
