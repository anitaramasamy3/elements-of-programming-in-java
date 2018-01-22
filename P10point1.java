/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
//import java.util.Arrays;
/**
 *
 * @author anita
 */
class ArrayEntry{
    public int id;
    public int value;
    public ArrayEntry(int id,int value){
        this.id=id;
        this.value=value;
    }
}
public class P10point1 {
    public static List<Integer> mergeSortedArray(List<List<Integer>> a){
        PriorityQueue<ArrayEntry> minArr=new PriorityQueue<>(a.size(),(ArrayEntry o1,ArrayEntry o2)->Integer.compare(o1.value,o2.value)); 
        List<Iterator<Integer>> iterList=new ArrayList(a.size());
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<a.size();i++)
            iterList.add(a.get(i).iterator());
        for(int i=0;i<a.size();i++)
            if(iterList.get(i).hasNext())
                minArr.add(new ArrayEntry(i,iterList.get(i).next()));
        while(!minArr.isEmpty()){
            ArrayEntry small=minArr.poll();
            result.add(small.value);
            if(iterList.get(small.id).hasNext()){
                minArr.add(new ArrayEntry(small.id,iterList.get(small.id).next()));
            }
        }
        return result;
    }
    public static void main(String[] args){
        //asList(asList(3,5,7),asList(0,6),asList(0,6,28));
        List<Integer> m1=new ArrayList(){{add(3);add(5);add(7);}};
        List<Integer> m2=new ArrayList(){{add(0);add(6);}};
        List<Integer> m3=new ArrayList(){{add(0);add(6);add(28);}};
        List<List<Integer>> m= new ArrayList<List<Integer>>(){{add(m1);add(m2);add(m3);}};
        //System.out.println(m.size());
        List<Integer> res=mergeSortedArray(m);
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
        
    }
}
