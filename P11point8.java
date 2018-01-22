/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author anita
 */
public class P11point8 {
    public static int kthLargest(List<Integer> a,int k){
        Random rand=new Random(0);
        int l=0,h=a.size()-1;
        while(l<=h){
            int r=rand.nextInt((h-l)+1)+l;
            System.out.println("random"+r);
            int newPivot=partitionPivot(r,a,l,h);
            System.out.println("newpivot"+newPivot);
            if(newPivot==k-1){
                return a.get(newPivot);
                
            }
            else if(newPivot>k-1){
                h=newPivot-1;
                System.out.println("big pivot");
            }
            else{
                System.out.println("small pivot");
                l=newPivot+1;
            }
                
                
        }
        return -1;
    }
    public static int partitionPivot(int pivot,List<Integer> arr,int low,int high){
        int pivotElement=arr.get(pivot);
        int newPivot=low;
        Collections.swap(arr, pivot,high);
        
        for(int i=low;i<high;i++){
            if(arr.get(i)<pivotElement){
                Collections.swap(arr, i,newPivot++ );
            }
        }
        Collections.swap(arr, high, newPivot);
        return newPivot;
    }
    public static void main(String[] args){
        List<Integer> array=new ArrayList(){{add(3);add(2);add(1);add(5);add(4);}};
        System.out.println("res"+kthLargest(array,5));
    }
}
