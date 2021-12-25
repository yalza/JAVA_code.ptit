package ptsnt;

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        for(int i=1;i<=t;i++){
            int n=scan.nextInt();
        System.out.print("Test "+i+": ");
            Prime_Factorization(n);
        }
    }
    public static void Prime_Factorization(int n){
        int count2=0;
        while(n%2==0){
            count2++;n/=2;
        }
        if(count2>0) System.out.print(+2+"("+count2+") ");
        for(int i=3;i<=n;i++){
            int count=0;
            while(n%i==0){
                count++;n/=i;
            }
            if(count>0)
            System.out.print(+i+"("+count+") ");
        }
        if(n>1) System.out.print(+n+"("+1+")");
        System.out.println();
    }
}
