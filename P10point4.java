/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Collections;
import java.util.*;
/**
 *
 * @author anita
 */
class Star{
    public int x,y,z;
    public Star(int x,int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Star(){
        x=0;y=0;z=0;
    }
    public double distance(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    public void printing(){
        System.out.println(x+" "+y+" "+z);
    }
}
public class P10point4 {
    public static List<Star> kClosestToEarth(int k,Iterator<Star> it){
        
        //List<Star> res=new ArrayList(k);
        //System.out.println(res.size());
        PriorityQueue<Star> maxHeap=new PriorityQueue<>(k,(Star a1,Star a2)->Double.compare(a2.distance(), a1.distance()));
        int c=1;
        while(it.hasNext()){
            maxHeap.add(it.next());
            if(c++>k){
                maxHeap.poll();
            }    
        }
        List<Star>res=new ArrayList<Star>(maxHeap);
        Collections.sort(res,(Star a1,Star a2)->Double.compare(a1.distance(), a2.distance()));
        return res;
    }
    public static void main(String[] args){
        List<Star> a=new ArrayList(){{add(new Star(2,3,4));add(new Star(5,3,7));add(new Star(1,3,0));add(new Star(4,4,4));}};
        Iterator iter=a.iterator();
        List<Star> r=new ArrayList(2);
        r=kClosestToEarth(2,iter);
        //System.out.println(r.size());
        for(int i=0;i<r.size();i++)
            r.get(i).printing();
    }
}
