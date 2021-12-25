package Fibonaci;

import java.util.Scanner;

public class TinhSoFIbonaci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0) {
            int n = scan.nextInt();
            System.out.println(Fibonaci(n));
        }

    }
    public static long Fibonaci(int n){
        long [] M=new long[100];
        M[0]=0;
        M[1]=1;
        for(int i=2;i<=n;i++){
            M[i]=M[i-1]+M[i-2];
        }
        return M[n];
    }
}
