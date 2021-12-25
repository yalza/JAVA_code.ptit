package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day_Con_Co_Tong_Nguyen_To {
    public static boolean snt(int n){
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)return false;
            return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            ArrayList<Integer> M=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=scan.nextInt();
                M.add(x);
            }
            Collections.sort(M);
            Collections.reverse(M);
            int[] A=new int[n];
            Arrays.fill(A,0);
            while (true){
                int a=0;
                for(int i=n-1;i>=0;i--){
                    if(A[i]==0){
                        A[i]=1;
                        a++;
                        for(int j=i+1;j<n;j++)A[j]=0;
                        break;
                    }
                }
                if(a==0)break;
                int sum=0;
                for(int i=0;i<n;i++)sum+=A[i]*M.get(i);
                if(snt(sum)) {
                    for (int i = 0; i < n; i++)
                        if (A[i] == 1) System.out.print(M.get(i) + " ");
                    System.out.println();
                }
            }
        }
    }
}
