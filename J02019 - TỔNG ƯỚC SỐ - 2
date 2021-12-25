package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Tong_Uoc_So_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int[] M=new int[b+1];
        Arrays.fill(M,0);
        for(int i=1;i<=b;i++){
            for(int j=2*i;j<=b;j+=i)
                M[j]+=i;
        }
        int cnt=0;
        for(int i=a;i<=b;i++)
            if(M[i]>i)cnt++;
        System.out.println(cnt);
    }
}
