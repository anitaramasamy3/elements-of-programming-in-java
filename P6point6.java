/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P6point6 {
    public static char[] reverseWords(String s){
        char[] f=s.toCharArray();
        int size=f.length-1;
        f=reverse(f,0,size);
        int j=0;
        //f[size+1]='\0';
        //System.out.println(f[size+1]);
        for(int i=0;i<=size;i++){
            
            if(Character.isSpaceChar(f[i])||i==size){
                if(i==size)
                    i++;
                f=reverse(f,j,i-1);
                j=i+1;

                
            }
        }
        //System.out.println(f[size+1]);
        return f;
    }
    public static char[] reverse(char[] f,int start,int end){
        char t;
        while(start<end){
            t=f[start];
            f[start]=f[end];
            f[end]=t;
            start++;end--;
        }
        return f;
    }
    public static void main(String[] argsf)
    {
        String s="ram is costly is on a road trip yo";
        System.out.println(s);
        char[] f=reverseWords(s);
        System.out.println(f);
        
    }
}
