package Array;

import java.util.Scanner;

public class Ma_Tran_Nhi_Phan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] M=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                M[i][j]= scan.nextInt();

        int cnt=0;
        for(int i=0;i<n;i++){
            int a=0,b=0;
            for(int j=0;j<3;j++){
                if(M[i][j]==1)a++;
                else b++;
            }
            if(a>b)cnt++;
        }
        System.out.println(cnt);
    }
}
