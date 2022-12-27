package org.example.password;

import java.util.Map;

//비밀번호는 최소 8자 이상 12자 이하여야 한다
//비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외 발생
//경계 조건에 대한 테스트코드 작성 필요
public class Password {
    public static final String PASSWORD_WRONG_MESSAGE = "패스워드는 8자 이상 12자 이하여야 합니다";

    public boolean verify(String input){
        int size = input.length();
        if(size<8) throw  new IllegalArgumentException(PASSWORD_WRONG_MESSAGE);
        if(size>12) throw new IllegalArgumentException(PASSWORD_WRONG_MESSAGE);
        return true;
    }
}
