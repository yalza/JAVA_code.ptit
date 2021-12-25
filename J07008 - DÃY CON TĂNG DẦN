package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Xau_Con_Tang_Dan {
    public static void main(String[] args) throws FileNotFoundException{
        File file=new File("DAYSO.in");
        Scanner scan =new Scanner(file);
        ArrayList<Integer> M=new ArrayList<>();
        while (scan.hasNext()){
            int x=scan.nextInt();
            M.add(x);
        }
        int n=M.get(0);
        M.remove(0);
        int[] N=new int[n+1];
        Arrays.fill(N,0);
        ArrayList<String> S=new ArrayList<>();
        while(true){
            int a=0;
            for(int i=n-1;i>=0;i--){
                if(N[i]==0){
                    a++;
                    N[i]=1;
                    for(int j=i+1;j<n;j++)N[j]=0;
                    break;
                }
            }
            if(a==0)break;
            String s="";
            int x=0;
            int c=-10;
            boolean ok=true;
            for(int i=0;i<n;i++) {
                if (N[i] == 1) {
                    if(M.get(i)<=c)ok=false;
                    c=M.get(i);
                    x++;
                }
            }
            if(x>=2&&ok) {
                for (int j = 0; j < n; j++)
                    if (N[j] == 1) s += M.get(j) + " ";
                S.add(s);
            }
        }
        Collections.sort(S);
        for(String s:S) System.out.println(s);
    }
}
