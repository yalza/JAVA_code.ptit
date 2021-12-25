package Array;

import java.util.*;

public class Sap_Xep_Chen_Liet_Ke_Nguoc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        ArrayList<Integer> M=new ArrayList<>();
        ArrayList<ArrayList<Integer>> N=new ArrayList<>();

        for(int i=0;i<n;i++){
            int a= scan.nextInt();
            M.add(a);
        }
        for(int i=0;i<n;i++){
            ArrayList<Integer> A=new ArrayList<>();
            for(int j=0;j<=i;j++)A.add(M.get(j));
            Collections.sort(A);
            N.add(A);
        }
        for(int i=N.size()-1;i>=0;i--){
            System.out.print("Buoc "+(i)+": ");
            N.get(i).forEach(x-> System.out.print(x+" "));
            System.out.println();
        }
    }
}
