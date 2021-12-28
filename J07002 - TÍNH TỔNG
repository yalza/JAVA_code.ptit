package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tinh_Tong {
    public static boolean Ktra(String s){
        long x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'9'||s.charAt(i)<'0')return false;
            x=x*10+s.charAt(i)-48;
            if(x>2000000000)return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner scan=new Scanner(file);
        long res=0;
        while(scan.hasNext()){
            String s=scan.next();
            if(Ktra(s))res+=Integer.parseInt(s);
        }
        System.out.println(res);
    }
}
