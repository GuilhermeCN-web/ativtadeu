class Node {
    private int info;
    private Node leftNode;
    private Node rightNode;

    public Node() {
    }

    public Node(int info) {
        this.info = info;
        this.leftNode = null;
        this.rightNode = null;
    }   
    public Node getLeftNode() {
        return leftNode;
    }
    
    public void setLeftNode(Node node) {
        this.leftNode = node;
    }

    public Node getRightNode() {
        return rightNode;
    }
    
    public void setRightNode(Node node) {
        this.rightNode = node;
    }
    
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public String toString() {
        return "" + this.getInfo();
    }
}