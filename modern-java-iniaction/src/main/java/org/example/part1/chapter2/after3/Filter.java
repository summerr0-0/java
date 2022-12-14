package org.example.part1.chapter2.after3;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    //제네릭타입을 이용 Generic
    //다양한 과일에도 적용할 수 있게 되었다
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void appleFilter(List<Apple> inventory) {
        List<Apple> redApples = filter(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));
    }
    public static void orangeFilter(List<Orange> inventory) {
        List<Orange> heavyOranges = filter(inventory, (Orange orange) -> orange.getWeight() > 150);
    }
}
