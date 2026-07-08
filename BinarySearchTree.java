public class BinarySearchTree {
    public class Node{
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

    BinarySearchTree(int data){
        root = new Node(data);
    }

    public void insert(Node root, int data){
        if(root.data > data){
            if(root.left == null){
                root.left = new Node(data);
            }
            else{
                insert(root.left, data);
            }
        }
        else{
            if(root.right == null){
                root.right = new Node(data);
            }
            else{
                insert(root.right, data);
            }
        }
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public Node Search(Node root, int data){
        if(root == null){
            System.out.print("\n Not found");
            return null;
        }
        if(root.data == data){
            System.out.print("\n Found");
            return root;
        }
        if(root.data > data){
            return Search(root.left, data);
        }
        return Search (root.right, data);
    }

    public void delete(int data){
        root = delete(root, data);
    }

    public Node delete(Node root, int data){
        if(root == null){
            return null;
        }
        else if(root.data < data){
            root.right = delete(root.right, data);
        }
        else if(root.data > data){
            root.left = delete(root.left, data);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            else{
                root.data = min(root.right);
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    public int min(Node root){
        while(root.left!= null){
            root = root.left;
        }
        return root.data;
    }


    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree(5);
        tree.insert(tree.root, 2);
        tree.insert(tree.root, 1);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 7);
        tree.insert(tree.root, 9);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 6);

        tree.inorder(tree.root);

        System.out.println();

        tree.delete(5);
        tree.inorder(tree.root);
        System.out.println();
        System.out.println(tree.root.data);

    }
}


