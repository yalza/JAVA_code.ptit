package Array;

import java.util.Scanner;

public class So_Khong_Lien_Ke {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            String s= scan.next();
            System.out.println(Ktra(s));
        }
    }
    public static String Ktra(String s){
        int sum=s.charAt(0)-48;
        for(int i=1;i<s.length();i++){
            sum+=s.charAt(i)-48;
            if(Math.abs(((int)s.charAt(i)-(int)s.charAt(i-1)))!=2){
                return "NO";
            }
        }
        if(sum%10!=0)return "NO";
        return "YES";
    }
}
