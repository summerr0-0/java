package org.example.foodorder;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
//1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
//   - 손님, 메뉴판, 돈까스/냉면/만두 요리사, 요리

//2. 객체들 간의 관계를 고민
//   - 손님 -- 메뉴판
//   - 손님 -- 요리사
//   - 요리사 -- 요리

//3.  동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
//   - 손님 -- 손님타입
//   - 돈까스/냉면/만두 -- 요리타입
//   - 메뉴판 -- 메뉴판
//   - 메뉴 -- 메뉴
//   - 요리사 -- 요리사타입

//4. 협력을 설계

//5.  객체들을 포괄하는 타입에 적절한 책임을 할당

//6. 구현하기


    @Test
    void 주문을한다() {

        Customer customer = new Customer();

        Menu menu = new Menu(List.of(
            new MenuItem("김밥", 2000),
            new MenuItem("라면", 5000)));

        Cooking cooking = new Cooking();

        Cook cook = customer.order("김밥", menu, cooking);

        assertThat(cook).isEqualTo(new Cook("김밥",2000));
    }
}
