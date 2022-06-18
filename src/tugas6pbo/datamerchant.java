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
public class datamerchant {
    static merchant[] merchant = new merchant[0];

    public static merchant[] tambahMerchant (merchant m){
        merchant[] merch = new merchant[datamerchant.merchant.length + 1];

        for (int i = 0; i < datamerchant.merchant.length; i++){
            merch[i] = merchant[i];
        }

        merch[datamerchant.merchant.length] = m;
        return merch;
    }

    public static void tampilData(){
        for (merchant x : datamerchant.merchant) {
            System.out.println("=== Tampilan Data Merchant UBFOOD ===");
            System.out.println("Nama Merchant   : " + x.getNamaMerchant());
            System.out.println("Nama Produk     : " + x.getNamaProduk());
            System.out.println("Harga           : " + (int) x.getHargaMakanan());
        }   
    }
}
