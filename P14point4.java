/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P14point4 {
    public static BSTNode<Integer> findLCA(BSTNode<Integer> tree,BSTNode<Integer> s,BSTNode<Integer> b){
        BSTNode<Integer> subtree=tree;
        while(subtree!=s||subtree!=b){
            if(subtree.data>s.data&&subtree.data<b.data)
                return subtree;
            else if(subtree.data>s.data&&subtree.data>b.data)
                subtree=subtree.left;
            else if((subtree.data < s.data) && (subtree.data < b.data))
                subtree=subtree.right;
            else if(subtree.data==s.data&&subtree.data==b.data)
                return subtree;
        }
        return subtree;
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
        System.out.println(findLCA(tree,a,b).data);
    }
}
