package Array;


import java.util.ArrayList;
import java.util.Scanner;

public class Sap_Xep_Chon_Liet_Ke_Nguoc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] M=new int[n];
        for(int i=0;i<n;i++){
            M[i]= scan.nextInt();
        }
        ArrayList<ArrayList<Integer>> N=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (M[min] > M[j]) {
                    min = j;
                }
            }
            ArrayList<Integer> A=new ArrayList<>();
                int x=M[i];M[i]=M[min];M[min]=x;
                for(int j=0;j<n;j++)A.add(M[j]);
                N.add(A);
        }

        for(int i=N.size()-1;i>=0;i--){
            System.out.print("Buoc "+(i+1)+": ");
            for(int j=0;j<N.get(i).size();j++){
            System.out.print(N.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
