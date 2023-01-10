package org.example.inflearn;
//그래프의 전위순회(부,왼,오) 중위순회(왼,부,오) 후위순회(왼,오,부)
public class Q0705 {

    //전위
    public void solution1(Node root) {
        if(root == null) return;
        System.out.println(root.data);
        solution1(root.lt);
        solution1(root.rt);
    }

    //중위
    public void solution2(Node root) {
        if(root == null) return;
        solution2(root.lt);
        System.out.println(root.data);
        solution2(root.rt);
    }

    //후위
    public void solution3(Node root) {
        if(root == null) return;
        solution3(root.lt);
        solution3(root.rt);
        System.out.println(root.data);
    }

    Node root;
    public static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt = rt = null;
        }
    }

}
