package org.example.codingtest.ch1;

//URL화: 문자열에 들어 있는 모든 공백을 ‘%20’으로 바꿔 주는 메서드를 작성하라.
// 최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보되어 있으며
// 문자열의 최종 길이가 함께 주어진다고 가정해도 된다
//(바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열(character array) 을 이용하길 바란다).
public class Ct103 {
    public String solution(String s, int length) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                sb.append("%20");
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}