package Array;

import java.util.Scanner;

public class liet_Ke_To_Hop_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int k=scan.nextInt();
        int[] M=new int[k+1];
        for(int i=1;i<=k;i++)M[i]=i;
        int dem=0;
        boolean x=false;
        while(!x){
            Printf_Array(M,k);
            dem++;
            int a=0;
            for(int i=k;i>0;i--){
                if(M[i]!=n-k+i){
                    M[i]++;
                    a=1;
                    for(int j=i+1;j<=k;j++)M[j]=M[j-1]+1;
                    break;
                }
            }
            if(a==0)x=true;
        }
        System.out.println();
        System.out.println("Tong cong co "+dem+" to hop");
    }
    public static void Printf_Array(int[] M,int k){
        for(int i=1;i<=k;i++) System.out.print(M[i]);
        System.out.print(" ");
    }

}
