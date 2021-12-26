package UngdungLopCollection;

import java.util.Scanner;

public class Phan_Tu_Dau_Tien_Ben_Phai_Lon_Hon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] M = new int[n];
            for (int i = 0; i < n; i++) M[i] = scan.nextInt();
            for(int i=0;i<n;i++){
               int x=0;
               for(int j=i;j<n;j++){
                   if(M[j]>M[i]) {
                       System.out.printf(M[j] + " ");
                       x = 1;
                       break;
                   }
               }
                if(x==0) System.out.print("-1 ");
            }
            System.out.println();
        }
    }
}
