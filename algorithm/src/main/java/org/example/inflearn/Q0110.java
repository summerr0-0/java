package org.example.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0110 {
    public String solution(String s, String t) {
        int end = s.length();

        List<Integer> tIndexs = new ArrayList<>();
        int[] distance = new int[end];
        Arrays.fill(distance, 999);

        //index들
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == t.charAt(0)) tIndexs.add(i);
        }


        for (int i = 0; i < tIndexs.size(); i++) {
            for (int j = 0; j < distance.length; j++) {
                if (distance[j] > Math.abs(j - tIndexs.get(i))) {
                    distance[j] = Math.abs(j - tIndexs.get(i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : distance) {
            sb.append(i).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    public int[] solution2(String s, char t){
        int[] answer=new int[s.length()];
        int p=1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
