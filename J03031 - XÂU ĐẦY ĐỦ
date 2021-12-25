package String;

import java.util.Arrays;
import java.util.Scanner;

public class Xau_Day_Du {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            String s=scan.next();
            int k= scan.nextInt();
            int[] M=new int[200];
            Arrays.fill(M,0);
            for(int i=0;i<s.length();i++)
                M[s.charAt(i)]++;
            int a=0;
            for(int i='a';i<='z';i++)
                if(M[i]>0)a++;
            int x=s.length()-a;
            if(k+a>=26&&s.length()>=26) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
