package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q0508 {
    public int solution(int N, int M, int[] arr) {
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.add(new Person(i, arr[i]));
        }

        int count = 0;
        while (queue.size() > 0) {
            Person p = queue.poll();

            for(Person tp : queue){
                if(tp.priority > p.priority){
                    queue.add(p);
                    p = null;
                    break;
                }
            }

            if(p == null) continue;

            count++;
            if(p.id == M) break;

        }

        return count;
    }

    static class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}
