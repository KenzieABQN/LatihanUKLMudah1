package com.mycompany.latukl1;
/**Sebuah perusahaan ekspedisi ternama mengirimkan paket-paket ke berbagai daerah. Biaya pengiriman tergantung pada berat paket, jarak tempuh serta volume barang.. Berikut adalah detail biaya pengiriman per kilogram:
Jarak kurang dari atau sama dengan 10 km: Rp 4250 per kg
Jarak lebih dari 10 km: Rp 6000 per kg
Volume paket akan dikenakan biaya Rp 50.000,- ketika volume melebihi 100 cm^3. 
Buatlah sebuah program dalam bahasa Java untuk menghitung biaya total pengiriman berdasarkan berat paket jarak tempuh serta volume barang yang diketahui dengan menginputkan panjang, lebar serta tinggi dari paket.

/**
 *
 * @author Kenji
 */
import java.util.Scanner;
public class LatUKL1 {

   
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jarak Pengiriman (km): ");
        int jarak = input.nextInt();
        
        int harga = 0;
        
        if(jarak <= 10)
        {
            harga = 4250;
        }
        else
        {
            harga = 6000;
        }
        System.out.print("Berat Paket (kg): ");
        int berat = input.nextInt();
        
        System.out.print("Panjang Paket: ");
        int p = input.nextInt();
        System.out.print("Lebar Paket: ");
        int l = input.nextInt();
        
        int v = p * l;
        
        int biaya = 0;
        if(v > 100)
        {
            biaya = 50000;
        }
        int total = harga * berat + biaya;
        System.out.println("Biaya total pengiriman adalah: " + total);
    }
}
