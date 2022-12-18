package org.example.part1.chapter2.lambdaexample;

public class TestRunnable {
    //자바에서 Runnable 인터페이스를 이용해 다양한 동작을 스레드로 실행할 수 있다다

    public void executeRun() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        });
    }

    //람다로 간단하게 구현 가능
    public void executeRunV2() {
        Thread t = new Thread(() -> System.out.println("Hello World"));
    }
}
