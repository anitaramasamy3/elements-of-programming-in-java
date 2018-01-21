
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
public class P5point2 {//WAp that takes input array as an array of digits encoding a non negative decimal int D and updates the array to represent int D+1
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a){// eg: <1,2,9> = <1,3,0>
        int size=a.size()-1;//in all cases except 9 in lsb,just set it to lsb+1
        a.set(size,a.get(size)+1);//in case of lsb 9, previous digits gets modified
        for(int i=size;i>0 && a.get(i)==10;i--){//sometimes an overflow occurs,eg:99,999->100,1000
            a.set(i, 0);
            a.set(i-1, a.get(i-1)+1);            //in these cases, set lsb to 10 and increment the prev digits
        }
        if(a.get(0)==10){//if last digit is 10, set the 0th index to o1 and add a 0 in the end 
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
