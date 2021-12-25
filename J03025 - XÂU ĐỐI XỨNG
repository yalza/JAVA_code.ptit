package String;

import java.util.Scanner;

public class Xau_Doi_Xung {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            String s= scan.next();
            int dem=0;
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)!=s.charAt(s.length()-i-1))
                    dem++;
            if(dem==2||s.length()%2==1&&dem==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
