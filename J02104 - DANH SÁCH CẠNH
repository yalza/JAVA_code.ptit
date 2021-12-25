package Array;

import java.util.Scanner;

public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] M=new int[n+1][n+1];
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                M[i][j]=scan.nextInt();
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    if(M[i][j]==1){
                        System.out.println("("+i+","+j+")");
                    }
                }
            }
    }
}
