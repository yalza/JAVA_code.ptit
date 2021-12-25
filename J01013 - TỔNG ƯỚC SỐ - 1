package JavaBasic;

import java.util.Scanner;

public class TongUocSo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        long sum=0;
        boolean[] check=new boolean[2000001];
        for(int i=0;i<2000000;i++)check[i]=true;
        for(int i=2;i<2000000;i++){
            if(check[i]==true)
                for(int j=2*i;j<2000000;j+=i)
                    check[j]=false;
        }
        while(t-->0){
            int n=scan.nextInt();
            for(int i=2;i<=n;i++){
                if(check[n]==true) {
                    sum += n;break;
                }
                if(check[i]==true) {
                    while (n % i == 0) {
                        sum += i;
                        n /= i;
                    }
                }
            }
        }
        System.out.println(+sum);
    }

}
