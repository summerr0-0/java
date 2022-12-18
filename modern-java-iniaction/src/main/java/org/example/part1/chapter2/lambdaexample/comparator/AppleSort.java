package org.example.part1.chapter2.lambdaexample.comparator;


import java.util.Comparator;
import java.util.List;


public class AppleSort {
    //자바8 list에는 sort 메소드가 포함되어 있다
    //Comparator를 구현해서 sort 메서드의 동작을 다양화할 수 있다
    //compareTo는 래퍼타입에서 사용 가능한 함수
    public static List<Apple> sortApplesByWeight(List<Apple> inventory) {
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        return inventory;
    }

    //람다표현식을 사용
    public static List<Apple> sortApplesByWeightV2(List<Apple> inventory) {
        inventory.sort(
            (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        return inventory;
    }


}
