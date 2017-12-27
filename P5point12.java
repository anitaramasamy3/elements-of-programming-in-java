
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
public class P5point12 {
    public static ArrayList<Integer> randomGen (ArrayList<Integer> a,int k){
        Random gen=new Random();
        int n=a.size()-1;
        int t=0;
        for(int i=0;i<k;i++){
            int r=gen.nextInt((n-i)+1)+i;
            Collections.swap(a, i, r);
            /*t=a.get(r);
            a.set(r, a.get(i));
            a.set(i, t);*/
        }
        return a;
    }

    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(55);
        a.add(98);
        a.add(72);
        a.add(34);
        a.add(3);
        a.add(16);
        
        //{2,4,2,1,5,7,9};
        for(int i=0;i<a.size();i++){
            System.out.println("a before : "+a.get(i));
        }
        int k=3;   
        a=randomGen(a,k);
        for(int i=0;i<k;i++){
            System.out.println("k random subset : "+a.get(i));
        }
    }
}
