package org.example.part1.chapter3.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public void solution() {
        //for each와 람다를 이용해서 list를 출력하는 예제
        forEach(Arrays.asList(1,2,3,4,5),(Integer i)-> System.out.println(i));

    }

    //forEach함수에 c 동작을 하는 것
    private <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t: list){
            c.accept(t);
        }
    }
}
