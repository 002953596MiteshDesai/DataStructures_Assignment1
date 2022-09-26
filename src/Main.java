public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addNodeToTail(8);
        list.addNodeToTail(10);
        list.addNodeToTail(12);
        list.addNodeToTail(-3);
        list.addNodeToTail(-1);



        list.printList();
        System.out.printf( " The length of this list is " +  list.length());
        System.out.println();
        list.rotateListKTimes( 2);
        System.out.println( " The new list after rotating k times is  " );
        list.printList();
        System.out.println();
        LinkList newList = list.removeElements(8);
        System.out.println( " The new list after removing node 8 is  " );
        newList.printList();
        list.swapNode(2);
        System.out.println( " The new list after swapping mode at k position is  " );
        list.printList();
        System.out.println( " The new lists after splitting into 3 are  " );
        LinkList[] split = list.splitListToParts(3);
        for(int i = 0; i < 3; i ++){
            split[i].printList();
        }

        LinkList circularList = new LinkList();
        circularList.addNodeToTail(3);
        circularList.addNodeToTail(4);
        circularList.addNodeToTail(1);
        circularList.makeCicular();
        System.out.println( " Initial circular list  " );
        circularList.printCircularList();

        circularList.insertIntoSortedCircularList(circularList.head, 2);
        System.out.println( " The new Circular list after inserting is  " );
        circularList.printCircularList();

    }


}
