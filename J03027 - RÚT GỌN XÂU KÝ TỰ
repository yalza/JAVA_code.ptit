package String;

import java.util.Scanner;

public class Rut_gon_Xau_Ki_Tu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      

       
            String s=scan.next();
            while(true) {
                int x=0;
                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        x++;
                        s = s.substring(0, i) + s.substring(i + 2, s.length());
                    }
                }
                if(x==0)break;
            }
            if(s.length()==0) System.out.println("Empty String");
            else System.out.println(s);
        

    }
}
