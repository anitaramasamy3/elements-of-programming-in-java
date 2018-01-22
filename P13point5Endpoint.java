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
class Event{
    public int start;
    public int end;
    public Event(int s,int e){
        start=s;
        end=e;
    }
}
class EndPoint implements Comparable<EndPoint>{
    public int time;
    public boolean isStart;
    EndPoint(int t,boolean b){
        time=t;
        isStart=b;
    }
    @Override
    public int compareTo(EndPoint a){
        if(time!=a.time){
            return Integer.compare(time, a.time);
        }
        return isStart && !a.isStart?-1:!isStart &&a.isStart?1:0;
    }
    
}
public class P13point5Endpoint {
    public static int findMaxSimultaneousEvents(List<Event> a){
        List <EndPoint> merged=new ArrayList<>();
        for(Event e:a){
            merged.add(new EndPoint(e.start,true));
            merged.add(new EndPoint(e.end,false));
        }
        Collections.sort(merged);
        int maxOverlap=Integer.MIN_VALUE;
        int numOverlap=0;
        for(EndPoint e:merged){
            if(e.isStart){
                numOverlap++;
            }
            else{
                numOverlap--;
            }
            maxOverlap=Math.max(maxOverlap, numOverlap);
        }
        return maxOverlap;
    }
    public static void main(String[] args){
        Event a=new Event(1,5),b=new Event(2,7),c=new Event(4,5),d=new Event(6,10),e=new Event(8,9),f=new Event(9,17),g=new Event(11,13),h=new Event(12,15),i=new Event(14,15);
        List<Event> eList=new ArrayList(){{add(a);add(b);add(c);add(d);add(e);add(f);add(g);add(h);add(i);}};
        System.out.println(findMaxSimultaneousEvents(eList));
        
    }
}
