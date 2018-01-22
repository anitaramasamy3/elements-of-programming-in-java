
//import java.util.Arrays;
//import java.util.Collections;
import java.util.*;//NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P8point8Queue {
    private int head=0,tail=0,numOfElem=0;
    private final int scaleFactor=2;
    private Integer[] entries;
    public P8point8Queue(int capacity){
        entries=new Integer[capacity];
    }
    public void enqueue(Integer x){
        if(numOfElem==entries.length){
            Collections.rotate(Arrays.asList(entries),-head);
            head=0;
            tail=numOfElem;
            int y=numOfElem*scaleFactor;
            entries=Arrays.copyOf(entries,y);
            //System.out.println("resized "+tail+" "+head+" "+entries.length);
        }
        entries[tail]=x;
        tail=(tail+1)%entries.length;
        numOfElem++;
    }
    public Integer Dequeue(){
        if(numOfElem==0)
            throw new NoSuchElementException("empty array");
        Integer dequeueElem=entries[head];
        head=(head+1)%entries.length;
        numOfElem--;
        return dequeueElem;
    }    
    public void printQueue(){
        for(int i=head;i<tail;i++){
            System.out.println(entries[i]);
        }
    }    
    
    public static void main(String[] args){
        P8point8Queue p=new P8point8Queue(3);
        p.enqueue(2);
        p.enqueue(5);
        p.enqueue(9);
        //p.printQueue();
        p.enqueue(10);
        //p.printQueue();
        p.enqueue(55);
        p.printQueue();
        p.Dequeue();
        p.printQueue();
    }
}
