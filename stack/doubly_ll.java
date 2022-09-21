package stack;

public class doubly_ll {
    Node head;
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }
        void insertPrev(int d)
        {
            Node temp=new Node(d);
            if(head==null)
            {
                head=temp;
                return ;
            }
            else{
                head.prev=temp;
                temp.next=head;
                head=temp;
            }
        }


    public static void main(String[] args) {
        doubly_ll dll=new doubly_ll();
        dll.head=new Node(5);
        dll.insertPrev(4);
    }
}
