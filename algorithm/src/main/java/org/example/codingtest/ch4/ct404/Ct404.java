package org.example.codingtest.ch4.ct404;

/**
 * 재귀적으로 순환하면서 각 노드에 대한 하위 트리의 높이를 계산한다
 * 각 노드에서 전체 하위 트리를 재귀적으로 탐색해
 * 같은 노드에 내해 getHeight가 반복적으로 발생한다.
 * -> getHeight 높이를 줄여야 한다
 *
 * O(NlogN)
 */
public class Ct404 {
    public boolean solution(Tree.Node root){
        if(root == null) return true;

        int dff = getHeight(root.left) - getHeight(root.right);
        if(Math.abs(dff)  >1) return false;
        return solution(root.left) && solution(root.right);
    }

    private int getHeight(Tree.Node root){
        if (root == null) return -1;
        return Math.max(getHeight(root.left),getHeight(root.right) )+1;
    }
}
