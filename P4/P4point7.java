/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4;

/**
 *
 * @author anita
 */
public class P4point7 {//WAP that takes double x and int y and returns x^y
    
    public static double power(double x, int y){
        double result=1.0;
        long power=y;//assuming y is a power of 2
        if(y<0){//if y is negative
            power=-power;
            x=1.0/x;
        }
        while(power!=0){
            System.out.println("start power:"+power);
            if((power&1)!=0){//if lsb of y is 1
                result*=x;
                System.out.println("result:"+result);
            }
            
            x*=x;
            power>>>=1;//1 right shift - decreases in power of 2 
            System.out.println("end power:"+power);
            System.out.println("x:"+x);
        }
        return result;
    }
    
    public static void main(String[] args){
        double x=2.3;
        int y = 24;
        double xpowery=power(x,y);
        System.out.println("answer : "+xpowery);
    }
}
