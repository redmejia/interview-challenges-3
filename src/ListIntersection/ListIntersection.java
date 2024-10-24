package ListIntersection;


/*
List Intersection
Given the reference to two linked lists, return the node at which they intersect.
Note: If the two lists never intersect, return null.

Ex: Given the following linked lists...

A: A1->A2
          \
           C1->C2->C3
          /
B: B1->B2
return a reference to node C1.

Time Complexity:  O(n+m) where n is the len of list A and m is the len of list B.
In worst case ptrA and ptrB will traverse both list exactly once.
First, pointer ptrA will traverse list A, and once it reaches the end, it will start traversing list B.
Similarly, pointer ptrB will traverse list B, and after reaching the end, it will start traversing list A.

Space Complexity: O(1) because this solution uses two point ptrA and ptrB

 */

public class ListIntersection {

    public static NodeList listIntersection(NodeList headA, NodeList headB) {
        if (headA == null || headB == null) return null;

        NodeList ptrA = headA;
        NodeList ptrB = headB;

        while (ptrA != ptrB) {

            if (ptrA == null) {
                ptrA = headB;
            } else {
                ptrA = ptrA.next;
            }

            if (ptrB == null) {
                ptrB = headA;
            } else {
                ptrB = ptrB.next;
            }
        }

        return ptrA;
    }

    public static void main(String[] args) {
        // Intersection test case
        // List A: 1 -> 2 -> 3 -> 4 -> 5
        NodeList nodeA1 = new NodeList(1);
        nodeA1.next = new NodeList(2);
        nodeA1.next.next = new NodeList(3);
        nodeA1.next.next.next = new NodeList(4);
        nodeA1.next.next.next.next = new NodeList(5);

        // List B: 9 -> 4 -> 5 (B intersects with A at node with item 4)
        NodeList nodeB1 = new NodeList(9);
        nodeB1.next = nodeA1.next.next.next; // Pointing to node 4 in List A

        NodeList intersection = listIntersection(nodeA1, nodeB1);
        if (intersection == null) {
            System.out.println("Not intersection");
        } else {
            System.out.println(intersection.item);
        }
    }
}
