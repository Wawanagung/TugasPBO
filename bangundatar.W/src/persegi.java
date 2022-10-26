/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class persegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sisi, keliling, luas;
        
        System.out.println("========== KELILING & LUAS PERSEGI PANJANG ==========\n\n");
        System.out.print("Masukkan sisi persegi    = ");
        sisi = sc.nextInt();
        
        keliling = 4 * sisi;
        luas = sisi * sisi;
        
        System.out.println("Keliling Persegi            = " +keliling);
        System.out.println("Luas Persegi               = " +luas);
    }
}
