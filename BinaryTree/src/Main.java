public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.search(100);

        tree.search(20);

        tree.printTree();

        System.out.println("Nó raiz: " + tree.delete(50).data);

        tree.search(50);

        tree.insert(100);

        tree.insert(70);

        tree.printTree();
    }
}