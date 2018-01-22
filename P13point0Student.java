
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anita
 */
public class P13point0Student implements Comparator<P13point0Student>{
    public String name;
    public double gpa;
    public P13point0Student(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public int compareTo(P13point0Student a){
        return name.compareTo(a.name);
    }
    @Override
    public int compare(P13point0Student a,P13point0Student b){return Double.compare(a.gpa, b.gpa);}
    public void sortByName(List<P13point0Student> students){
        Collections.sort(students,new Comparator<P13point0Student>(){public int compareTo(P13point0Student a){return name.compareTo(a.name);}});
        
    }
    /*@Override
    public int compare(P13point0Student a,P13point0Student b){
        return Double.compare(a.gpa, b.gpa);
    }*/
    public void sortByGPA(List<P13point0Student> students){
        Collections.sort(students,Collections.reverseOrder(new Comparator<P13point0Student>(){@Override
        public int compare(P13point0Student a,P13point0Student b){return Double.compare(a.gpa, b.gpa);}}));
    }
}
