package org.example.codingtest.ch3;

public class Ct302 {
    private StackNode top;

    static class StackNode {
        private int value;
        private int min = Integer.MAX_VALUE;
        private StackNode next;

        public StackNode(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    //push 가장 윗부분에 추가
    public void push(int value) {
        int newMin = Math.min(value, min());
        StackNode t = new StackNode(value,newMin);

        t.next = this.top;
        this.top = t;
    }

    //peek
    public int peek() {
        if (top == null) return -1;
        return top.value;
    }

    //pop
    public int pop() {
        if (top == null) return -1;
        int value = top.value;
        this.top = top.next;
        return value;
    }

    //min
    public int min() {
        if (top == null) return Integer.MAX_VALUE;
        return top.min;
    }

    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (top == null) return "";
        StackNode now = this.top;
        while (now.next != null) {
            sb.append(now.value);
            sb.append(" ");
            now = now.next;
        }
        sb.append(now.value);
        return sb.toString();
    }

}
