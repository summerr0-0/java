package org.example.part1.chapter3.functionalinterface;

import org.example.part1.chapter2.after3.Predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateExample {

    public void solution() {
        //문자열이 비어있지 않은지 확인하는 predicate
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

        List<String> listOfStrings = new ArrayList<>();
        //list들이 비어있지 않은지 확인할 수 있다
        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);

    }

    private <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) results.add(t);
        }
        return results;
    }
}
