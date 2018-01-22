
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P9point12 {
    public static BinaryTreeNode binaryTreeConstruction(List<Integer> preOrder,List<Integer> inOrder){
        Map<Integer,Integer> nodeToOrderIdx = new HashMap<Integer,Integer>();
        for(int i=0;i<preOrder.size();i++){
            nodeToOrderIdx.put(inOrder.get(i),i);
        }
        return binaryTreeConstructionHelper(preOrder,0,preOrder.size(),nodeToOrderIdx,0,inOrder.size());
    }
    public static BinaryTreeNode binaryTreeConstructionHelper(List<Integer> preOrder,int preStart,int preEnd,Map<Integer,Integer> inOrder,int inStart,int inEnd){
        if(preStart>=preEnd||inStart>=inEnd)
            return null;
        int rootInOrderIdx=inOrder.get(preOrder.get(preStart));
        int leftSubTreeSize=rootInOrderIdx-inStart;    
        return new BinaryTreeNode(preOrder.get(preStart),binaryTreeConstructionHelper(preOrder,preStart+1,preStart+1+leftSubTreeSize,inOrder,inStart,rootInOrderIdx),binaryTreeConstructionHelper(preOrder,preStart+1+leftSubTreeSize,preEnd,inOrder,rootInOrderIdx+1,inEnd));
    }
    public static void main(String[] args){
        List<Integer> pre=new ArrayList(){{add(8);add(2);add(6);add(5);add(1);add(3);add(4);add(7);add(9);}};
        List<Integer> in=new ArrayList(){{add(6);add(2);add(1);add(5);add(8);add(3);add(4);add(9);add(7);}};
        BinaryTreeNode root=binaryTreeConstruction(pre,in);
        System.out.println(root.left.data);
    }
}
 