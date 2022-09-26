/* Assignment 1 for INFO 6205 Data Structures & Algo Fall 2022
submitted by Mitesh Desai , NUID 002953596
 */

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addNodeToTail(8);
        list.addNodeToTail(10);
        list.addNodeToTail(12);
        list.addNodeToTail(-3);
        list.addNodeToTail(-1);


        list.printList();
        System.out.printf(" The length of this list is " + list.length());
        System.out.println();
        /* Question 1 */
        list.rotateListKTimes(2);
        System.out.println(" The new list after rotating k times is  ");
        list.printList();
        System.out.println();
        /* Question2 */
        LinkList newList = list.removeElements(8);
        System.out.println(" The new list after removing node 8 is  ");
        newList.printList();
        /*Question 3*/
        list.swapNode(2);
        System.out.println(" The new list after swapping mode at k position is  ");
        list.printList();
        /*Quesition 4*/
        System.out.println(" The new lists after splitting into 3 are  ");
        LinkList[] split = list.splitListToParts(3);
        for (int i = 0; i < 3; i++) {
            split[i].printList();
        }
        /*Question 5 */
        /*testing with  multiple  node in the list */
        LinkList circularList = new LinkList();
        circularList.addNodeToTail(3);
        circularList.addNodeToTail(4);
        circularList.addNodeToTail(1);
        circularList.makeCicular();
        System.out.println(" Initial circular list  ");
        circularList.printCircularList();

        circularList.insertIntoSortedCircularList(circularList.head, 1);
        System.out.println(" The new Circular list after inserting is  ");
        circularList.printCircularList();


        /*testing with only one node in the list */
        LinkList circularList1 = new LinkList();
        circularList1.addNodeToTail(1);
        circularList1.makeCicular();
        System.out.println(" Initial circular list  ");
        circularList1.printCircularList();

        circularList1.insertIntoSortedCircularList(circularList1.head, 0);
        System.out.println(" The new Circular list after inserting is  ");
        circularList1.printCircularList();

        /*testing with only no node  in the list */
        LinkList circularList2 = new LinkList();
        circularList2.makeCicular();
        System.out.println(" Initial circular list  ");
        circularList2.printCircularList();

        circularList2.insertIntoSortedCircularList(circularList2.head, 1);
        System.out.println(" The new Circular list after inserting is  ");
        circularList2.printCircularList();
    }
}


