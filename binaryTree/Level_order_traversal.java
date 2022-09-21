package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Level_order_traversal {
    //It is also called as BFS breadth first search
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        Queue<Node> q=new LinkedList<Node>();
        ArrayList<Integer> ans=new ArrayList<>();

        levelOrder(root,q,ans);
        System.out.println(ans);
    }

    static void levelOrder(Node node,Queue<Node> q,ArrayList<Integer> ans)
    {
        q.add(node);
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            ans.add(curr.d);
            //queue is a FIFO so we are adding the left which is at the next level from the root
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
    }
}
