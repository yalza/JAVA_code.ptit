package JavaBasic;

import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while (t-->0){
            String s=scan.next();
            System.out.println(So_Lien_Ke(s));
        }

    }
    public static String So_Lien_Ke(String s){
        char[] a=s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(Math.abs((int)a[i]-(int)a[i-1])!=1)return "NO";
        }
        return "YES";
    }
}
