package binaryTree;


import java.util.ArrayList;
import java.util.Stack;

public class preorder {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<Node>();
        preOrder(root,ans,st);
        System.out.println(ans);
    }
    static void preOrder(Node node,ArrayList<Integer> ans,Stack<Node> st)
    {
        //adding the root first
        st.push(node);
        while(!st.isEmpty())
        {
            //popping the stack top
            Node temp=st.pop();
            ans.add(temp.d);
            //pushing the right first so left comes first after root as it is stores is stack
            if(temp.right!=null)
            {
                st.push(temp.right);
            }

            //left becomes the top as right pushed first    root-right-left -->order in stack
            if(temp.left!=null)
            {
                st.push(temp.left);
            }
        }
    }
}
