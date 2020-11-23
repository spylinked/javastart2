package Day_10;

public class Task_1 {
    public static void main(String[] args) {
        int[] nodes = new int[]{20,14,23,11,16,22,27,5,15,18,24,150,8};
        for (int i = 0; i < nodes.length; i++) {
            new Node(nodes[i]);
        }
        Node.getTree();
        Node.sortTree();
        //Node.getNodeVals(Node.getRootNode());
    }
}
