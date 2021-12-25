/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class phanso {

    public static void main(String[] args) {
        phanSo tm = new phanSo();
        tm.nhap();
        tm.rutgon();
    }
}

class phanSo {

    private long tuso;
    private long mauso;

    public phanSo() {

    }

    public phanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        tuso = sc.nextLong();
        mauso = sc.nextLong();
    }

    void rutgon() {
        long ts = tuso;
        long ms = mauso;
        long temp;
        while (ms > 0) {
            temp = ts % ms;
            ts = ms;
            ms = temp;
        }
        System.out.println(tuso / ts + "/" + mauso / ts);
    }
}
