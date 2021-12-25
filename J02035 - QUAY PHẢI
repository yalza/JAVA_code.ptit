package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quay_Phai {
    public static int Count(ArrayList<Integer> M,int minn,int maxx,int n){
        int cnt=0;
        while(true){
            if(M.get(0)==minn&&M.get(n-1)==maxx)return cnt;
            M.add(M.get(0));
            M.remove(0);
            cnt++;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            ArrayList<Integer> M=new ArrayList<>();
            int minn=10000000,maxx=0;
            for(int i=0;i<n;i++){
                int x= scan.nextInt();
                M.add(x);;
                minn=Math.min(minn,x);
                maxx=Math.max(maxx,x);
            }
            System.out.println(Count(M,minn,maxx,n));
        }
    }
}
