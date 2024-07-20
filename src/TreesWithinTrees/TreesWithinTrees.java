package TreesWithinTrees;


import Node.Node;


/*
 Given two trees s and t return whether or not t is a subtree of s.
Note: For t to be a subtree of s not only must each node’s value in t match its corresponding node’s value in s,
but t must also exhibit the exact same structure as s. You may assume both trees s and t exist.

Ex: Given the following trees s and t…

s = 1
   / \
  3   8
t = 1
     \
      8
return false
Ex: Given the following trees s and t…

s = 7
   / \
  8   3
t = 7
   / \
  8   3
return true

Time Complexity: O(m * n), where m is the number of nodes in tree s and n is the number of nodes in tree t.
Space Complexity: O(m + n), due to the recursion depth of the function calls.
 */
public class TreesWithinTrees {

    public static boolean isSubtree(Node nodeOne, Node nodeTwo) {
        if (nodeOne == null)
            return false;

        if (areIdentical(nodeOne, nodeTwo))
            return true;

        return isSubtree(nodeOne.left, nodeTwo) || isSubtree(nodeOne.right, nodeTwo);
    }

    public static boolean areIdentical(Node nodeOne, Node nodeTwo) {

        if (nodeOne == null && nodeTwo == null) {
            return true;
        }
        if (nodeOne == null || nodeTwo == null) {
            return false;
        }

        if (nodeOne.item != nodeTwo.item) {
            return false;
        }

        return areIdentical(nodeOne.left, nodeTwo.left) && areIdentical(nodeOne.right, nodeTwo.right);

    }

    public static void main(String[] args) {
/*
            nodeOne =   7
                       / \
                      8   3
            nodeTwo =   7
                       / \
                      8   3
 */
        Node nodeOne = new Node(7);
        nodeOne.left = new Node(8);
        nodeOne.right = new Node(3);

        nodeOne.preOrderPrint();


        Node nodeTwo = new Node(7);
        nodeTwo.left = new Node(8);
        nodeTwo.right = new Node(3);

        nodeTwo.preOrderPrint();

        System.out.println(isSubtree(nodeOne, nodeTwo));


    }
}
