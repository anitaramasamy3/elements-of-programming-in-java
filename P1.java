/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P1 {
    public static short parityy(long x){
        short result = 0;
        System.out.println("start x "+x);
        while(x!=0){
            result ^= 1;//(x&1);
            System.out.println("result "+result);
            x&=(x-1);
            System.out.println("x "+x);
            //x >>>=1;
        }
        return result;
    }
    public static void main(String[] args){
        short r=parityy(11);
        System.out.println("the parity is "+r);
    }
}
