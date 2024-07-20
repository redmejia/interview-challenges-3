package Node;

public class Node {
    public Node left;
    public Node right;
    public int item;

    public Node(int item){
        this.item = item;
    }

    public void preOrderPrint(){

        System.out.println(item);
        if (left != null) {
            left.preOrderPrint();
        }
        if (right != null) {
            right.preOrderPrint();
        }
    }

}

