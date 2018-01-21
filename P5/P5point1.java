/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5;

/**
 *
 * @author anita
 */
public class P5point1 {//WAP to take an array A and index i into A,and rearranges such that all elements less that A[i] appear first,followed by elements equal to A[i] and then by elements greater
    public static int[] partition(int[] a,int p){
        int pivot=a[p];
        int t=0,s=0,e=0,l=a.length-1;//,last=a.length-1;
        for(int i=0;i<a.length;i++){
            if(a[i]<pivot){
                t=a[i];
                a[i]=a[s];
                a[s]=t;
                s++;
            }
        }
            //if(a[i]==pivot)
              //  ++e;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>pivot){
                t=a[i];
                a[i]=a[l];
                a[l]=t;
                l--;
            }
                
        }
     
        return a;
    }
    
    public static int[] singleLoop(int[] a,int p){
         int pivot=a[p];
        int t=0,s=0,e=0,l=a.length-1;
        while(e<l){
            if(a[e]<pivot){
                t=a[s];
                a[s]=a[e];
                a[e]=t;
                s++;e++;
            }
            else if(a[e]>pivot){
                t=a[e];
                a[e]=a[l];
                a[l]=t;
                l--;
            }
            else
                ++e;
        }
        return a;
    }
    
    public static void main(String[] args){
        int a[]={41,73,85,22,927,21,443,34,12,43,68,22,34};
        
        for(int i=0;i<a.length;i++){
            System.out.println("a before : "+a[i]);
        }
        int[] b=partition(a,7);
        for(int i=0;i<a.length;i++){
            System.out.println("a after : "+a[i]);
        }
        b=singleLoop(a,7);
        for(int i=0;i<a.length;i++){
            System.out.println("a after in single loop : "+a[i]);
        }
        
        
    }
}
