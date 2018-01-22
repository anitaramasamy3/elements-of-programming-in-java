/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P14point1 {
    public static boolean isBinaryTreeBST(BinaryTreeNode<Integer> tree){
        return areKeysInRange(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean areKeysInRange(BinaryTreeNode<Integer> tree,int lower, int upper){
        if(tree==null)
            return true;
        else if(tree.data<lower||tree.data>upper)
            return false;
        else
            return areKeysInRange(tree.left,lower,tree.data)&&areKeysInRange(tree.right,tree.data,upper);
    }
    
    public static void main(String[] args){
        BinaryTreeNode tree=new BinaryTreeNode(19);
        BinaryTreeNode a=new BinaryTreeNode(7);
        BinaryTreeNode b=new BinaryTreeNode(43);
        BinaryTreeNode c=new BinaryTreeNode(3);
        BinaryTreeNode d=new BinaryTreeNode(11);
        BinaryTreeNode e=new BinaryTreeNode(23);
        BinaryTreeNode f=new BinaryTreeNode(47);
        tree.left=a;tree.right=b;
        a.left=c;a.right=d;
        b.left=e;b.right=f;
        System.out.println(isBinaryTreeBST(tree));
    }
}
