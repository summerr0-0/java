package org.example.part1.chapter2.after2;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple :
            inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    //익명클래스를 이용해 ApplePredicate 구현
    //단점 : 공간을 많이 차지하고 익명클래스 사용이 익숙하지가 않자
    public static List<Apple> anonymousFunc(List<Apple> inventory) {
        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return Color.RED.equals(apple.getColor());
            }
        });
        return redApples;
    }


    //람다를 이용하면 간단하게 구현할 수 있다
    public static List<Apple> lambdaFunc(List<Apple> inventory) {
        List<Apple> redApples = filterApples(inventory,
            (Apple apple) -> Color.RED.equals(apple.getColor()));

        return redApples;
    }
}
