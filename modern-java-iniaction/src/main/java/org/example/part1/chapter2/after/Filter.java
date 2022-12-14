package org.example.part1.chapter2.after;

import java.util.ArrayList;
import java.util.List;

//구현된 ApplePredicate에 따라 filter가 다르게 동작된다
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
}
