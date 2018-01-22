/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P6point1 {//int to string and string to int conversion
    public static int stringToInt(String s){
        int neg=1;
        int j=0;
        int res=0;
        if(s.charAt(0)=='-'){ 
            neg*=-1; 
            j++;
        }
        for(int i=j;i<s.length();i++){
            final int dig=s.charAt(i)-'0';//convert to int
            res=res*10+dig;
        }
        
        System.out.println(neg*res);
        return neg*res;
    }
    public static void intToString(int a){
        int n=Math.abs(a);
        StringBuilder s=new StringBuilder();
        
        while(n!=0){
            s.append((char)('0'+n%10));//in reverse//convert to char from int
            n/=10;
        }
        if(a<0){
            s.append('-');// last char
        }
        s.reverse();
        System.out.println(s.toString());
        
    }
    public static void main(String[] args){
        stringToInt("341");
        intToString(-42);
    }
}
