/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class diem_can_bang {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int[] a;
            a = new int[n];
            int sumL = 0, sumR = 0, sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int index = -1;
            for (int i = 0; i < n; i++) {
                sumR = sumR + a[i];
            }
            for (int i = 0; i < n; i++) {
                sumR = sumR - a[i];
                if (sumR == sumL) {
                    index=i+1;
                    break;
                }
                sumL = sumL + a[i];
            }
            System.out.println(index);
        }
    }
}
