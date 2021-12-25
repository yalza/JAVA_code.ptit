package UngdungLopCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cap_So_Co_Tong_Bang_K {
    static int upper_bound(int arr[], int key,int x)
    {
        int mid, N = arr.length;
        int low = x+1;
        int high = N;
        while (low < high && low != N) {
            mid = low + (high - low) / 2;
            if (key >= arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        if (low == N ) {
            return N;
        }
        return low;
    }
    static int lower_bound(int array[], int key,int x)
    {
        int low = x+1, high = array.length;
        int mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (key <= array[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        if (low < array.length && array[low] < key) {
            low++;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n= scan.nextInt();
            int k= scan.nextInt();
            int[] M=new int[n];
            for(int i=0;i<n;i++)M[i]= scan.nextInt();
            Arrays.sort(M);
            long res=0;
            for(int i=0;i<n-1;i++){
                res+=upper_bound(M,k-M[i],i)-lower_bound(M,k-M[i],i);
            }
            System.out.println(res);
        }
    }
}
