package model;

public class Node {
    public int data;
    public Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }


    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public int getData() {
        return data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     *
     * @param data value to be assigned to property data
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Getter method for property <tt>left</tt>.
     *
     * @return property value of left
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Setter method for property <tt>left</tt>.
     *
     * @param left value to be assigned to property left
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Getter method for property <tt>right</tt>.
     *
     * @return property value of right
     */
    public Node getRight() {
        return right;
    }

    /**
     * Setter method for property <tt>right</tt>.
     *
     * @param right value to be assigned to property right
     */
    public void setRight(Node right) {
        this.right = right;
    }
}