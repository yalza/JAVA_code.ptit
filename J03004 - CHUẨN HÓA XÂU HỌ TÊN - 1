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
public class Chuan_hoa_xau_1 {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s;
            s = sc.nextLine();
            chuanhoa(s);
        }
    }

    public static void chuanhoa(String s) {
        String a = s.trim();
        while (a.contains("  ") == true) {
            a = a.replace("  ", " ");
        }
        String[] arr = a.split(" ");
        a = "";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        a = a.trim();
        System.out.println(a);
    }
}
