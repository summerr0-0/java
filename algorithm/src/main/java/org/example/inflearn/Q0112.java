package org.example.inflearn;

public class Q0112 {
    public String solution(int size, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = i * 7;
            String pwd = s.substring(index, index + 7);
            String s1 = pwd.replaceAll("#", "1");
            String s2 = s1.replaceAll("\\*", "0");

            char decimal = (char) Integer.parseInt(s2, 2);

            sb.append(decimal);
        }
        return sb.toString();
    }

    public String solution2(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num=Integer.parseInt(tmp, 2);
            answer+=(char)num;
            s=s.substring(7);
        }
        return answer;
    }



}
