package org.example.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackTest {

    @Test
    void stackTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(8);

        String string = stack.toString();

        assertThat(string).isEqualTo("8 7 2 3 1");
    }
}