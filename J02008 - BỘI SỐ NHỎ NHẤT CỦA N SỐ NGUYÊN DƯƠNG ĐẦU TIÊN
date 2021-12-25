/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b14;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class bcnn_cua_n_so {

    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            long a, kq = 1;
            a = sc.nextInt();
            for (long i = 1; i <= a; i++) {
                kq = bcnn(kq, i);
            }
            System.out.println(kq);
        }
    }

    public static long bcnn(long a, long b) {
        return a * b / ucln(a, b);
    }

    public static long ucln(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;

    }
}
