package stack;

public class Linkedlist_implementation {


    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    //Create a class for the stack
    static class stack{
        Node head;
        int size;
        stack()
        {
            head=null;
            size=0;
        }

        void push(int n)
        {
            Node temp=new Node(n);
            temp.next=head;
            head=temp;
            size++;
        }

        int top()
        {
            return head.data;
        }

        int pop()
        {
           if (head==null) return Integer.MAX_VALUE;
           int res=head.data;
           head=head.next;
           size--;
           return res;
        }
    }

    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);

        int top=st.top();
        System.out.println(top);
        System.out.println(st.pop());
        System.out.println(st.top());
    }
}
