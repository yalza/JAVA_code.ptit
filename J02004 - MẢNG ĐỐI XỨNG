/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class mangdoixung {
    public static void main(String[] args){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0){
            int n;
            n=sc.nextInt();
            int[] a;
            a=new int[n];
            int ok=1;
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n/2;i++){
                if(a[i]!=a[n-i-1])ok=0;
            }
            if(ok==1)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
