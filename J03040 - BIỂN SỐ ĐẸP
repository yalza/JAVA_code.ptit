package String;

import java.util.Scanner;

public class Bien_So_Dep {
    public static boolean  Bien_So_Dep1(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)>=s.charAt(i))
                return false;
        }
        return true;
    }
    public static boolean  Bien_So_Dep2(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i))
                return false;
        }
        return true;
    }
    public static boolean  Bien_So_Dep4(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='6'&&s.charAt(i)!='8')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            String s= scan.next();
            String a=s.substring(5,8);
            String b=s.substring(9,11);
            s=a+b;
            if(Bien_So_Dep2(s)||Bien_So_Dep1(s)||Bien_So_Dep4(s)||(Bien_So_Dep2(a)&&Bien_So_Dep2(b)))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
