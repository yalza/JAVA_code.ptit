/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class dia_chi_email {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            String a = s.trim();
            a = a.toLowerCase();
            while (a.contains("  ") == true) {
                a = a.replace("  ", " ");
            }
            String arr[] = a.split(" ");
            a = "";
            a = a + arr[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                a = a + arr[i].charAt(0);
            }
            list.add(a);
            if (list.contains(a) == true) {
                if (Collections.frequency(list, a) > 1) {
                    a = a + Collections.frequency(list, a);
                }
            }
            a = a + "@ptit.edu.vn";
            System.out.println(a);
        }
    }
}
