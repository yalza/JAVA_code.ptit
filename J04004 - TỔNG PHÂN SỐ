package b14;

import java.util.Scanner;

public class tongphanso {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ps a = new ps(in.nextLong(), in.nextLong());
        ps b = new ps(in.nextLong(), in.nextLong());
        a.CongPS(b);
    }
}

class ps {

    private long tuso;
    private long mauso;

    public ps(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void setTuso(long tuso) {
        this.tuso = tuso;
    }

    public void setMauso(long mauso) {
        this.mauso = mauso;
    }

    public long getTuso() {
        return tuso;
    }

    public long getMauso() {
        return mauso;
    }

    public long gcd(long a, long b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }
    }

    public void rutgon(){
        if(this.getMauso()==1)
            System.out.println(this.getTuso());
        else{
            long t= this.getTuso()/gcd(this.getMauso(),this.getTuso());
            long m= this.getMauso()/gcd(this.getTuso(),this.getMauso());
            System.out.println(t+"/"+m);
        }
    }

    public void CongPS(ps ps) {
        long t = this.getMauso() * ps.getTuso() + this.getTuso() * ps.getMauso();
        long m = this.getMauso() * ps.getMauso();
        this.setTuso(t);
        this.setMauso(m);
        rutgon();
    }
}
