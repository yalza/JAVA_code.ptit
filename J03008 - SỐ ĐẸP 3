/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b19;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class sodep_3 {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (dao(s) == 1 && snt(s) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int dao(String s) {
        String a = new StringBuffer(s).reverse().toString();
        if (a.equals(s)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int snt(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int n = (int) (a[i] - '0');
            if (n != 2 && n != 3 && n != 5 && n != 7) {
                return 0;
            }
        }
        return 1;
    }
}
