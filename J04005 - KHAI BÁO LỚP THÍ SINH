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
public class KHAI_BÁO_LỚP_THÍ_SINH {

    public static void main(String[] args) {
        thisinh ts = new thisinh();
        ts.nhap();
        ts.thongtin();
    }
}

class thisinh {

    private String hoten;
    private String tuoi;
    private float diem1, diem2, diem3;

    public thisinh() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        hoten = sc.nextLine();
        tuoi = sc.nextLine();
        diem1 = sc.nextFloat();
        diem2 = sc.nextFloat();
        diem3 = sc.nextFloat();
    }

    public void thongtin() {
        float tong = diem1 + diem2 + diem3;
        System.out.print(hoten + " " + tuoi+" ");
        System.out.printf("%.1f", tong);
    }
}
