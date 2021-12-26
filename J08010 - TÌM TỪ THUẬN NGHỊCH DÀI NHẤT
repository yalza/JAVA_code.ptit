package UngdungLopCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tim_Tu_Thuan_Nghich_Dai_Nhat {
    public static boolean Ktra(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> S=new ArrayList<>();
        int max_len=0;
        while(scan.hasNext()){
            String s= scan.next();
            if(Ktra(s)){
                S.add(s);
                max_len=Math.max(max_len,s.length());
            }
            if(s.isEmpty())break;
        }
        for(int i=0;i<S.size();i++){
            int z=0;
            for(int j=0;j<i;j++)
                if(S.get(i).equals(S.get(j)))
                    z++;
            if(z>0)continue;
            if(S.get(i).length()==max_len){
                int cnt=0;
                for(int j=0;j<S.size();j++)
                    if(S.get(i).equals(S.get(j)))
                        cnt++;
                System.out.println(S.get(i)+" "+cnt);
            }
        }
    }
}
