package Tree;

public class BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return Search(root.left, key);
        }
        return Search(root.right, key);
    }

    public static Node Insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (root.data > key) {
            root.left = Insert(root.left, key);
        } else {
            root.right = Insert(root.right, key);
        }
        return root;
    }

    public static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public static Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    public static Node FindParent(Node root, int key) {
        if (root == null) {
            return null;
        }
        if ((root.left != null && root.left.data == key) ||
                (root.right != null && root.right.data == key)) {
            return root;
        }
        if (root.data > key) {
            return FindParent(root.left, key);
        }
        return FindParent(root.right, key);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println("Initial BST (inorder):");
        inorder(root);
        System.out.println();

        System.out.println("Search 40: " + Search(root, 40));
        System.out.println("Search 100: " + Search(root, 100));

        System.out.println("\nInserting 100...");
        root = Insert(root, 100);
        inorder(root);
        System.out.println("\nSearch 100: " + Search(root, 100));

        System.out.println("\nFinding parent of 100:");
        Node parent = FindParent(root, 100);
        if (parent != null) {
            System.out.println("Parent of 100: " + parent.data);
        } else {
            System.out.println("Parent not found.");
        }

        System.out.println("\nDeleting 100...");
        root = delete(root, 100);
        inorder(root);
        System.out.println("\nSearch 100: " + Search(root, 100));
    }
}
