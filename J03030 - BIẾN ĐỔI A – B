package nguyenngoctoanvipproB20DCPT173;
import java.util.Scanner;

public class BiendoiAB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char[] a=s.toCharArray();
        int count=0;
        for(int i=1;i<s.length()-1;i++) {
            if (a[i - 1] == 'A' && a[i] == 'B' && a[i + 1] == 'A') {
                a[i] = 'A';
                count++;
            }
            if (a[i - 1] == 'B' && a[i] == 'A' && a[i + 1] == 'B') {
                a[i] = 'B';
                count++;
            }
        }
        if (a[0] == 'B' && a[1] == 'A') {
            a[0] = 'A'; count++;
        }
        if (a[s.length() - 2] == 'A' && a[s.length() - 1] == 'B') {
            a[s.length() - 1] = 'A'; count++;
        }
        for (int i = 0; i < s.length() - 1; i++)
            if (a[i] != a[i + 1]) {
                count++;
            }
        if (a[0] == 'A' && a[s.length() - 1] == 'B')
            count++;
        if (a[0] == 'B' && a[s.length() - 1] == 'B')
            count++;
        System.out.println(count);
    }
}
