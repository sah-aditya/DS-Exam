package Tree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class TreeTraversal {
    Node root;

    // Preorder Traversal (Root -> Left -> Right)
    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();

        // Constructing the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        tree.postorder(tree.root);
        System.out.println();
    }
}
