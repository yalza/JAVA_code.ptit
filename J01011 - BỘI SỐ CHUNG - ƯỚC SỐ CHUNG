package gcd;
import java.util.Scanner;

public class BoiSoChungUocSoChung {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int m=scan.nextInt();
            int n=scan.nextInt();
            System.out.println(+(long)m*n/gcd(m,n)+" "+gcd(m,n));
        }
    }
    public static int gcd(int m,int n){
        for (int i=m;i>=1;i--){
            if(m%i==0&&n%i==0)
                return i;
        }
        return 1;
    }
}
