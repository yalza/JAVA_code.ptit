/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class so_dep_1 {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (ktraChan(s) == 1 && ktraDao(s) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int ktraDao(String s) {
        String a = s;
        a = new StringBuffer(s).reverse().toString();
        if (a.equals(s)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int ktraChan(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
