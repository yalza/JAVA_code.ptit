package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dao_Dau {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] M=new int[n];
        for(int i=0;i<n;i++)M[i]= scan.nextInt();
        Arrays.sort(M);
        int x=0;
        int minn=1000000000;
        for(int i=0;i<n;i++){
            if(M[i]<0){
                x++;
            }
            minn=Math.min(Math.abs(M[i]),minn);
        }
        if(x>=k){
            long res1=0;
            for(int i=0;i<n;i++){
                if(i<k)res1+=-M[i];
                else res1+=M[i];
            }
            System.out.println(res1);
        }
        else{
            long res2=0;
            for(int i=0;i<n;i++)res2+=Math.abs(M[i]);
            k-=x;
            if(k%2==1)
                res2-=2*minn;
            System.out.println(res2);
        }
    }
}
