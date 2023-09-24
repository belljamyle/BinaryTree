public class BinaryTree {
    Node root;
    public BinaryTree() {
        root = null;
    }
    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        else {
            if (data < root.data) {
                root.left = insert(root.left, data);
            }
            else if (data >= root.data){
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public void search(int data) {
        if(search(root, data)) {
            System.out.println("Dado encontrado!");
        } else {
            System.out.println("Dado não encontrado!");
        }
    }

    public boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return search(root.left, data);
        }
        if (data > root.data) {
            return search(root.right, data);
        }
        else {
            return false;
        }
    }

    public Node delete(int data) {
        delete(root, data);
        return root;
    }
    public Node delete(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node parent = root;
                Node sucessor = parent.right;
                while(sucessor.left != null) {
                    parent = sucessor;
                    sucessor = sucessor.left;
                }
                System.out.println("Dado deletado: " + root.data);
                root.data = sucessor.data;
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    public void showTrunks(Trunk p) {
        if (p == null) {
            return;
        }

        showTrunks(p.prev);
        System.out.print(p.str);
    }

    public void printTree() {
        printTree(root, null, false);
    }

    public void printTree(Node root, Trunk prev, boolean isLeft) {
        if (root == null) {
            return;
        }

        String prev_str = "    ";
        Trunk trunk = new Trunk(prev, prev_str);

        printTree(root.right, trunk, true);

        if (prev == null) {
            trunk.str = "———";
        } else if (isLeft) {
            trunk.str = ".———";
            prev_str = "   |";
        } else {
            trunk.str = "`———";
            prev.str = prev_str;
        }

        showTrunks(trunk);
        System.out.println(" " + root.data);

        if (prev != null) {
            prev.str = prev_str;
        }
        trunk.str = "   |";

        printTree(root.left, trunk, false);
    }
}
