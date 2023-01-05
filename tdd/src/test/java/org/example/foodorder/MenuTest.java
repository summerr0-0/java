package org.example.foodorder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

class MenuTest {
    @Test
    void 메뉴이름_담긴_메뉴_생성() {
        assertThatCode(() -> new Menu(List.of(
            new MenuItem("김밥", 2000),
            new MenuItem("라면", 5000))))
            .doesNotThrowAnyException();
    }

    @Test
    void 메뉴선택() {
        Menu menu = new Menu(List.of(
            new MenuItem("김밥", 2000),
            new MenuItem("라면", 5000)));

        MenuItem item = menu.choose("김밥");

        assertThat(item).isEqualTo(new MenuItem("김밥",2000));
    }

    @Test
    void 잘못된_메뉴선택() {
        Menu menu = new Menu(List.of(
            new MenuItem("김밥", 2000),
            new MenuItem("라면", 5000)));


        assertThatCode(()->menu.choose("자장면"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("메뉴 잘못 선택");
    }
}