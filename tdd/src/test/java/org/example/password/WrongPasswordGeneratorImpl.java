package org.example.password;

import org.example.password.PasswordGenerator;

class WrongPasswordGeneratorImpl implements PasswordGenerator {
    @Override
    public String generate() {
        return "1234";
    }
}
