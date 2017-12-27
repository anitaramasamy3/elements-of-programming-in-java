
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
public class P5point2 {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a){
        int size=a.size()-1;
        a.set(size,a.get(size)+1);
        for(int i=size;i>0 && a.get(i)==10;i--){
            a.set(i, 0);
            a.set(i-1, a.get(i-1)+1);            
        }
        if(a.get(0)==10){
            a.set(0, 1);
            a.add(0);
        }
        return a;
    }
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(9);
        a.add(9);
        a.add(9);
                
        //{2,4,2,1,5,7,9};
        for(int i=0;i<a.size();i++){
            System.out.println("a before : "+a.get(i));
        }
        a=plusOne(a);
        for(int i=0;i<a.size();i++){
            System.out.println("a after : "+a.get(i));
        }
    }    
}
