/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author anita
 */
public class P14point3 {
    public static List<Integer> findKLargestInBST(BSTNode<Integer> tree,int k){
        List<Integer> kLargestElements=new ArrayList<>();
        findKLargestInBSTHelper(tree,k,kLargestElements);
        return kLargestElements;
    }
    public static void findKLargestInBSTHelper(BSTNode<Integer> tree, int k,List<Integer> elem){
        //reverse inorder
        if(elem.size()<k&&tree!=null){
            findKLargestInBSTHelper(tree.right,k,elem);
            if(elem.size()<k){
                elem.add(tree.data);
                findKLargestInBSTHelper(tree.left,k,elem);
            }
        }
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
        System.out.println(findKLargestInBST(tree,3));
    }
}
