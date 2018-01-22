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
public class P10point3 {
    public static List<Integer> almostKSorted(int k,List<Integer> a){
        PriorityQueue<Integer> minArr=new PriorityQueue<>(k,(Integer a1,Integer a2)->Integer.compare(a1, a2));
        int c=0;
        while(k--!=0){
            minArr.add(a.get(c++));
        }
        List<Integer> res=new ArrayList(a.size());
        while(!minArr.isEmpty()){
            res.add(minArr.poll());
            if(c<a.size())
                minArr.add(a.get(c++));
        }
        return res;
    }
    public static void main(String[] args){
        List<Integer> arr=new ArrayList(){{add(3);add(-1);add(2);add(6);add(4);add(5);add(8);}};
        arr=almostKSorted(2,arr);
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }
}
