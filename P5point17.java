
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
public class P5point17 {//actually 5.18//5.17 incomplete
    public static void spiraling(int[][] a,int n){
        //int[] c=new int[n*n];
        for(int i=0;i<Math.ceil(0.5*n);i++){
            if(i==n-i-1)
                System.out.println(a[i][i]);
            for(int j=i;j<n-i-1;j++){
                System.out.println(a[i][j]);
            }
            for(int j=i;j<n-i-1;j++){
                System.out.println(a[j][n-i-1]);
            }
            for(int j=n-i-1;j>i;j--){
                System.out.println(a[n-i-1][j]);
            }
            for(int j=n-i-1;j>i;j--){
                System.out.println(a[j][i]);
            }
        }
        //return c;
    }
    public static void main(String[] args){
        int[][] a={{1,3,4},{6,1,14},{5,6,9}};
        int[][] b={{2,3,4,6},{5,7,11,1},{10,8,12,13},{14,20,15,16}};
        spiraling(a,3);
        /*for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }*/
    }
}
