package String;

import java.util.Scanner;

public class Tim__So_Du {
    public static int du(String s){
        if(s.length()<9) {
            if (Integer.parseInt(s) % 4 == 0)
                return 4;
            else return 0;
        }
        else {
            if(((s.charAt(s.length()-2)-48)*10+s.charAt(s.length()-1)-48)%4==0)return 4;
            else
                return 0;
            }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            String s=scan.next();
            System.out.println(du(s));
        }
    }
}
