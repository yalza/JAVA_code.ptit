package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Sx_Doi_Cho_TT_Liet_Ke_Nguoc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int[] M=new int[n];
            for(int i=0;i<n;i++)M[i]=scan.nextInt();
            ArrayList<ArrayList<Integer>> N=new ArrayList<>();
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(M[i]>M[j]){
                        int x=M[j];M[j]=M[i];M[i]=x;
                    }
                }
                    ArrayList<Integer> A = new ArrayList<>();
                    for (int l = 0; l < n; l++) A.add(M[l]);
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
}
