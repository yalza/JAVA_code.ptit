package JavaBasic;

import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            long n= scan.nextLong();
            System.out.println(stp(n));
        }

    }
    public static String stp(long a){
        while(a!=0){
            if(a%10>2)return "NO";
            a/=10;
        }
        return "YES";
    }
}
