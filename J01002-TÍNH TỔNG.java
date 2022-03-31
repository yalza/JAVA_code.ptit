/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tinh_tong {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            long n;
            n = sc.nextInt();
            long sum = n*(n+1)/2;
            System.out.println(sum);
        }
    }
}
