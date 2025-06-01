//Write a program to find the least common ancestor in a tree.
public class find_LCA {  // BST

    static node findLCA(node root, int n1, int n2) {
        if (root == null)
            return null;

        if (n1 < root.data && n2 < root.data)
            return findLCA(root.left, n1, n2);
        else if (n1 > root.data && n2 > root.data)
            return findLCA(root.right, n1, n2);
        else
            return root;
    }

    static void inOrder(node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        node root = new node(10);
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

        System.out.println("In-order traversal of BST:");
        inOrder(root);
        System.out.println();

        int n1 = 5, n2 = 15;
        node lca = findLCA(root, n1, n2);
        System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + ": " +
                (lca != null ? lca.data : "Not found"));
    }
}
