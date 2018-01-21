/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P1 {// parity iis 1 if odd no. of 1s in a binary word,0 if even
    //find the parity of 64 bit word (2^64 total digits)
    public static short parityy(long x){//x&(x-1)is x with its lowest set bit(1) erased.
        short result = 0;
        System.out.println("start x "+x);
        while(x!=0){//number of set bits=number of times x gets multiplied with x-1 until it reaches 0.
            result ^= 1;//the mod of number of occurrences of the set bit can be calculated to find parity
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
