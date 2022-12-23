package org.example.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * - JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
 * - dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함
 * - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
 */
public class QueueUsingArrayList<T> {

    private List<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) return null;
        return queue.remove(0);
    }


    public static void main(String[] args) {
        QueueUsingArrayList<Integer> mq = new QueueUsingArrayList<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }

}
