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
public class so_dep_2 {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (Ktra(s) == 1 && Dao(s) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int Ktra(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        if (a[0] == '8' && a[a.length - 1] == '8') {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + (int) (a[i] - '0');
            }
            if (sum % 10 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static int Dao(String s) {
        String a = new StringBuffer(s).reverse().toString();
        if (a.equals(s)) {
            return 1;
        } else {
            return 0;
        }
    }
}
