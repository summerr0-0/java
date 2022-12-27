package org.example.password;

import org.example.password.PasswordGenerator;
class CorrectPasswordGeneratorImpl implements PasswordGenerator {
    @Override
    public String generate() {
        return "123456";
    }
}
