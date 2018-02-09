/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P7point4 {
    public static ListNode<Integer> overlapping(ListNode<Integer> l1,ListNode<Integer> l2){
        ListNode<Integer> ans=new ListNode<Integer>();
        ListNode<Integer> a=l1;
        ListNode<Integer> b=l2;
        int asize=1,bsize=1;
        while(a.next!=null&&b.next!=null){
            if(a.next!=null){
                a=a.next;
                asize++;        
            }
            if(b.next!=null){
                b=b.next;
                bsize++;        
            }
            
        }
        if(a!=b)
            return ans;
        a=l1;b=l2;
        //System.out.println(asize+" "+bsize);
        while(a.next!=null&&b.next!=null){
            //System.out.println("umm");
            if(asize>bsize){
                while(asize>bsize){
                    a=a.next;
                    bsize++;
                }
            }
            else if(bsize>asize){
                while(bsize>asize){
                    b=b.next;
                    asize++;
                }
            }
            if(a.data==b.data)
                //System.out.println("yaay"+a.data);
                return a;
            
            a=a.next;
            b=b.next;
        }   
        //System.out.println("Really?");
        return ans;
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
        c1.data=5;c1.next=null;
        a2.data=2;a2.next=b2;
        b2.data=4;b2.next=c2;
        c2.data=6;c2.next=null;
        
        res=overlapping(a1,a2);
        System.out.println(res.data);
    }
}
