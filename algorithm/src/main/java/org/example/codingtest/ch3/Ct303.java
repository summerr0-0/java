package org.example.codingtest.ch3;

import java.util.ArrayList;
import java.util.Stack;

public class Ct303 {
    private final ArrayList<Stack<Integer>> stacks = new ArrayList<>();
    //arrayList의 index
    private int index;

    //스택 사이즈
    private final int initStackSize = 3;

    Ct303() {
        index = 0;
        Stack<Integer> stack = new Stack<>();
        stacks.add(stack);
    }

    private void nextIndex() {
        Stack<Integer> stack = new Stack();
        index++;
        stacks.add(stack);
    }

    private void preciousIndex() {
        stacks.remove(index);
        index--;
    }

    public void push(int data) {
        Stack<Integer> stack = stacks.get(index);

        stack.push(data);

        stacks.set(index, stack);

        if (stack.size() == initStackSize)
            nextIndex();

    }

    public int peek() {
        Stack<Integer> stack = stacks.get(index);
        return stack.peek();
    }

    public int pop() {
        Stack<Integer> stack = stacks.get(index);

        int data;
        if (stack.isEmpty()) {
            if (index == 0) return -1;
            preciousIndex();
            stack = stacks.get(index);
            data = stack.pop();
        }else {
            data = stack.pop();
        }


        return data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stacks.size(); i++) {
            Stack<Integer> stack = stacks.get(i);
            for (int j = 0; j < stack.size(); j++) {
                sb.append(stack.get(j));
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
