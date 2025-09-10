public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void add(Node node) {
        if (node == null) return;
        if (root == null) {
            root = node;
        } else {
            addRecursive(root, node);
        }
    }

    private void addRecursive(Node current, Node node) {
        // Duplicatas sempre à esquerda
        if (node.getInfo() <= current.getInfo()) {
            if (current.getLeftNode() == null) {
                current.setLeftNode(node);
            } else {
                addRecursive(current.getLeftNode(), node);
            }
        } else {
            if (current.getRightNode() == null) {
                current.setRightNode(node);
            } else {
                addRecursive(current.getRightNode(), node);
            }
        }
    }

    public void showFullyParenthesizedForm() {
        System.out.println(getFullyParenthesizedForm(root));
    }

    private String getFullyParenthesizedForm(Node node) {
        if (node == null) {
            return "()";
        }

        String left = getFullyParenthesizedForm(node.getLeftNode());
        String right = getFullyParenthesizedForm(node.getRightNode());

        return node.getInfo() + "(" + left + ")(" + right + ")";
    }
}