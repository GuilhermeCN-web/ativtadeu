public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(new Node(50));
        tree.add(new Node(25));
        tree.add(new Node(12));
        tree.add(new Node(7));
        tree.add(new Node(3));
        tree.add(new Node(3));
        tree.add(new Node(2));
        tree.add(new Node(1));
        tree.add(new Node(27));
        tree.add(new Node(33));
        tree.add(new Node(75));
        tree.add(new Node(66));
        tree.add(new Node(88));

        tree.showFullyParenthesizedForm();
    }
}