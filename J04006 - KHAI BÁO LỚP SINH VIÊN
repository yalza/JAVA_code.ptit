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
public class khai_bao_lop_sinh_vien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ngsinh = sc.nextLine();
        float gpa = sc.nextFloat();
        sinhvien sv = new sinhvien();
        sv.setTen(ten);
        sv.setLop(lop);
        sv.setNgsinh(ngsinh);
        sv.setGpa(gpa);
        sv.show();
    }
}

class sinhvien {

    private String ten;
    private String lop;
    private String ngsinh;
    private float gpa;

    public sinhvien() {
        ten = "";
        lop = "";
        ngsinh = "";
        gpa = 0;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNgsinh(String ngsinh) {
        String s[] = ngsinh.split("/");
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].length() == 1) {
                s[i] = "0" + s[i];
            }
            this.ngsinh += s[i] + "/";
        }
        this.ngsinh += s[s.length - 1];
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void show() {
        float gpa = this.gpa;
        System.out.print("B20DCCN001" + " " + ten + " " + lop + " " + ngsinh + " ");
        System.out.printf("%.2f", gpa);
        System.out.println("");
    }
}
