package org.example.part1.chapter2.after;
//프레디케이트 : 참 거짓을 반환하는 함수
//선택 조건을 결정하는 인터페이스
//조건에 따라 filter 메서드가 다르게 동작함 ::전략 디자인 패턴
public interface ApplePredicate {
    boolean test (Apple apple);
}
