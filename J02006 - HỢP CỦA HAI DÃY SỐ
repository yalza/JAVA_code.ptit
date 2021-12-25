package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Giao_Cua_Hai_Day_So {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int[] M=new int[1001];
        int[] N=new int[1001];
        Arrays.fill(M,0);
        Arrays.fill(N,0);
        for(int i=0;i<m;i++){
            int x=scan.nextInt();
            M[x]++;
        }
        for(int i=0;i<n;i++){
            int x= scan.nextInt();
            N[x]++;
        }
        for(int i=0;i<1001;i++){
            if(M[i]!=0||N[i]!=0) System.out.print(i+" ");
        }
    }
}
