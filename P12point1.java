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
public class P12point1 {
    public static boolean canFormBoolean(String s){
        Set<Character> charFreq=new HashSet<>();
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(!charFreq.contains(str[i]))
                charFreq.add(str[i]);
            else
                charFreq.remove(str[i]);
            
        }
        if(charFreq.size()>1)
            return false;
        else 
            return true;
    }
    public static void main(String[] args){
        System.out.println(canFormBoolean("arapp"));
    }
}
