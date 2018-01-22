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

public class P11point4 {
    public static int squareRoot(int k){
        int l=0,h=k,m,m2;
        while(l<=h){
            m=l+(h-l)/2;
            m2=m*m;
            if(m2>k)
                h=m-1;
            else// if(m2<k)
                l=m+1;
                
        }
        return l-1;
    }
    public static void main(String[] args){
        System.out.println(squareRoot(221));
    }
}
