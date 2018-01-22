/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P6point5 {//traverse string using two indices skipping non alphanumerical chars,performing case sensitivity testson alphanumeric chars
    public static boolean checkPalindrome(String s){
        boolean res=true;
        int i=0,j=s.length()-1;
        while(i<j){
            while(!Character.isLetterOrDigit(s.charAt(i))&&i<j)
                i++;
            while(!Character.isLetterOrDigit(s.charAt(j))&&i<j)
                j--;
            if(Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--)))//check converting both to lower case
                return false;
        }
        
        return res;
    }
    public static void main(String[] args){
        String a="A man, a plan, a canal, Panama";
        String b="Ray a Ray";
        boolean c=checkPalindrome(b);
        System.out.println(c);
        //checkPalindrome(a)?System.out.println("YES"):System.out.println("NO");
    }
}
