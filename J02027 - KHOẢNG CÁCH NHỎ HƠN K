package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Khoang_Cach_Nho_Hon_K {
    static int LowerBound(ArrayList<Integer> a, int x,int n) { // x is the target value or key
        int l=-1,r=n;
        while(l+1<r) {
            int m=(l+r)>>>1;
            if(a.get(m)>=x) r=m;
            else l=m;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n= scan.nextInt();
            int k= scan.nextInt();
            ArrayList<Integer> M=new ArrayList<>();
            for(int i=0;i<n;i++){
                int o=scan.nextInt();M.add(o);
            }
            Collections.sort(M);
            long count=0;
            for(int i=0;i<n;i++){
                int x=LowerBound(M,M.get(i)+k,n);
                if(x-i-1>0)
                    count+=x-i-1;
            }
            System.out.println(count);
        }
    }
}
