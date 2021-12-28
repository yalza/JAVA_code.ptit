package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chuan_Hoa_Xau_Ho_Ten_Trong_File {
    public static void main(String[] args)throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner scan=new Scanner(file);
        while(scan.hasNext()){
            String s= scan.nextLine();
            if(s.equals("END"))break;
            String[] x=s.split(" ");
            for(int i=0;i<x.length;i++){
                if(x[i]!="") {
                    for (int j = 0; j < x[i].length(); j++) {
                        if (j == 0)
                            System.out.print(Character.toUpperCase(x[i].charAt(j)));
                        else System.out.print(Character.toLowerCase(x[i].charAt(j)));
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
