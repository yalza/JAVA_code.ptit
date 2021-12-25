package UngdungLopCollection;

import java.util.Scanner;

public class Hinh_Sao {
    public static String Ktra(int[] M,int[] N,int n){
        for(int i=1;i<n-1;i++){
            if(M[i]!=M[i-1]&&M[i]!=N[i-1]&&N[i]!=N[i-1]&&N[i]!=M[i-1])
                return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] M=new int[n];
        int[] N=new int[n];
        for(int i=0;i<n-1;i++){
            M[i]= scan.nextInt();
            N[i]= scan.nextInt();
        }
        System.out.println(Ktra(M,N,n));
    }
}
