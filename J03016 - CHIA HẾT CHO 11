package String;

import java.util.Scanner;

public class Chia_Het_cho_11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            String s=scan.next();
            int a=0,b=0;
            for(int i=0;i<s.length();i++){
                if(i%2==0)a+=s.charAt(i)-48;
                else b+=s.charAt(i)-48;
            }
            if((a-b)%11==0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
