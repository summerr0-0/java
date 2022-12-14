package org.example.part1.chapter2.quiz2;

//다음 코드를 실행한 결과는 4,5,6,42 중 어느 것일까
public class MeaningOfThis {
    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;

            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt(); //실행결과는?
    }

    //코드의 this가 Runnable을 참조하고 있기 때문에 5가 정답
    //익명클래스는 장황한코드를 유발한다
    //동작 파라미터화를 이용해 요구사항 변화에 더 유연하게 대응하자

}
