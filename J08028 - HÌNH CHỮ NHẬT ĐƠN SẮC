package UngdungLopCollection;

import java.util.Scanner;
import java.util.Stack;

public class Hinh_Chu_Nhat_Don_Sac {
    public static long hcn_max(int[] M,int n){
        Stack<Integer> X=new Stack<>();
        long res=0;
        int i=0;
        while(i<n){
            if(X.isEmpty()||M[i]>=M[X.peek()])
                X.push(i++);
            else{
                int x=X.peek();
                X.pop();
                if(X.isEmpty())res=Math.max(res,(long)M[x]*i);
                else res=Math.max(res,(long)M[x]*(i-X.peek()-1));
            }
        }
        while(!X.isEmpty()){
            int x=X.peek();
            X.pop();
            if(X.isEmpty())res=Math.max(res,(long)M[x]*i);
            else res=Math.max(res,(long)M[x]*(i-X.peek()-1));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k= scan.nextInt(),n= scan.nextInt();
        int[] M=new int[n];
        int[] N=new int[n];
        for(int i=0;i<n;i++){
            M[i]= scan.nextInt();
            N[i]=k-M[i];
        }
        System.out.println(Math.max(hcn_max(M,n),hcn_max(N,n)));
    }
}
