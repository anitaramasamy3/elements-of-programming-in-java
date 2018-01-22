
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
public class P11point1 {
    public static int searchFirstOccurence(List<Integer> a,int k){
        int l=0,h=a.size()-1,m,res=-1;
        while(l<=h){
            m=l+(h-l)/2;
            if(a.get(m)<k)
                l=m+1;
            else if(a.get(m)>k)
                h=m-1;
            else{
                res=m;
                //break;
                h=m-1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        List<Integer> a=new ArrayList(){{add(285);add(285);add(285);add(285);add(285);add(285);}};
        System.out.println(searchFirstOccurence(a,285));
    }
}
