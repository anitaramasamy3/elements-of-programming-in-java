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

class MaxWithCount{
    public Integer max;
    public Integer count;
    public MaxWithCount(Integer m,Integer c){
        this.max=m;
        this.count=c;
    }
}
public class P8point1Stack {
    private Deque <Integer> element;
    private Deque <MaxWithCount> m;
    public boolean empty(){
        return element.isEmpty();
    }
    public Integer max(){
        if(empty())
            throw new IllegalStateException("max() empty stack");
        return m.peekFirst().max;
    }
    public Integer pop(){
        if(empty())
            throw new IllegalStateException("pop() empty stack");
        Integer popelem= element.removeFirst();
        if(popelem==m.getFirst().max)
            m.getFirst().count--;
        if(m.getFirst().count==0)
            m.removeFirst();
        return popelem;
    }
    public void push(Integer a){
        element.addFirst(a);
        
        if(m.getFirst().max==a)
            m.getFirst().count++;
        else if(m.getFirst().max<a){
            m.addFirst(new MaxWithCount(a,1));    
        }
        
            
    }
    
}
