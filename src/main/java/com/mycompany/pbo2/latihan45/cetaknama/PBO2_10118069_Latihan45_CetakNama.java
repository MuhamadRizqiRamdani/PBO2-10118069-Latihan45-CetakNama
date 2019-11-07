/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : cetak nama
 */
public class PBO2_10118069_Latihan45_CetakNama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer print = new Printer();
        System.out.println("===== Aplikasi Pencetak Nama =====");
        System.out.print("Masukan Nama Anda : " );
        print.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(scanner.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
        
    }
}
