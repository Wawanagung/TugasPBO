/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.StrictMath.sqrt;
import java.util.Scanner;
/**
 *
 * @author muhyiddin
 */
public class segitiga {

    public static void main(String[] args) {
          double luas,m,kll;
          int alas, tinggi;
          
   // membuat Scanner baru
 Scanner hitung = new Scanner(System.in);
 
 // input
        System.out.println("***Program Hitung Segitiga***");
        System.out.println("input alas:");
        alas = hitung.nextInt();
        System.out.println("input tinggi:");
        tinggi = hitung.nextInt();
        
  //prosesluas
luas =Double.valueOf((alas*tinggi)/2);
System.out.println("Luas Segitiga = "+luas);
//proseskeliling
m = sqrt((alas*alas)+(tinggi*tinggi)); 
kll = alas+tinggi+m;
        System.out.println("Keliling Segitiga = "+kll);
    }
    
}
