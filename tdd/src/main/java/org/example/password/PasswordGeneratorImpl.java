package org.example.password;

//임의의 비밀번호를 만들어주는 passwordGenerator
public class PasswordGeneratorImpl implements PasswordGenerator {
    public String generate() {
        return String.valueOf((int) (Math.random() * 10) + 1);
    }
}
