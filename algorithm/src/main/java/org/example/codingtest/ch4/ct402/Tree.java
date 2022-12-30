package org.example.codingtest.ch4.ct402;

//최소트리:오름차순으로정렬된배열이 있다.
// 이 배열안에들어 있는 원소는 정수이며 중복된 값이 없다고 했을 때
// 높이가 최소가 되는 이진 탐색 트리를 만드는 알고리즘을 작성하라.
public class Tree {
    int count;

    public Tree() {
        this.count = 0;
    }

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public void addLeft(TreeNode treeNode) {
            this.left = treeNode;
            count++;
        }

        public void addRight(TreeNode treeNode) {
            this.right = treeNode;
            count++;
        }

        public void deleteLeft() {
            this.left = null;
            count--;
        }

        public void deleteRight() {
            this.right = null;
            count--;
        }
    }

    public TreeNode addNode(int data) {
        TreeNode n = new TreeNode(data);
        return n;
    }

    public TreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    private TreeNode createMinimalBST(int arr[], int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr,start,mid-1);
        n.right = createMinimalBST(arr,mid,end);
        return n;
    }
}
