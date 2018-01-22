/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.*;
/**
 *
 * @author anita
 */
public class P10point0 {
    public static List<String> topK(int k,Iterator<String> iter){
        PriorityQueue<String> minHeap=new PriorityQueue<>(k,(String s1,String s2)-> Integer.compare(s1.length(), s2.length()));
        while(iter.hasNext()){
            minHeap.add(iter.next());
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
    
    public static void main(String[] args){
        List<String> s=new ArrayList<>();
        s.add("aba");
        s.add("gene");
        s.add("yo");
        s.add("sixty");
        Iterator<String> it=s.iterator();//=new Iterator<>(s);
        //s.clear();
        s=topK(2,it);
        for(int i=0;i<s.size();i++)
            System.out.println(s.get(i));
    }
}
