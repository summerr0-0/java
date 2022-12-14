package org.example.part1.chapter2.before;

import java.util.ArrayList;
import java.util.List;

import static org.example.part1.chapter2.before.Color.GREEN;

public class Filter {
    //녹색 사과 필터링 -> 다른 색깔을 필터하려면 반복되는 코드가 추가된다
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    //색깔로 필터할 수 있다 -> 무게 등의 필터가 추가될 가능성이 있다 : 동작파라미터화하자
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }




}
