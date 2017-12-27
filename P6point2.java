/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
import java.util.*;
import java.math.*;

public class P6point2 extends P6point1{
    public static String baseConversion(String s,int b1,int b2){
        //String res="";
        int a=stringToInt(s);
        int n=a;
        int b=0;
        double power=0.0;
        while(n!=0){
            b+=(n%10)*(Math.pow((double)b1,power++));
            n/=10;
        }
        System.out.println(b);
        n=b;
        StringBuilder res=new StringBuilder();
        while(n!=0){
            if(n%b2<10)
                res.append((char)('0'+n%b2));
            else
                res.append((char)('A'+n%b2-10));
            n/=b2;
        }
        res.reverse();
        return res.toString();
    }
    public static void main(String[] args){
        String res=baseConversion("65",7,13);
        System.out.println(res);
    }
}
