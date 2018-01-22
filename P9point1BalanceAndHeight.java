/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P9point1BalanceAndHeight {
    public boolean balance;
    public int height;
    public P9point1BalanceAndHeight(boolean b,int h){
        balance=b;
        height=h;
    }
    public static boolean isBalanced(BinaryTreeNode<Integer> tree){
        //System.out.println(checkBalance(tree).balance);
        return checkBalance(tree).balance;
    }
    public static P9point1BalanceAndHeight checkBalance(BinaryTreeNode<Integer> tree){
        if(tree==null)
            return new P9point1BalanceAndHeight(true,-1);//base case
        P9point1BalanceAndHeight leftSubtree=checkBalance(tree.left);
        if(!leftSubtree.balance)
            return leftSubtree;
        P9point1BalanceAndHeight rightSubtree=checkBalance(tree.right);
        if(!rightSubtree.balance)
            return rightSubtree;
        boolean b=Math.abs(leftSubtree.height-rightSubtree.height)<=1;
        int h=Math.max(leftSubtree.height, rightSubtree.height)+1;
        return new P9point1BalanceAndHeight(b,h);
    }
    public static void main(String[] args){
        BinaryTreeNode tree=new BinaryTreeNode(3);
        BinaryTreeNode a=new BinaryTreeNode(4);
        //BinaryTreeNode b=new BinaryTreeNode(5);
        BinaryTreeNode c=new BinaryTreeNode(6);
        BinaryTreeNode d=new BinaryTreeNode(7);
        //BinaryTreeNode e=new BinaryTreeNode(8);
        //BinaryTreeNode f=new BinaryTreeNode(9);
        tree.left=a;//tree.right=b;
        a.left=c;a.right=d;
        //b.left=e;b.right=f;
        System.out.println(isBalanced(tree));
    }
}
