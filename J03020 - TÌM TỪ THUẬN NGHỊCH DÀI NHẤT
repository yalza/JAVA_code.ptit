package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tim_tuz_thuan_Nghich_Dai_Nhaat {
    public static boolean tn(String s){
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> S=new ArrayList<>();
        while(scan.hasNext()){
            String s=scan.next();
            if(tn(s))S.add(s);
            if(s.isEmpty())break;
        }
        int max_Length=0;
        for(String s:S)max_Length= Math.max(max_Length,s.length());
        for(int i=0;i<S.size();i++){
            int x=0;
            for(int j=0;j<i;j++)
                if(S.get(i).equals(S.get(j)))x++;
            if(x>0)continue;
            if(S.get(i).length()==max_Length){
                int dem=0;
                for(int j=0;j<S.size();j++)
                    if(S.get(i).equals(S.get(j)))
                        dem++;
                System.out.println(S.get(i)+" "+dem);
            }
        }
    }
}
