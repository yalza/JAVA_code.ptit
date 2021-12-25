package String;

import java.util.Collections;
import java.util.Scanner;

public class Dien_Thaoi_Cuc_Gach {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            String s= scan.next();
            String X="",S="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'||s.charAt(i)=='a'||s.charAt(i)=='c'||s.charAt(i)=='b')
                    X+=2;
                if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'||s.charAt(i)=='d'||s.charAt(i)=='e'||s.charAt(i)=='f')
                    X+=3;
                if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i')
                    X+=4;
                if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'||s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l')
                    X+=5;
                if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O'||s.charAt(i)=='m'||s.charAt(i)=='n'||s.charAt(i)=='o')
                    X+=6;
                if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='S'||s.charAt(i)=='p'||s.charAt(i)=='q'||s.charAt(i)=='r'||s.charAt(i)=='s')
                    X+=7;
                if(s.charAt(i)=='T'||s.charAt(i)=='V'||s.charAt(i)=='U'||s.charAt(i)=='t'||s.charAt(i)=='v'||s.charAt(i)=='u')
                    X+=8;
                if(s.charAt(i)=='W'||s.charAt(i)=='X'||s.charAt(i)=='Y'||s.charAt(i)=='Z'||s.charAt(i)=='w'||s.charAt(i)=='x'||s.charAt(i)=='y'||s.charAt(i)=='z')
                    X+=9;
            }

            for(int i=0;i<X.length();i++)S=X.charAt(i)+S;
            if(X.equals(S)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
