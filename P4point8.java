/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P4point8 {
    public static long findReverse(int n){//find reverse of integer
        long res=0;
        long num=n;
        while(num!=0){
            
            res=res*10+(num%10);
            num/=10;
            
        }
        return res;
    }
    public static void main(String[] args){
       int num=-1437;
       long rnum=findReverse(num);
       System.out.println("reverse "+rnum);
    }
}
