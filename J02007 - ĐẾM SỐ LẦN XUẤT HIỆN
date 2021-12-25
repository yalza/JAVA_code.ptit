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
public class demsolanxh {
    public static void main(String[] args){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int test=1;
        while(t-->0){
            int n;
            n=sc.nextInt();
            int[] a;
            a=new int[n];
            int[] d;
            d=new int[100000];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                d[a[i]]++;
            }
            System.out.println("Test "+(test++)+":");
            for(int i=0;i<n;i++){
                if(d[a[i]]!=0){
                    System.out.println(a[i]+" xuat hien "+d[a[i]]+" lan");
                    d[a[i]]=0;
                }
            }
        }
    }
}
