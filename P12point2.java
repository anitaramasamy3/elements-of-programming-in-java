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
public class P12point2 {
    public static boolean isLetterFromMagazine(String letter,String magazine){
        Map<Character,Integer> charFreq=new HashMap<>();
        char[] letterArray=letter.toCharArray();
        for(int i=0;i<letterArray.length;i++){
            if(!charFreq.containsKey(letterArray[i])){
                charFreq.put(letterArray[i],1);
            }
            else{
                charFreq.put(letterArray[i],charFreq.get(letterArray[i])+1);
            }
        }
        for(char c:magazine.toCharArray()){
            if(charFreq.containsKey(c)){
                charFreq.put(c,charFreq.get(c)-1);
                if(charFreq.get(c)==0)
                    charFreq.remove(c);
            }
            if(charFreq.isEmpty())
                break;
        }
        if(charFreq.size()>0)
            return false;
        else
            return true;
    }
    public static void main(String[] args){
        System.out.println(isLetterFromMagazine("yo how are you","yolo hello where ae rouy"));
        System.out.println(isLetterFromMagazine("yolo hello where ae rouy","yo how are you"));
    }
}
