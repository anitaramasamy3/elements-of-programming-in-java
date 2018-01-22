/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
import java.util.*;
public class P8point7 {
    public static List<List<Integer>> binaryTreeDepthOrder(BinaryTreeNode root){
        List<List<Integer>> res=new ArrayList();
        Queue<BinaryTreeNode> currDepth=new LinkedList();
        currDepth.add(root);
        while(!currDepth.isEmpty()){
            Queue<BinaryTreeNode> nextDepth=new LinkedList();
            List<Integer> thisLevel=new ArrayList();
            while(!currDepth.isEmpty()){
                BinaryTreeNode curr=currDepth.poll();
                if(curr!=null){
                    thisLevel.add((Integer) curr.data);
                    nextDepth.add(curr.left);
                    nextDepth.add(curr.right);
                }
            }
            if(!thisLevel.isEmpty())
                res.add(thisLevel);
            currDepth=nextDepth;
        }
        
        return res;
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
        List<List<Integer>> res=binaryTreeDepthOrder(tree);
        System.out.println(res);        
    }
}
