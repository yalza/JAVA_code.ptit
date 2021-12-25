package UngdungLopCollection;

import java.util.Scanner;
import java.util.Stack;

public class Day_Ngoac_Dung_Dai_Nhat {
    public static int max_day(String s){
        Stack<Integer> S=new Stack<>();
        S.push(-1);
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')S.push(i);
            else {
                S.pop();
                if(S.size()>0)
                    res=Math.max(res,i-S.peek());
                if(S.size()==0)S.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0) {
            String s = scan.next();
            System.out.println(max_day(s));
        }
    }
}
