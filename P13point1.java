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
public class P13point1 {
    public static List<Integer> findIntersectionOfSortedArrays(List<Integer> a,List<Integer> b){
        List<Integer> result=new ArrayList<>();
        int aSize=a.size(),bSize=b.size();
        int i=0,j=0;
        while(i!=aSize&&j!=bSize){
            //System.out.println("entering");
            if(a.get(i)<b.get(j)){
                i++;
            }
            else if(a.get(i)>b.get(j)){
                j++;
            }
            else{
                //System.out.println("equal");
                if(!result.contains(b.get(j))){
                    //System.out.println("first occurence - equal");
                    result.add(b.get(j));
                    
                    //System.out.println(result);
                }
                    i++;j++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<Integer> a=new ArrayList(){{add(2);add(3);add(3);add(5);add(5);add(6);add(7);add(7);add(8);add(12);}};
        List<Integer> b=new ArrayList(){{add(5);add(5);add(6);add(8);add(8);add(9);add(10);add(10);}};
        System.out.println(findIntersectionOfSortedArrays(a,b));
    }
}
