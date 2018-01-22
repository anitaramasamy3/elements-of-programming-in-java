/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P9point2 {
    
    public static boolean isSymmetric(BinaryTreeNode<Integer> tree){
        return tree==null||checkSymmetry(tree.left,tree.right);
    }
    public static boolean checkSymmetry(BinaryTreeNode left,BinaryTreeNode right){
        if(left==null&&right==null)
            return true;
        else if(left!=null&&right!=null){
            //System.out.println("entering");
            return left.data==right.data&&checkSymmetry(left.left,left.right)&&checkSymmetry(right.left,right.right);
        }
        return false;
    }
    public static void main(String[] args){
        BinaryTreeNode tree=new BinaryTreeNode(3);
        BinaryTreeNode a=new BinaryTreeNode(4);
        BinaryTreeNode b=new BinaryTreeNode(4);
        BinaryTreeNode c=new BinaryTreeNode(6);
        BinaryTreeNode d=new BinaryTreeNode(6);
        BinaryTreeNode e=new BinaryTreeNode(6);
        BinaryTreeNode f=new BinaryTreeNode(6);
        tree.left=a;tree.right=b;
        a.left=c;a.right=d;
        b.left=e;b.right=f;
        System.out.println(isSymmetric(tree));
    }
}
