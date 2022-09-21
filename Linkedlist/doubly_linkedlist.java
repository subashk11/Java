package Linkedlist;

public class  doubly_linkedlist {

    //Create the head node
    Node head;

    static class Node{

        //Assigning the variables to hold the values of the node
        //To hold the reference of the prev and next node

        int data;
        Node next;
        Node prev;

        //Create a constructor to create a node.
        Node(int d)
        {
            data=d;
            prev=next=null;
        }
    }

    //To insert a new node in the beginning of the doubly linked list
    void push(int data)
    {
        //Create a new node for the data
        Node newNode=new Node(data);
        if (head==null)
        {
            head=newNode;
            return ;
        }
        //Make the prev of head node as new node
        head.prev=newNode;
        //make the next of newNode as head and prev of newNode as null
        newNode.next=head;
        //make the new node as head.
        head=newNode;
    }

    //To insert a node after a given node.
    void insertAfter(Node preNode,int data)
    {
        //return if the prev node is null
        if(preNode==null) return ;
        //create a new node
        Node newNode=new Node(data);
        //make the next of new node as prev node next
        newNode.next=preNode.next;
        //make the next of the previous node to the new node
        preNode.next=newNode;
        //make the previous reference o
        newNode.prev=preNode;
        if(newNode.next!=null)
        {
            preNode.next.prev=newNode;
        }

    }

    //Insert a node before the given node
    void insertBefore(Node before,int data)
    {
        //if the given node does not exist return and do nothing
        if(before==null) return;
        //other wise create a node for the data
        else {
            Node newNode=new Node(data);
            //make the prev of the before node to the prev of new node
            newNode.prev=before.prev;
            //make the previous of the before node to the new node.
            before.prev=newNode;
            //make the next of the new node points to the before node
            newNode.next=before;
            if (newNode.prev!=null)
            {
                newNode.prev.next=newNode;
            }else{
                head=newNode;
            }
            return;
        }

    }


    //Traversal of doubly linked list
    void printList(Node head)
    {
        //if head is null return
        if (head==null) return;
        //make a reference node that can traverse to the end of the linked list
        Node curr=head;
        while (curr!=null)
        {
            System.out.println(curr.data+" ");
            curr=curr.next;
        }

        return ;
    }
    public static void main(String[] args) {
        doubly_linkedlist newList=new doubly_linkedlist();
        newList.head=new Node(1);
        newList.push(3);
        newList.push(5);
        newList.insertAfter(newList.head.next, 4);
        newList.insertBefore(newList.head.next, 2);
        newList.printList(newList.head);
    }
}
