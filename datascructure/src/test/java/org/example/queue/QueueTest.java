package org.example.queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void queueTest() {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        String s = queue.toString();

        assertThat(s).isEqualTo("1 2 4 5 6");
    }
}