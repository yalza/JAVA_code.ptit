package Array;

import java.security.KeyPair;
import java.util.Collections;
import java.util.Scanner;

public class Xep_Hang {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] M=new int[n];
        int[] N=new int[n];
        for(int i=0;i<n;i++){
            M[i]= scan.nextInt();
            N[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(M[j]<M[i]){
                    int a=M[i];M[i]=M[j];M[j]=a;
                    int b=N[i];N[i]=N[j];N[j]=b;
                }
            }
        }
       
        for(int i=0;i<n-1;i++){
            if(M[i]+N[i]>M[i+1])
                M[i+1]=M[i]+N[i];
        }
        System.out.println(M[n-1]+N[n-1]);
    }
}
