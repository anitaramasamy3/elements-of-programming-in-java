/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P7point2 {
    public static ListNode<Integer> reverseSublist(ListNode<Integer> a,int s,int f){
        ListNode<Integer> dHead=new ListNode<Integer>(0,a);
        ListNode<Integer> bfrS=dHead;
        int k=1;
        while(k<s){
            bfrS=bfrS.next;
            k++;
        }
        ListNode<Integer> subp1=bfrS.next;
        while(s<f){
            ListNode<Integer> t=subp1.next;
            subp1.next=t.next;
            t.next=bfrS.next;
            bfrS.next=t;
            s++;
        }
        
        return dHead.next;
    }
    public static void main(String[] args){
        ListNode<Integer>res=new ListNode();
        
        ListNode<Integer>a1=new ListNode();
        ListNode<Integer>b1=new ListNode();
        ListNode<Integer>c1=new ListNode();
        ListNode<Integer>a2=new ListNode();
        ListNode<Integer>b2=new ListNode();
        ListNode<Integer>c2=new ListNode();
        a1.data=1;a1.next=b1;
        b1.data=3;b1.next=c1;
        c1.data=5;c1.next=a2;
        a2.data=2;a2.next=b2;
        b2.data=4;b2.next=c2;
        c2.data=6;
        
        res=reverseSublist(a1,3,5);
        while(res!=null){
            System.out.println(res.data);
            res=res.next;
        }
    }    
}
