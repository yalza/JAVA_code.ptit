package String;

import java.io.InputStream;
import java.util.*;

public class Tap_Tu_Rieng_Cua_Hai_Xau {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        String o= scan.nextLine();
        while(t-->0){
            String a=scan.nextLine();
            String b=scan.nextLine();
            String[] S=a.split(" ");
            String[] X=b.split(" ");
            Set<String> A=new HashSet<>();
            Set<String> B=new HashSet<>();
            Collections.addAll(A,S);
            Collections.addAll(B,X);
            for(String d:A){
                if(B.contains(d)==false){
                    System.out.print(d+" ");
                }
            }
            System.out.println();
        }
    }
}
