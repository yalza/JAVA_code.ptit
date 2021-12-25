package snt;
import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            if(Prime(n)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }

   public static int Prime(int n){
        if(n<2)return 0;
        else
            for(int i=2;i<= Math.sqrt(n);i++)
                if(n%i==0)return 0;
                return 1;
   }
}
