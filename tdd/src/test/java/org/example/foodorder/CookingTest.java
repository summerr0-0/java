package org.example.foodorder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {

    @Test
    void 메뉴에_맞는_요리를_만든다() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("김밥",2000);

        Cook cook = cooking.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("김밥",2000));
    }
}
