package JavaBasic;

import java.util.Scanner;

public class Catdoi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0) {
            String s = scan.next();
            s = Cat_doi(s);
            if (s != "INVALID") {
                System.out.println(Long.parseLong(s));
            }
            else System.out.println(s);
        }
    }
    public static String Cat_doi(String s){
        char[] a=s.toCharArray();
        String x="";
        for(int i=0;i<s.length();i++){
            if(a[i]!='0'&&a[i]!='1'&&a[i]!='8'&&a[i]!='9')return "INVALID";
            if(a[i]=='0'||a[i]=='8'||a[i]=='9')x+="0";
            else x+="1";
        }
        char[] b=x.toCharArray();
        for(int i=0;i<x.length();i++)
            if(b[i]!='0')return x;
            return "INVALID";
    }
}
