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

class ElementWithCachedMax{
    public  Integer elem;
    public Integer max;
    public ElementWithCachedMax(Integer element,Integer max){
        this.elem=element;
        this.max=max;
    }
}
public class P8point1 {
    public static Deque<ElementWithCachedMax> ecmax=new LinkedList<>();
    public boolean empty(){
        return ecmax.isEmpty();
    }
    public Integer max(){
        if(empty()){
            throw new IllegalStateException("max() empty stack");
        }
        return ecmax.peek().max;
    }
    public Integer pop(){
        if(empty()){
            throw new IllegalStateException("pop() empty stack");
        }
        return ecmax.pollFirst().elem;
    }
    public void push(Integer a){
        ecmax.addFirst(new ElementWithCachedMax(a,Math.max(a, empty()?a:max())));
        
    }
    public void printList(){
        while(ecmax.iterator().hasNext()){
            
            System.out.println(ecmax.peek());
            ecmax.iterator().next();
           
            
        }
    }
   
}
