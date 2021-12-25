package Array;

import java.util.*;

public class Day_Con_Lien_Tiep_Co_Tong_Bang_K {
    public static String Ktra(ArrayList<Long> M,int n,long k,Set<Long> X){
        if(k==0)return "NO";
        if(M.contains(k))return "YES";
        for(int i=0;i<n;i++){
            int z=X.size();
            X.add(M.get(i)+k);
            if(X.size()==z)return "YES";
            else
            X.remove(M.get(i)+k);
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n= scan.nextInt();
            long k= scan.nextLong();
            ArrayList<Long> M=new ArrayList<>();
            Set<Long> X=new HashSet<>();
            for(int i=0;i<n;i++){
                long s=scan.nextLong();
                if(i==0)
                M.add(s);
                else M.add(s+M.get(i-1));
                X.add(M.get(i));
            }
            System.out.println(Ktra(M,n,k,X));
        }
    }
}
