package String;

import java.util.Arrays;
import java.util.Scanner;

public class Danh_Dau_Chu_Cai {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s= scan.next();
        int[] M=new int[1000];
        Arrays.fill(M,0);
        for(int i=0;i<s.length();i++)
            M[s.charAt(i)]++;
        int res=0;
        for(int i=0;i<1000;i++)
            if(M[i]>0)res++;
        System.out.println(res);
    }
}
