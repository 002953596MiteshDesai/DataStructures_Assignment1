public class RotateList<T> {

    public void rotateListKTimes ( Node<T> head,int k ){

        for (int i = 0; i<k; i++){
            System.out.println(i);
            Node temp = head;
            //find second last element in list
            while (temp.next.next != null) {
                temp = temp.next;
            }
            //set 'Node move' to the last element
            Node move = temp.next;

            //change the end of the list -- make the second last element the last element
            temp.next = null;

            //change the head of the list -- make Node move the head of the list
            move.next = head;
            head = move;
        }


    }
}
