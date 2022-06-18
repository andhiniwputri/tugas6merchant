/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Tugas6pbo {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        // input data merchant
        datamerchant.merchant = datamerchant.tambahMerchant(new merchant("Bakso Pak Sahid", "Bakso", 8000));
        datamerchant.merchant = datamerchant.tambahMerchant(new merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        datamerchant.merchant = datamerchant.tambahMerchant(new merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));

        System.out.println("Nama\t : andhini widyasari");
        System.out.println("NIM\t : 215150607111007");
        datamerchant.tampilData();
        System.out.println();

       //tambah data merchant dengan inputan
        System.out.println("===Memasukkan Data Merchant Melalui Input===");
        System.out.print("Input Nama Merchant : ");
        String nm = scan.nextLine();
        System.out.print("Input Nama Produk : ");
        String np = scan.nextLine();
        System.out.print("Input Harga Produk : ");
        double h = scan.nextDouble();
        scan.nextLine();

        datamerchant.merchant = datamerchant.tambahMerchant(new merchant(nm, np, h));
        System.out.println();

        //menampilkan data merchant
        System.out.println("===Menampilkan Data Merchant===");
        datamerchant.tampilData();
        System.out.println();

        //mengubah data merchant
        datamerchant.updateMerchant(datamerchant.cariMerchant("Bakso Pak Sahid"), "Bakso Pak Sahid", "Bakso Mercon", 15000);

        //menampilkan data merchant yang diupdate
        System.out.println("===Menampilkan Data Merchant yang nilainya sudah di update===");
        datamerchant.tampilMerchant(datamerchant.cariMerchant("Bakso Pak Sahid"))

    }
    
}
