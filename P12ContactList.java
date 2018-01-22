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
public class P12ContactList {
    public static List<ContactList> mergeContactList(List<ContactList> contact){
        return new ArrayList<>(new HashSet<>(contact));
    }
    public static void main(String[] args){
        List<String> c1=new ArrayList(){{add("anita");add("atlanta");add("georgia");}};
        ContactList q1=new ContactList(c1);
        List<String> c2=new ArrayList(){{add("anita");add("georgia");add("atlanta");}};
        ContactList q2=new ContactList(c2);
        List<String> c3=new ArrayList(){{add("arun");add("georgia");add("atlanta");}};
        ContactList q3=new ContactList(c3);
        List<ContactList> contact=new ArrayList(){{add(q1);add(q2);add(q3);}};
        List<ContactList> mergedList=mergeContactList(contact);
        for(ContactList s:mergedList){
            //System.out.println();
            s.printing();
        }
    }
}
class ContactList{
    public List<String> names;
    public ContactList(List<String> n){
        names=n;
    }
    public int HashCode(){
        return new HashSet(names).hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof ContactList))
            return false;
        return this==obj?true:new HashSet(names).equals(new HashSet(((ContactList)obj).names));
    }
    public void printing(){
        System.out.println(this.names);
    }
}
