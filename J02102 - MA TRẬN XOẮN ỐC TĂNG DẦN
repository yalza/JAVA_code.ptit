package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ma_Tran_Xoan_Oc_Tang_Dan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[][] M=new int[n][n];
        ArrayList<Integer> A=new ArrayList<>();
        for(int i=0;i<n;i++)for(int j=0;j<n;j++) {
            M[i][j] = scan.nextInt();
            A.add(M[i][j]);
        }
        Collections.sort(A);
        int x=0;
        int c=n;
        for(int i=0;i<=c/2;i++){
            for(int j=i;j<n;j++)M[i][j]=A.get(x++);
            for(int j=i+1;j<n;j++) M[j][n-1]=A.get(x++);
            for(int j=n-2;j>=i;j--)M[n-1][j]=A.get(x++);
            for(int j=n-2;j>i;j--)M[j][i]=A.get(x++);
            n--;
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++)
                System.out.print(M[i][j]+" ");
            System.out.println();
        }
    }
}
