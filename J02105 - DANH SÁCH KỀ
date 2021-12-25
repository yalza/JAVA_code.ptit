package Array;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class DanhSachKe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[][] M=new int[n+1][n+1];
        for(int i=1;i<=n;i++)
            for (int j = 1; j <= n; j++)
                M[i][j] = scan.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("List("+i+") = ");
            for(int j=1;j<=n;j++){
                if(M[i][j]==1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

    }
}
