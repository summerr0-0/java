package org.example.stack;


import java.util.ArrayList;
import java.util.List;

//- JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
//        - pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
//        - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보
public class StackUsingArrayList<T> {
    private List<T> stackList = new ArrayList();
    public T pop(){
        if (stackList.isEmpty()) return null;
        return stackList.remove(stackList.size()-1);
    }
    public void push(T data){
        stackList.add(data);
    }

}


