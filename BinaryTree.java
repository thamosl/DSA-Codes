public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    BinaryTree(int data){
        root = new Node(data);
    }

    static void insertleft(Node node, int data){
        node.left = new Node(data);
    }

    static void insertright(Node node, int data){
        node.right = new Node(data);
    }

    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        BinaryTree.insertleft(tree.root, 2);
        BinaryTree.insertright(tree.root, 3);
        BinaryTree.insertleft(tree.root.right, 7 );
        BinaryTree.insertright(tree.root.right, 8);

        BinaryTree.preorder(tree.root);
        System.out.println();
        BinaryTree.inorder(tree.root);
        System.out.println();
        BinaryTree.postorder(tree.root);
        System.out.println();
    }
}

