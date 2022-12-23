package org.example.codingtest.ch3;

//한 배열에 스택 세개를 구현하기
public class Ct301 {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public Ct301(int stackSize) {
        this.stackCapacity = stackSize;
        this.values = new int[stackSize * numberOfStacks];
        this.sizes = new int[numberOfStacks];
    }

    //스택에 값을 추가
    public boolean push(int stackNumber, int input) {
        if (isFull(stackNumber)) return false;

        sizes[stackNumber]++;
        values[indexOfTop(stackNumber)] = input;
        return true;
    }

    //스택에서 값을 꺼낸다
    public int pop(int stackNumber) {
        if (isEmpty(stackNumber)) return -1;

        int top = indexOfTop(stackNumber);
        int value = values[top];
        values[top] = 0;
        sizes[stackNumber]--;
        return value;
    }

    //꼭데기 원소 반환
    public int peek(int stackNumber) {
        if (isEmpty(stackNumber)) return -1;
        return values[indexOfTop(stackNumber)];
    }

    //스택이 비어 있으면 true
    public boolean isEmpty(int stackNumber) {
        return sizes[stackNumber] == 0;
    }

    //스택이 꽉 차 있으면 ture
    public boolean isFull(int stackNumber) {
        return sizes[stackNumber] == stackCapacity;
    }

    //스택의 꼭대기 값을 가리키는 인덱스
    private int indexOfTop(int stackNumber) {
        int offset = stackNumber * stackCapacity;
        int size = sizes[stackNumber];
        return offset + size - 1;
    }

    public String toString(int stackNumber){
        if(sizes[stackNumber]==0) return "";
        int head = stackNumber * stackCapacity;
        int tail = indexOfTop(stackNumber);

        StringBuilder sb = new StringBuilder();
        for(int i = head; i<tail; i++){
            sb.append(values[i]);
            sb.append(" ");
        }
        sb.append(values[tail]);

        return sb.toString();
    }
}
