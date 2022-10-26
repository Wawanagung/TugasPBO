/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author muhyiddin
 */
public class biodata {
    public static void main(String[] args) {
        String nama, alamat;
        int nis,usia;
        double tinggi;
        
        Scanner biodata= new Scanner(System.in);
        System.out.println("Nama saya adalah :");
        nama= biodata.nextLine();
        System.out.println("Alamat saya adalah :");
        alamat= biodata.nextLine();
        System.out.println("Nis saya adalah :");
        nis= biodata.nextInt();
        System.out.println("Usia  saya adalah :");
        usia = biodata.nextInt();
        System.out.println("Tinggi saya adalah :");
        tinggi= biodata.nextDouble();
        
        
        
        
    }
}
