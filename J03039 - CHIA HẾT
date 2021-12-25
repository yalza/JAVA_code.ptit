package String;

import java.math.BigInteger;
import java.util.Scanner;

public class Chia_Het {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            BigInteger a=scan.nextBigInteger();
            BigInteger b=scan.nextBigInteger();
            if(a.compareTo(b)<0){
                BigInteger c=a;a=b;b=c;
            }
            BigInteger d=a.divide(b);
            if(a.compareTo(d.multiply(b))==0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
