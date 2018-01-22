/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P9point4 {
    public static BinaryTreeNode LCA(BinaryTreeNode n1,BinaryTreeNode n2){
        if(n1==n2)
            return n1.parent;
        int depthDiff=checkDepth(n1,n2);
        if(depthDiff==0){
            if(n1.parent==n2.parent)
                return n1.parent;
            else
                return LCA(n1.parent,n2.parent);
                    
        }
        return (depthDiff>0?LCA(goUp(n1,Math.abs(depthDiff)),n2):LCA(n1,goUp(n2,Math.abs(depthDiff))));
    }
    public static BinaryTreeNode goUp(BinaryTreeNode n,int depth){
        for(int i=0;i<depth;i++){
            n=n.parent;
        }
        return n;
    }
    public static int checkDepth(BinaryTreeNode n1,BinaryTreeNode n2){
        int n1depth=0,n2depth=0;
        while(n1.parent!=null){
            n1depth++;
            n1=n1.parent;
        }
        while(n2.parent!=null){
            n2depth++;
            n2=n2.parent;
        }
        return n1depth-n2depth;
        
    }
    public static void main(String[] args){
        BinaryTreeNode tree=new BinaryTreeNode(3);
        BinaryTreeNode a=new BinaryTreeNode(4);
        BinaryTreeNode b=new BinaryTreeNode(5);
        BinaryTreeNode c=new BinaryTreeNode(6);
        BinaryTreeNode d=new BinaryTreeNode(7);
        BinaryTreeNode e=new BinaryTreeNode(8);
        BinaryTreeNode f=new BinaryTreeNode(9);
        tree.left=a;tree.right=b;tree.parent=null;
        a.left=c;a.right=d;a.parent=tree;
        b.left=e;b.right=f;b.parent=tree;
        c.parent=a;d.parent=a;
        e.parent=b;f.parent=b;
        System.out.println(LCA(e,f).data);
    }
}
