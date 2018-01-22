/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P14point0 {
    public static BSTNode<Integer> searchBST(BSTNode<Integer> tree, int key){
        return tree==null||tree.data==key?tree:tree.data>key?searchBST(tree.left,key):searchBST(tree.right,key);
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
        System.out.println(searchBST(tree,11).data);
    }
}
