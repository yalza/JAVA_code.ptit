package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Thu_Gon_Day_So {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        ArrayList<Integer> M=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=scan.nextInt();
            M.add(a);
        }
        while (true) {
            int a=0;
            for (int i = 0; i < M.size() - 1; i++) {
                if ((M.get(i) + M.get(i + 1)) % 2 == 0) {
                    M.remove(i);
                    M.remove(i);
                    a++;
                }
            }
            if(a==0)break;
        }
        System.out.println(M.size());
    }
}
