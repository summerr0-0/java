package org.example.codingtest.ch4.ct404;

/**
 * 트리의 루트부터 재귀적으로 하위트리 탐색
 * 각 노드에서 왼쪽하위트리와 오른쪽 하위 트리의 높이를 구한다
 * 균형잡힌 경우 하위 트리의 높이 반환
 * 균형잡히지 않은 경우 에러 반환
 */
public class Ct404_v2 {
    public boolean solution(Tree.Node root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    private int checkHeight(Tree.Node root) {
        if (root == null) return -1;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) return Integer.MIN_VALUE;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
