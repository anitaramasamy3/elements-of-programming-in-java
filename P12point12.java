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
public class P12point12 {
    public static List<Integer> findSubstring(String s,List<String> words){
        int window=words.get(0).length();
        Set<String> wordSet=new HashSet<>();
        for(String word:words){
            wordSet.add(word);
        }
        int subStringLength=wordSet.size()*window;
        String temp;
        List<Integer> result=new ArrayList<>();
        int start=-1;int last=-1;
        boolean firstOccurrence=false;
        for(int i=0,j=window;j<s.length();i++,j++){
            int target;
            temp=s.substring(i, j);
            System.out.println(temp);
            if(wordSet.contains(temp)){
                System.out.println("bam !");
                target=i+subStringLength;
                System.out.println("target substring length"+target+""+i);
                int iCached=i;
                int jCached=j;
                while(j!=target){
                    if(!wordSet.contains(s.substring(i+window,j+window))){
                        System.out.println("not happening");
                        if(firstOccurrence==true){
                            firstOccurrence=false;
                        }
                        break;
                    }
                    else{
                        System.out.println("continuing " + s.substring(i+window,j+window));
                        if(firstOccurrence==false){
                        firstOccurrence=true;
                        start=i;
                        }
                    
                    
                    i+=window;
                    j+=window;
                    }
                    
                    
                    
                }
                System.out.println("got out of while loop " + j);
                if(j==target){
                    System.out.println("found substring");
                    last=j-1;
                    break;
                }
                i=iCached;j=jCached;
            }
            
        }
        result.add(start);
        result.add(last);
        return result;
    }
    public static void main(String[] args){
        List<String> words=new ArrayList(){{add("an");add("bl");add("cf");add("eg");}};
        System.out.println(findSubstring("anbloocfbljjblancfeg",words));
    }
}
