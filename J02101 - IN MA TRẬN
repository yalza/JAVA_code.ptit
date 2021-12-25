package Array;

import java.util.Scanner;

public class In_Ma_Tran {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n= scan.nextInt();
            int[][] M=new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    M[i][j]= scan.nextInt();

            for(int i=0;i<n;i++) {
                if(i%2==0){
                    for(int j=0;j<n;j++) System.out.print(M[i][j]+" ");
                }
                else
                    for(int j=n-1;j>=0;j--) System.out.print(M[i][j]+" ");

            }
            System.out.println();
        }
    }
}
