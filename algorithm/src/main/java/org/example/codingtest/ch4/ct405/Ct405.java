package org.example.codingtest.ch4.ct405;

/**
 * 이진 탐색 트리의 조건
 * 왼쪽의 모든 노드 <= 현재 노드
 * 오른쪽의 모든 노드 > 현재 노드
 *
 * 다음과 같은 이진 트리가 있다면
 *
 *               20
 *         10          30
 *     5      15
 *   3   7       17
 *
 *   20 : 루트는 min = Null, max = null
 *   10 : 10은 min = null, max = 20 범위 안에 있어야 한다
 *
 *   5 : 5는 min = null, max = 10 범위 안에 있어야 한다.
 *
 *   3 : 3은 min = null, max = 5 범위 안에 있어야 한다
 *   7 : 7은 min = 5, max = 10 범위 안에 있어야 한다.
 *
 *   15 : 15는 min = 10, max = 20 범위 안에 있어야 한다.
 *   17 : 17은 min = 15, max = 20 범위 안에 있어야 한다.
 *
 *   30 : 30은 min = 20, max = null 의 범위 안에 있어야 한다.
 *
 *  왼쪽으로 분기하면 max를 갱신하고
 *  오른쪽으로 분기하면 Min을 갱신한다
 *
 *  범위에 어긋나면 바로 false 를 반환한다.
 *
 */
public class Ct405 {
    public boolean solution(Tree.Node node) {
        //루트노드부터 시작한다.
        return checkBST(node, null, null);
    }

    private boolean checkBST(Tree.Node node, Integer min, Integer max) {
        if (node == null) return true;
        //범위에 어긋나면 바로 false
        if ((min != null && node.data <= min) || (max != null && node.data > max)) return false;
        //범위 갱신
        // 왼쪽 : max 갱신
        // 오른쪽 : Min 갱신
        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
    }
}
