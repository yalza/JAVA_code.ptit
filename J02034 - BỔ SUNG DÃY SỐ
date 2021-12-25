package Array;

import java.util.*;

public class Bo_Sung_Day_So {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        ArrayList<Integer> M=new ArrayList<>();
        Set<Integer> X=new HashSet<>();
        int maxx=0;
        for(int i=0;i<n;i++){
            int a= scan.nextInt();
            maxx=Math.max(maxx,a);
            M.add(a);
            X.add(a);
        }
        int a=0;
        for(int i=1;i<=maxx;i++){
            if(X.contains(i)==false) {
                System.out.println(i);
                a++;
            }
        }
        if(a==0) System.out.println("Excellent!");
    }
}
