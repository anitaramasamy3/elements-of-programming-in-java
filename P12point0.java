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
public class P12point0 {
    public static List<List<String>> findAnagrams(List<String> dict){
        Map<String,List<String>> sortedString=new HashMap<>();
        for(String s:dict){
            char[] charS=s.toCharArray();
            Arrays.sort(charS);
            String s1=new String(charS);


            if(!sortedString.containsKey(s1)){
                sortedString.put(s1,new ArrayList<String>());
            }
            sortedString.get(s1).add(s);
        }
        //System.out.println(sortedString.size());
        List<List<String>> result=new ArrayList<>();
        for(Map.Entry<String,List<String>> p:sortedString.entrySet()){
            if(p.getValue().size()>=2)
                result.add(p.getValue());
        }
        //System.out.println(result.size());
        return result;
    }
    public static void main(String[] args){
        System.out.println("yay");
        List<String> a=new ArrayList(){{add("debitcard");add("elvis");add("silent");add("badcredit");add("lives");add("listen");add("anita");}};
        List<List<String>> b=new ArrayList<>();
        b=findAnagrams(a);
        //System.out.println(b.size());
        for(List<String> inner:b){
            
            System.out.println(inner);
            
        }
    }
}
