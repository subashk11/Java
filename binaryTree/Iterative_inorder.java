package binaryTree;

//class to create tree node

import java.util.ArrayList;
import java.util.Stack;

/**class Node{
    int d;
    Node left,right;
    Node(int d)
    {
        this.d=d;
        left=null;
        right=null;
    }
} **/


public class Iterative_inorder {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<Node>();

        inorder(root,ans,st);
        System.out.println(ans);
    }

    static void inorder(Node node,ArrayList<Integer> ans,Stack<Node> st)
    {
        st.push(node);
        while(!st.isEmpty())
        {
            if(node!= null)
            {
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty()) break;
                node=st.pop();
                ans.add(node.d);
                node=node.right;
            }
        }
    }

}
