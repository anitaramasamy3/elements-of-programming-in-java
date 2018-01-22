/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P9point3 {
    public int targetNodes;
    public BinaryTreeNode ancestor;
    public P9point3(int tn,BinaryTreeNode lca){
        targetNodes=tn;
        ancestor=lca;
    }
    public static BinaryTreeNode findLCA(BinaryTreeNode root, BinaryTreeNode n1,BinaryTreeNode n2){
        return LCAHelper(root,n1,n2).ancestor;
    }
    public static P9point3 LCAHelper(BinaryTreeNode root, BinaryTreeNode n1,BinaryTreeNode n2){
        if(root==null)
            return new P9point3(0,null);
        P9point3 left=LCAHelper(root.left,n1,n2);
        if(left.targetNodes==2)
            return left;
         P9point3 right=LCAHelper(root.right,n1,n2);
         if(right.targetNodes==2)
             return right;
         int tn=left.targetNodes+right.targetNodes+(root==n1?1:0)+(root==n2?1:0);
         BinaryTreeNode l=(tn==2?root:null);
         return new P9point3(tn,l);
    }
    public static void main(String[] args){
        BinaryTreeNode tree=new BinaryTreeNode(3);
        BinaryTreeNode a=new BinaryTreeNode(4);
        BinaryTreeNode b=new BinaryTreeNode(5);
        BinaryTreeNode c=new BinaryTreeNode(6);
        BinaryTreeNode d=new BinaryTreeNode(7);
        BinaryTreeNode e=new BinaryTreeNode(8);
        BinaryTreeNode f=new BinaryTreeNode(9);
        tree.left=a;tree.right=b;
        a.left=c;a.right=d;
        b.left=e;b.right=f;
        System.out.println(findLCA(tree,d,c).data);
    }
}
