package org.example.part1.chapter2.lambdaexample;

import java.util.concurrent.*;

public class TestExecutor {
    //ExecutorService를 이용하면 태스크를 스레드 풀로 보내고 결과를 Future로 저장할 수 있다
    //Callable 인터페이스를 이용해 결과를 반환하는 태스크를 만든다

    //실행 서비스에 태스크를 제출
    public void executeRun() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                    return Thread.currentThread().getName();
            }
        });
    }

    //람다로 간단하게 구현 가능
    public void executeRunV2() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadName = executorService.submit(()->Thread.currentThread().getName());
    }
}
