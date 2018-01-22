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
public class P13point2 {
    public static List<Integer> mergeSortedArrays(List<Integer> a, List<Integer> b, int m,int n){
        int i=m-1,j=n-1;
        int aPointer=m+n-1;
        while(aPointer!=-1){
            if(a.get(i)<b.get(j)){
                a.set(aPointer--,b.get(j--));
                
            }
            else if(a.get(i)>b.get(j)){
                a.set(aPointer--,a.get(i--));
            }
            else{
                a.set(aPointer--,b.get(j--));
                a.set(aPointer--,a.get(i--));
            }
            if(i<0){
                while(j!=-1){
                    a.set(aPointer--,b.get(j--));
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        List<Integer> a=new ArrayList(10){{add(5);add(13);add(17);add(null);add(null);add(null);add(null);add(null);add(null);add(null);}};
        List<Integer> b=new ArrayList(){{add(3);add(7);add(11);add(19);}};
        System.out.println(mergeSortedArrays(a,b,3,4));
    }
}
