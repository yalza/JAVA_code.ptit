package JavaBasic;

import java.util.Scanner;

public class DienChuSo {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int t=scan.nextInt();
      while(t-->0){
          String a=scan.next();
          String b=scan.next();
          System.out.println(+load(a,b));
      }
        }
    public static int load(String x,String s){
        char[] a=x.toCharArray();
        char[] b=s.toCharArray();
        int dem = 0;
        for (int i = 0; i < x.length(); i++) {
            if (a[i] != b[i]) {
                if (a[i] == '?') dem += ('9' - b[i]) * abcd(x, i);
                else {
                    if (a[i] < b[i]) return dem;
            
                    if (a[i] > b[i]) return dem + abcd(x, i);
                }
            }
        }
        return dem;
    }
    public static int abcd(String s,int n){
        char[] a=s.toCharArray();
        int kt = 1;
        for (int i = n + 1; i < s.length(); i++) if (a[i] == '?') kt *= 10;
        return kt;
    }
}
