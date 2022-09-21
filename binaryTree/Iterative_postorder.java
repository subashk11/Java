package binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Iterative_postorder {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<Node>();
        postOrder(root,ans,st);
        System.out.println(ans);
    }
    //function to traverse through the tree using post-order
    public static void postOrder(Node current,ArrayList<Integer> ans,Stack<Node> st1)
    {
        //Traverse through the entire left from root
        while(current != null || !st1.isEmpty()) {
            if(current != null){
                st1.push(current);
                current = current.left;
            }else{
                Node temp = st1.peek().right;
                if (temp == null) {
                    temp = st1.pop();
                    ans.add(temp.d);
                    while (!st1.isEmpty() && temp == st1.peek().right) {
                        temp = st1.pop();
                        ans.add(temp.d);
                    }
                } else {
                    current = temp;
                }
            }
        }
    }
}
