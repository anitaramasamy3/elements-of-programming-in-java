/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P14point2 {
    public static BSTNode<Integer> findFirstGreaterThanK(BSTNode<Integer> tree,Integer k){
        BSTNode<Integer> subtree=tree,firstSoFar=null;
        while(subtree!=null){
            if(subtree.data<=k){
                subtree=subtree.right;
            }
            else{
                firstSoFar=subtree;
                subtree=subtree.left;
                
            }
        }
        return firstSoFar;
    }
     public static void main(String[] args){
        BSTNode tree=new BSTNode(19);
        BSTNode a=new BSTNode(7);
        BSTNode b=new BSTNode(43);
        BSTNode c=new BSTNode(3);
        BSTNode d=new BSTNode(11);
        BSTNode e=new BSTNode(23);
        BSTNode f=new BSTNode(47);
        tree.left=a;tree.right=b;
        a.left=c;a.right=d;
        b.left=e;b.right=f;
        System.out.println(findFirstGreaterThanK(tree,23).data);
    }
}
