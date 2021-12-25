/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 44;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class chuan_hoa_xau_ho_ten_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            chuanhoa(s);
        }
    }

    public static void chuanhoa(String s) {
        String a = s.trim();
        while (a.contains("  ") == true) {
            a = a.replace("  ", " ");
        }
        String arr[] = a.split(" ");
        a = "";
        for (int i = 1; i < arr.length; i++) {
            a += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        a = a.trim();
        a = a + "," + " " + arr[0].substring(0).toUpperCase();
        System.out.println(a);
    }
}
