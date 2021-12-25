package String;

import java.math.BigInteger;
import java.util.Scanner;

public class Hieu_2_So_Nguyen_Lon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            BigInteger a=scan.nextBigInteger();
            BigInteger b=scan.nextBigInteger();
            BigInteger x=a.subtract(b);
            x=x.abs();
            String s=x.toString();
            String m=a.toString();
            String n=b.toString();
            int maxx=Math.max(m.length(),n.length());
            while(s.length()<maxx){
                s="0"+s;
            }
            System.out.println(s);
        }
    }
}
