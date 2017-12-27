/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P6point4 {
    public static char[] replaceRemove(char[] s,int size){
        int count=0;
        int ind=0;
        for(int i=0;i<size;i++){
            if(s[i]=='a')
                count++;
            if(s[i]=='b')
                count--;
            else
                s[ind++]=s[i];
            count++;
            
        }
        //System.out.println(ind);
        ind--;
        for(int i=count-1;i>=0;i--){
            if(s[ind]=='a'){
                s[i]='d';i--;
                s[i]='d';
            }
            else{
                s[i]=s[ind];
            }
            ind--;
        }
        return s;
    }
    public static void main(String[] args){
        char[] s={'a','c','d','b','b','c','a','8','&','_'};
        s=replaceRemove(s,7);
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
}
