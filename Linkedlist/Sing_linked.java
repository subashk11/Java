package Linkedlist;

public class Sing_linked {

    //create a class for linked list node

        //create a head node for the linked list

        Node head;

        //create a node class
        static class Node{

            //Create variables that hold the data and address of the next item
            int data;
            Node next;

            //Create a constructor to create or assign values to the variables
            Node(int d)
            {
                data=d;
                next=null;
            }
        }

        //Add a new item to the beginning of the linked list.
        void push(int data)
        {
            //Create a new node for the given data.
            Node newNode=new Node(data);

            //Make the next of the new node to point to the previous head in the linked list
            newNode.next=head;

            //make the new head as newNode
            head=newNode;
        }

        //To add a node after the given previous node
        void previous(Node prev,int data)
        {
            //Check if the given previous node is null
            if(prev==null) {
                System.out.println("The given previous node cannot be null ! ");
                return ;
            }
            //Create a new node
            Node newNode=new Node(data);
            //Make the next node of the given previous node to the next of the newNode
            newNode.next=prev.next;
            //Make the next of the previous node to the newNode.
            prev.next=newNode;
        }

        //To add a node to the last of the linkedlist
        void append(int data)
        {
            //create a new node
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                return ;
            }
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newNode;
            return ;
        }


        //Printing the elements in the linked list
        void printList(Node head)
        {
            if(head==null) return;
            Node curr=head;
            while(curr!=null)
            {
                System.out.println(curr.data+" ");
                curr=curr.next;
            }
        }

        //Deleting a node
        void deleteNode(int key)
        {
            Node temp=head;
            Node prev=null;
            //If the head itself has the key change the head to the next node and remove the head node
            if(temp!=null && temp.data==key)
            {
                head=temp.next;
                return;
            }
            //Moves the temp to the next item and the previous to temp until the key is not found
            if(temp!=null && temp.data!= key)
            {
                prev=temp;
                temp=temp.next;
            }
            //If the key is not present in the linked list
            if (temp==null)
            {
                return ;
            }
            prev.next=temp.next;

        }


    public static void main(String[] args) {

        //create a constructor for the node
      Sing_linked llist=new Sing_linked();
      llist.head=new Node(10);
      Node second =new Node(20);
      Node third =new Node(30);

      llist.head.next=second;
      second.next=third;

      llist.push(5);
      llist.previous(second,25);
      llist.append(40);

      llist.deleteNode(5);

      System.out.println("\nThe linked list after deletion of the key 5 :");
      llist.printList(llist.head);
    }


}
