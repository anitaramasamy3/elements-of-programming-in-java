/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P8Order {
    public static void preOrder(BinaryTreeNode root){//root,left subtree,right subtree
        if(root!=null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    } 
    public static void inOrder(BinaryTreeNode root){//left subtree,root,right subtree
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void postOrder(BinaryTreeNode root){//left subtree,right subtree,root
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void main(String args[]){
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
        postOrder(tree);
        
    }
}
