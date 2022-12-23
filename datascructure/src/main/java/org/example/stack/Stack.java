package org.example.stack;

//LIFO
public class Stack<T> {
    private StackNode<T> top;

    //스택에서 가장 위에 있는 항목을 제거한다
    public T pop() {
        if (this.top == null) return null;
        T item = this.top.data;
        this.top = this.top.next;
        return item;
    }

    //item 하나를 스택의 가장 윗 부분에 추가한다
    public void push(T item) {
        StackNode<T> t = new StackNode<>(item);
        if (this.top == null) {
            this.top = t;
            return;
        }
        t.next = this.top;
        this.top = t;
    }

    //스택의 가장 위에 있는 항목을 반환한다
    public T peek() {
        if (this.top == null) return null;
        return this.top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (top == null) return "";
        StackNode<T> now = this.top;
        while (now.next != null) {
            sb.append(now.data);
            sb.append(" ");
            now = now.next;
        }
        sb.append(now.data);
        return sb.toString();
    }

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }
}
