package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Loai_Bo_So_Nguyen {
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
        ArrayList<String> S=new ArrayList<>();
        while(scan.hasNext()){
            String s=scan.next();
            if(!Ktra(s))S.add(s);
        }
        Collections.sort(S);
        for (String x: S) System.out.print(x+" ");
    }
}
