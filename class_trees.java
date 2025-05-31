//Write a program for Traversal over pre-order, in-order and post order, level-order. Find height of the tree and sum of all nodes in the tree.
import java.util.*;

class node {
    int data;
    node left, right;

    node(int data) {
        this.data = data;
        left = right = null;
    }
}
//Node part end here.

public class class_trees {
    static node root;

    class_trees() {
        root = null;
    }

    static void preOrder(node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelOrder(node root) {
        if (root == null)
            return;
        Queue<node> qt = new LinkedList<>();
        qt.add(root);

        while (!qt.isEmpty()) {
            node current = qt.poll();
            System.out.print(current.data + " ");
            if (current.left != null)
                qt.add(current.left);
            if (current.right != null)
                qt.add(current.right);
        }
    }

    static void spiralOrder(node root) {
        if (root == null) return;

        Queue<node> queue = new LinkedList<>();
        boolean leftToRight = true;

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                node current = queue.poll();
                level.add(current.data);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }

            for (int val : level) {
                System.out.print(val + " ");
            }

            leftToRight = !leftToRight;
        }
    }

    static int height(node root) {
        if (root == null)
            return -1;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    static int sumOfNodes(node root) {
        if (root == null)
            return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void main(String[] args) {
        root = new node(10);
        root.left = new node(11);
        root.right = new node(12);
        root.left.left = new node(13);
        root.left.right = new node(14);
        root.right.left = new node(15);
        root.right.right = new node(16);
        root.left.left.left = new node(17);
        root.left.left.right = new node(18);
        root.left.right.left = new node(19);
        root.left.right.right = new node(20);
        root.right.left.left = new node(21);
        root.right.left.right = new node(22);
        root.right.right.left = new node(23);
        root.right.right.right = new node(24);

        System.out.println("Traversal using Pre-Order:");
        preOrder(root);
        System.out.println();

        System.out.println("Traversal using In-Order:");
        inOrder(root);
        System.out.println();

        System.out.println("Traversal using Post-Order:");
        postOrder(root);
        System.out.println();

        System.out.println("Traversal using Level-Order:");
        levelOrder(root);
        System.out.println();

        System.out.println("Height of the tree: ");
        System.out.println(height(root));

        System.out.println("Sum of all nodes in the tree: ");
        System.out.println(sumOfNodes(root));
    }
}
