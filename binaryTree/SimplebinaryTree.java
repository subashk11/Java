package binaryTree;

import java.util.ArrayList;

//class to create tree node
class Node{
    int d;
    Node left,right;
    Node(int d)
    {
        this.d=d;
        left=null;
        right=null;
    }
}

public class SimplebinaryTree{

    //binaryTree.preorder traversal root-left-right
    static void preorder(Node node,ArrayList<Integer> arr)
    {
        if(node==null) return ;
        arr.add(node.d);
        preorder(node.left,arr);
        preorder(node.right,arr);
    }

    //postorder traversal left-right-root
    static void postorder(Node node, ArrayList<Integer> arr)
    {
        if(node==null) return;
        preorder(node.left,arr);
        preorder(node.right,arr);
        arr.add(node.d);
    }
    //inorder traversal left-root-right
    public static void inorder(Node node,ArrayList<Integer> ans)
    {
        if(node==null) return ;
        inorder(node.left,ans);
        ans.add(node.d);
        inorder(node.right,ans);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        System.out.println("Inorder: ");
        System.out.println(ans);

        ArrayList<Integer> pre=new ArrayList<>();
        preorder(root,pre);
        System.out.println("binaryTree.preorder: ");
        System.out.println(pre);

        ArrayList<Integer> post=new ArrayList<>();
        postorder(root,post);
        System.out.println("postorder: ");
        System.out.println(post);
    }
}

