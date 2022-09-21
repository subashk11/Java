package binaryTree;

public class Height {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);

        int ans= height(root);
        System.out.println("Height of the binary tree is : "+ans);
    }

    static int height(Node node)
    {
        if(node==null)
        {
            return 0;
        }else{
            return Math.max(height(node.left),height(node.right))+1;
        }
    }
}
