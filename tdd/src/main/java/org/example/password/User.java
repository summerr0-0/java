package org.example.password;

public class User {
    private String password;

    //의존성을 주입받는 형식으로 바꾼다.
    //passwordGenerator의 의존을 밖으로 뺌으로서 결합도를 낮추게 된다.
    public void init(PasswordGenerator passwordGenerator) {
        //as is
        //PasswordGenerator passwordGenerator = new PasswordGenerator();

        String password = passwordGenerator.generate();
        if (password.length() > 5) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
