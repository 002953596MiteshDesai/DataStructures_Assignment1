public class LinkList < T > {
    public Node head;
    public Node tail;
    public LinkList(){
        head = null ;
    }
    public void addNodeToHead(T data){
        Node addNode = new Node(data);
        addNode.next = head;
        head = addNode;
    }

    public void addNodeToTail(T data){
        Node addNode = new Node(data);
        if (head == null) {
            head = addNode;
            return;
        }
        Node temp = head ;
          while (temp.next != null) {
              temp= temp.next;
              }
          temp.next= addNode;
          return;
        }

      public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node temp = head;
        while (temp != null){
            System.out.printf(temp.data + " -> ");
            temp = temp.next;
    }
        System.out.println("NULL");

}
       public int length() {
           if (head == null) {
               return 0;
           }
           //traverse list
           Node temp = head;
           int i =0;
           while (temp != null) {
               i++;
               //need the following line to avoid infinite loop
               temp = temp.next;
           }
           return i;
       }

    public void rotateListKTimes ( int k ){

        for (int i = 0; i<k; i++) {
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


    public LinkList<T> removeElements(T val){
        LinkList newList = new LinkList<T>();

        Node temp = head;
        while(temp != null){
            if (temp.data != val){
                newList.addNodeToTail(temp.data);
            }
            temp = temp.next;
        }

       /* return newList;*/
        return newList;

    }

    public void swapNode (int k) {
        Node temp = head;
        int i = 0;
        T kData = null;
        while (temp != null) {
            i++;
            if (i == k) {
                kData = (T) temp.data;
            }
            //need the following line to avoid infinite loop
            temp = temp.next;
        }

        int kFromEnd =  length()-k+1;
        temp = head;
        i = 0;
        T k2Data = null;
        while (temp != null) {
            i++;
            if (i == kFromEnd) {
                k2Data = (T) temp.data;
            }
            //need the following line to avoid infinite loop
            temp = temp.next;
        }

        temp = head;
        i = 0;
        while (temp != null) {
            i++;
            if (i == k) {
                temp.data = k2Data;
            }
            if (i == kFromEnd) {
                temp.data = kData;
            }
            //need the following line to avoid infinite loop
            temp = temp.next;
        }


    }
    public LinkList[] splitListToParts( int k) {
        int width = length() / k;
        int rem = length() % k;
        int[] sizes = new int[k];
        for(int i = 0; i  < k; i++){
            sizes[i] =  width + (i < rem ? 1 : 0);
            //System.out.println(sizes[i]);
        }


        Node temp = head;
        int currlen = 0;

        LinkList currentList = new LinkList();
        int k_iter = 0;

        LinkList[] answer = new LinkList[k];

        while (temp != null) {
            currlen =  currentList.length();

            if (currlen == sizes[k_iter]){
                //System.out.println(temp.data);
                answer[k_iter] = currentList;

                k_iter++;
                currentList = new LinkList();

                //System.out.print("here");
            }
            currlen =  currentList.length();
            if (currlen < sizes[k_iter]){
                T val = (T) temp.data;
                //System.out.println(val);
                currentList.addNodeToTail(val);
                //currentList.printList();
            }
            temp = temp.next;
        }
        answer[k_iter] = currentList;
        return answer;



        /*LinkList newList = new LinkList<T>();

        Node temp = head;

        int N = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }

        int width = N / k, rem = N % k;
        Node ans = new Node( k)
        temp = head ;

        for (int i = 0; i < k; ++i) {
            Node head = new Node(0), write = head;
            for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
                write = write.next = new Node(temp.data);
                if (temp != null) temp = temp.next;
            }
            ans[i] = head.next;

        }}*/
    }
    public void makeCicular(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
    }

    public void printCircularList() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node temp = head;

        do{
            System.out.printf(temp.data + " -> ");
            temp = temp.next;
        }while(temp!=head);

        System.out.println();



    }

    public void insertIntoSortedCircularList(Node head, int val2 ) {
        /*LinkList newList = new LinkList<T>();*/

        Node Prev = head;
        Node temp = head.next;
        boolean flag = false;


        while(temp != null && temp != head && flag != true){
            if (val2 > (int) Prev.data && val2 <= (int) temp.data){
                Node addNode = new Node(val2);
                addNode.next = temp;
                Prev.next = addNode;
                flag = true;
            }
            Prev = temp;
            temp = temp.next;
        }

        if (flag != true){
            Node addNode = new Node(val2);
            addNode.next = temp;
            Prev.next = addNode;
            flag = true;
        }

        /* return newList;*/



    }
}