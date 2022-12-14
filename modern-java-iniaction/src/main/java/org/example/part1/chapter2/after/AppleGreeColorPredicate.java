package org.example.part1.chapter2.after;


//녹색 사과만 선택
public class AppleGreeColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
