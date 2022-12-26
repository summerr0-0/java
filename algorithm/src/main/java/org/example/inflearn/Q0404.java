package org.example.inflearn;

import java.util.HashMap;
import java.util.Map;

public class Q0404 {
    public int solution(String S, String T) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        //비교 값을 넣는다
        for (int i = 0; i < T.length(); i++) {
            tMap.put(T.charAt(i), tMap.getOrDefault(T.charAt(i), 0) + 1);
        }

        //초기값을 세팅한다
        for (int i = 0; i < T.length() - 1; i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }

        //슬라이딩 윈도우
        int lt = 0;
        for (int rt = T.length() - 1; rt < S.length(); rt++) {
            //다음 값 더하기
            map.put(S.charAt(rt), map.getOrDefault(S.charAt(rt), 0) + 1);

            //비교
            if (tMap.equals(map)) answer += 1;

            //빼기
            map.put(S.charAt(lt), map.get(S.charAt(lt)) - 1);

            if (map.get(S.charAt(lt)) == 0) map.remove(S.charAt(lt));
            lt++;
        }
        return -1;

    }

}
