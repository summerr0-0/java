package org.example.queue;

//FIFO
public class Queue<T> {
    private QueueNode<T> first;
    private QueueNode<T> last;

    public static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    //리스트의 끝부분에 추가
    public void add(T data) {
        QueueNode<T> insertNode = new QueueNode<>(data);
        if (last != null) {
            last.next = insertNode;
        }
        last = insertNode;
        if (first == null) {
            first = last;
        }
    }

    //리스트의 첫번째 항목을 제거한다
    public T remove() {
        if (first == null) return null;
        T returnData = first.data;

        first = first.next;
        if (first == null) last = null;

        return returnData;
    }

    //큐에서 가장 위에 있는 항목 반환
    public T peek() {
        if (first == null) return null;
        return first.data;
    }

    //큐가 비어있으면 true반환(){}
    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        QueueNode<T> now = first;
        while (now.next != null) {
            sb.append(now.data);
            sb.append(" ");
            now = now.next;
        }
        sb.append(now.data);
        return sb.toString();
    }
}
