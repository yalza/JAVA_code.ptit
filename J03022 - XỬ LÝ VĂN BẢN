package String;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Xu_Ly_Van_Ban {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a="";
        ArrayList<String> S=new ArrayList<>();
        while(scan.hasNext()){
            String s= scan.next();
            if(s.charAt(s.length()-1)=='.'||s.charAt(s.length()-1)=='!'||s.charAt(s.length()-1)=='?') {
                a+=s.substring(0,s.length()-1);
                S.add(a.trim().toLowerCase(Locale.ROOT));
                a="";
            }
            else a+=s+" ";
            if(s.isEmpty())break;

        }
        for(String x:S) {
            for(int i=0;i<x.length();i++)
                if(i==0) System.out.print((char)(x.charAt(i)-32));
            else System.out.print(x.charAt(i));
            System.out.println();
        }

    }
}
