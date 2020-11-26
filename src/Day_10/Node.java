package Day_10;

import java.util.ArrayList;

public class Node {
    private int val;
    private Node leftNode;
    private Node rightNode;
    private Node parNode;
    private static Node rootNode;

    public Node(int val) {
        this.val = val;
        if(rootNode == null) {
            rootNode = this;
            rootNode.parNode = this;
        } else {
            rootNode.insertNode(this);
        }
    }

    public static Node getRootNode() {
        return rootNode;
    }

    public int getVal() {
        return val;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public Node getParNode() {
        return parNode;
    }

    public void setParNode(Node parNode) {
        this.parNode = parNode;
    }

    public void insertNode(Node node){
        //System.out.println("Here");
        //System.out.println("Here " + this.getVal() + " " + node.getVal());
        if (this.getVal() > node.getVal()) {
            //System.out.println("less");
            if (this.leftNode != null) {
                this.leftNode.insertNode(node);
            } else {
                this.leftNode = node;
                this.leftNode.setParNode(this);
            }
        } else {
            if (this.rightNode != null) {
                this.rightNode.insertNode(node);
            } else {
                this.rightNode = node;
                this.rightNode.setParNode(this);
            }
        }
    }
    public void printNodeInfo() {
        System.out.print("Value: " + this.getVal() + "| ");
        if (this.leftNode != null) {
            System.out.print("Left Value: " + this.leftNode.getVal() + "| ");
        } else {
            System.out.print("No Left Value| ");
        }
        if (this.rightNode != null) {
            System.out.print("Right Value: " + this.rightNode.getVal() + "| ");
        } else {
            System.out.print("No Right Value| ");
        }
        System.out.print("Parent: " + this.getParNode().getVal());
        System.out.println();
    }
    public static void getTree(){
        ArrayList<Node> parNodes = new ArrayList();
        ArrayList<Node> childNodes = new ArrayList();
        Node parNode = rootNode;
        Node childNode;
        parNodes.add(parNode);
        parNode.printNodeInfo();
        //System.out.println(parNodes.size());
        while (true) {
            for (int i = 0; i < parNodes.size(); i++) {
                parNode = parNodes.get(i);
                childNode = parNode.getLeftNode();
                if (childNode != null) {
                    childNodes.add(childNode);
                }
                childNode = parNode.getRightNode();
                if (childNode != null) {
                    childNodes.add(childNode);
                }
            }
            if(childNodes.size()>0) {
                for (int i = 0; i < childNodes.size(); i++) {
                    childNodes.get(i).printNodeInfo();
                }
                parNodes = (ArrayList<Node>)childNodes.clone();
                childNodes.clear();
            } else {
                System.out.println("no childs");
                break;
            }
        }

    }

    public static void sortTree() {
        System.out.println(getNodeVals2(rootNode));
    }
/*
    public static String getNodeValsOld(Node node) {
        String string = "";
        String leftString = "";
        String rightString = "";
        if (node.getLeftNode() != null || node.getRightNode() != null) {
            if (node.getLeftNode() != null) {
                leftString =getNodeVals2(node.getLeftNode()) + " ";
            }
            if (node.getRightNode() != null) {
                rightString = " " + getNodeVals2(node.getRightNode()) ;
            }
            string = leftString + node.getVal() + rightString;
        } else {
            string = string + node.getVal();
        }
        return string;
    }

 */

    public static String getNodeVals2(Node node) {
        String string = "";
        if (node != null) {
            string = getNodeVals2(node.getLeftNode()) + node.getVal() + " " + getNodeVals2(node.getRightNode());
        }
        return string;
    }

    /*
    public static String getNodeVals(Node node){
            if (node.getLeftNode() != null) {
                node.getNodeVals(node.getLeftNode());
            }
            if (node.getRightNode() != null) {
                node.getNodeVals(node.getRightNode());
            }
            System.out.print(node.getVal() + " ");

        if (node.getLeftNode() != null) {
            node.getNodeVals(node.getLeftNode());
        } else {
            System.out.print(node.getVal() + " ");
        }
        if (node.getRightNode() != null) {
            node.getNodeVals(node.getRightNode());
        } else {
            System.out.print(node.getVal() + " ");
        }


    }
    */
}
