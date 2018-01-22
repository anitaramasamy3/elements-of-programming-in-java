/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
import java.util.*;
import java.*;
public class P8point2 {
    public static int eval(String rpnexp){
        Deque<Integer> intres=new ArrayDeque<>();
        String[] s=rpnexp.split(",");
        for(int i=0;i<s.length;i++){
            
            if("+-*/".contains(s[i])){
                int y=intres.removeFirst();
                int x=intres.removeFirst();
                switch(s[i]){
                    case "+":
                        intres.addFirst(x+y);
                        break;
                    case "-":
                        intres.addFirst(x-y);
                        break;
                    case "*":
                        intres.addFirst(x*y);
                        break;
                    case "/":
                        intres.addFirst(x/y);
                        break;
                    default:
                        throw new IllegalArgumentException("meh : "+s[i]);
                        
                }
                    
            }
            else 
                intres.addFirst(Integer.parseInt(s[i]));
            
        }
        return intres.removeFirst();
    }
    public static void main(String[] args){
        String r="3,4,+,2,*,1,+";
        System.out.println(eval(r));
    }
}
