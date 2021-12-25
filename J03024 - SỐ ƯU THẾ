package String;

import java.util.Scanner;

public class So_Uu_The {
    public static String sut(String s){
        int a=0,b=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') return "INVALID";
            if((int)s.charAt(i)%2==0)a++;
            else b++;
        }
        if(a>b&&(a+b)%2==0||a<b&&(a+b)%2==1)return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            String s= scan.next();
            System.out.println(sut(s));
        }
    }
}
