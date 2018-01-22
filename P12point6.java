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
public class P12point6 {
    public static int findNearestNeighbour(List<String> para){
        Map<String,Integer> wordDistance=new HashMap<>();
        int n=Integer.MAX_VALUE;
        for(int i=0;i<para.size();i++){
            if(wordDistance.containsKey(para.get(i))){
                n=Math.min(n,i-wordDistance.get(para.get(i)));
                
            }
            wordDistance.put(para.get(i),i);           
        }

        //System.out.println(n);
        return n;
    }
    public static void main(String[] args){
        List<String> para=new ArrayList(){{add("all");add("work");add("and");add("no");add("play");add("makes");add("for");add("no");add("work");add("no");add("fun");add("and");add("no");add("results");}};
        System.out.println(findNearestNeighbour(para));
    }
}
