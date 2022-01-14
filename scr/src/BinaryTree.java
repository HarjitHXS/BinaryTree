public class BinaryTree {
    static Node root;
    static Node currentNode = root;

    private static class Node {
        int key;
        Node left;
        Node right;

        private Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    public static void insert(Node temp, int key) {

        if (temp == null) {
            root = new Node(key);
        } else {
            currentNode = temp;
            while (currentNode != null) {
                if (key < currentNode.key) {
                    if (currentNode.left == null) {
                        currentNode.left = new Node(key);
                        currentNode = null;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = new Node(key);
                        currentNode = null;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }
    }

    public static void inorder(Node temp) {
        if (temp == null)
            inorder(temp.left);
        System.out.println(temp.key + " ");
        inorder(temp.right);
    }

    public static void main(String args[]) {
        root = new Node(10);
        insert(root,12);
        inorder(root);
    }
}