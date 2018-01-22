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
public class P11point3 {
    public static int cyclicSorted(List<Integer> a){
        int l=0,h=a.size()-1,k,m;
        while(l<h){
            m=l+(h-l)/2;
            if(a.get(m)>a.get(h))
                l=m+1;
            else 
                h=m;
            
        }
        return l;
    }
    public static void main(String[] args){
        List<Integer> a=new ArrayList(){{add(550);add(8009);add(103);add(203);add(230);add(279);add(285);}};
        System.out.println(cyclicSorted(a));
    }
            
}
