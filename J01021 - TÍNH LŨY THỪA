package JavaBasic;

import java.util.Scanner;

public class Tichluythua {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=1000000007;
        while(true){
            long a=scan.nextLong();
            long b=scan.nextLong();
            if(a==0&&b==0)break;
            long x=1,s=1;
            while(b>1){
                if(b%2==0){
                    a*=a;
                    a%=n;
                    b/=2;
                }
                else{
                    s*=a;
                    s%=n;
                    b--;
                }
            }
            if(b==0) System.out.println("1");
            else
            System.out.println((long)a*s%n);
        }
    }
}
