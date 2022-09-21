package Linkedlist;

public class Circular_linkedlist {

    //create a head node
    Node head;

    //create Node class to create a new node
    static class Node{

        //create variables to store the data and the address of the next data item.
        int data;
        Node next;

        //Creating constructor to store the values
        Node(int d) {
            data = d;
            next = null;
        }
    }

    //Circular linked list traversal
    static  void Printlist(Node head)
    {
        if(head==null) return ;
        Node temp=head;
        System.out.println(temp.data+" ");
        for(temp=head.next;temp!=head;temp=temp.next)
        {
            System.out.println(temp.data+" ");
        }
    }


    //To add a node to the beginning of the linked list
    Node insertBegin(Node head,int data)
    {
        //create a new node for the data
        Node newNode=new Node(data);

        //checks the head is null
        if(head==null)
        {
            //If the head is null make the node as head and return it.
            newNode.next=newNode;
            return newNode;
        }else{
            //change the next of new node to the next of head node
            newNode.next=head.next;
            //change the next of head node to new node
            head.next=newNode;
            //create a temp variable to hold the value of the head
            int temp=head.data;
            //change the value of the head to new node value
            head.data= newNode.data;
            //assign the new node data to temp data
            newNode.data=temp;
            //return the head as the new data is copied to the head data.
            return head;
        }

    }

    //To insert a node to the end of the Circular-linkedlist
    Node insertEnd(Node head,int data)
    {
        //Create new node
        Node newNode=new Node(data);

        //check if the head is empty make the new node as empty and return it.
        if(head==null)
        {
            newNode.next=newNode;
            return newNode;
        }else{
            //same as the insert begin but here we return new node as head
            newNode.next=head.next;
            head.next=newNode;
            int temp= newNode.data;;
            newNode.data=head.data;
            head.data=temp;
        }
        return newNode;
    }

    //delete at the head of the circular linked list
    Node deleteHead(Node head)
    {
        //Efficient solution
        if(head.next==null) return null;
        if(head==null) return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    //To delete a k-th node from the circular linked list
    Node deleteKth(Node head,int k)
    {
        //check whether the k-th node is the head node itself
        if(k==1)
        {
            deleteHead(head);
            return head.next;
        }
        else {
            Node curr=head;
            for (int i = 0; i < k-2; i++) {
                curr=curr.next;
            }

            //changing the next of curr to curr.next.next
            curr.next=curr.next.next;
            return head;
        }
    }
    public static void main(String[] args) {
        Circular_linkedlist Llist=new Circular_linkedlist();
        Llist.head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);

        Llist.head.next=second;
        second.next=third;
        third.next=Llist.head;

        Node newNode=Llist.insertBegin(Llist.head,5);
        Node new1= Llist.insertEnd(Llist.head, 40);
        Llist.deleteHead(new1);
        Llist.deleteKth(new1,3);
        Printlist(new1);

    }
}
