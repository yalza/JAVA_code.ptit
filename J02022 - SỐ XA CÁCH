package Array;

import java.util.Scanner;

public class So_Xa_Cah {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n= scan.nextInt();
            boolean x=false;
            int[] M=new int[n+1];
            for(int i=1;i<=n;i++){
                M[i]=i;
            }
            while(!x){
                if(Ktra(M,n))in(M,n);
                int i=n-1;
                while(M[i]>M[i+1]&&i>0)i--;
                if(i<=0)x=true;
                else{
                    int k=n;
                    while(M[i]>M[k])k--;
                    int z=M[i];M[i]=M[k];M[k]=z;
                    int l=i+1,r=n;
                    while(l<=r){
                        int v=M[l];M[l]=M[r];M[r]=v;
                        l++;r--;
                    }
                }
            }
        }
    }
    public static void in(int[] M,int n){
        for(int i=1;i<=n;i++) System.out.print(M[i]);
        System.out.println();
    }
    public static boolean Ktra(int[] M,int n){
        for(int i=2;i<=n;i++){
            if(Math.abs(M[i]-M[i-1])==1)return false;
        }
        return true;
    }
}
