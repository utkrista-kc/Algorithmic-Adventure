// hackerrank 

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /*
     * 
     * class Node
     * int data;
     * Node left;
     * Node right;
     */
    public static void topView(Node root) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Queue<Node> queueNodes = new LinkedList<>();
        Queue<Integer> queueHd = new LinkedList<>();
        queueNodes.add(root);
        queueHd.add(0);
        while (!queueNodes.isEmpty()) {
            Node currNode = queueNodes.remove();
            int nodeHd = queueHd.remove();

            if (!treeMap.containsKey(nodeHd)) {
                treeMap.put(nodeHd, currNode.data);
            }

            if (currNode.left != null) {
                queueNodes.add(currNode.left);
                queueHd.add(nodeHd - 1);
            }
            if (currNode.right != null) {
                queueNodes.add(currNode.right);
                queueHd.add(nodeHd + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}