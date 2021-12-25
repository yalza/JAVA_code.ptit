package UngdungLopCollection;

import java.util.Scanner;
import java.util.Stack;

public class Kiem_Tra_Day_Ngoac_Dung {
    public static String Ktra(String s){
        Stack<Character> S=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(S.empty()||s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                S.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==S.peek()+1||s.charAt(i)==S.peek()+2)S.pop();
                else
                    return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            String s=scan.next();
            System.out.println(Ktra(s));
        }
    }
}
