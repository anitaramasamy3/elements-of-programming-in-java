
import java.util.*;//ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P5point6 {
    
    public static double stockProfit(ArrayList<Integer>a){//WAP that takes an array of daily stocks and returns max profit that can be made by buying and then selling one share of that stock
        int size=a.size();
        double maxprof=0.0,minprice=Double.MAX_VALUE;
        for(int i=0;i<size;i++){
            maxprof=Math.max(maxprof, a.get(i)-minprice);//max difference is the profit 
            minprice=Math.min(minprice, a.get(i));// maintain the min price
        }
        
        return maxprof;
    }
    
    public static void main(String[] args){
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(310);
    a.add(315);
    a.add(275);
    a.add(295);
    a.add(260);
    a.add(270);
    a.add(290);
    a.add(230);
    a.add(255);
    a.add(250);
    a.add(400);

    //{2,4,2,1,5,7,9};
    for(int i=0;i<a.size();i++){
        System.out.println("a before : "+a.get(i));
    }
    double m=stockProfit(a);
    System.out.println("max prof : "+m);
}
}
