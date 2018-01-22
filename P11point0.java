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
public class P11point0 {
    public String name;
    public double gpa;
    public P11point0(String n,double gpa){
        name=n;
        this.gpa=gpa;
    }
    public static Comparator<P11point0> compareGPA=(P11point0 s1, P11point0 s2) -> {
        if(s1.gpa!=s2.gpa)
            return Double.compare(s1.gpa, s2.gpa);
        return s1.name.compareTo(s2.name);
        
    };    
    public static boolean gpaBST(List<P11point0> l,P11point0 target,Comparator<P11point0> c){
        return Collections.binarySearch(l, target,c)>=0;
    }
    public static void main(String[] args){
        List<P11point0> a;
        a = new ArrayList(){{add(new P11point0("Anita",6.7));add(new P11point0("Arun",9.7));add(new P11point0("Sanjana",9.7));}};
        P11point0 b=new P11point0("Snjana",9.7);
        System.out.println(gpaBST(a,b,compareGPA));
        
    }
}
