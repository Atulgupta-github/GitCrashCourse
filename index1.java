class Student{
    
    public static void main(String []args){


        //implement LinkedList
        Node head = new Node(10);

        head.next = new Node (20);
        head.next.next = new Node(30);

         

    }
}

class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
        next= null;
    }
}