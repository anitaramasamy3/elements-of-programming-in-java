/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.lang.*;
/**
 *
 * @author anita
 */
public class P7point1{// extends ListNode<Integer>{
    public static ListNode<Integer> mergeTwoSortedLists(ListNode<Integer>a,ListNode<Integer>b){
        ListNode<Integer> head=new ListNode(Integer.MIN_VALUE);
        ListNode curr=head;
        while(a!=null&&b!=null){
            if(a.data<=b.data){
                curr.next=a;
                a=a.next;
            }
            else{
                curr.next=b;
                b=b.next;
            }
            curr=curr.next;
        }
        curr.next=a!=null?a:b;
        
        return head.next;
    }
    public static void main(String[] args){
        ListNode<Integer>res=new ListNode();
        
        ListNode<Integer>a1=new ListNode();
        ListNode<Integer>b1=new ListNode();
        ListNode<Integer>c1=new ListNode();
        a1.data=1;a1.next=b1;
        b1.data=3;b1.next=c1;
        c1.data=5;
        ListNode<Integer>a2=new ListNode();
        ListNode<Integer>b2=new ListNode();
        ListNode<Integer>c2=new ListNode();
        a2.data=2;a2.next=b2;
        b2.data=4;b2.next=c2;
        c2.data=6;
        
        res=mergeTwoSortedLists(a2,a1);
        while(res!=null){
            System.out.println(res.data);
            res=res.next;
        }
    }
}
