/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan28gantikata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil kata yang akan diganti dalam sebuah kalimat
 *
 */

public class PBO10K10119918Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimatAwal, kalimatBaru, kataDiganti, kataPengganti;

        System.out.println("====Program Mengganti Kata====\n");

        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scanner.nextLine();

        System.out.print("Ganti Kata : ");
        kataDiganti = scanner.nextLine();

        System.out.print("Menjadi Kata : ");
        kataPengganti = scanner.nextLine();

        kalimatBaru = kalimatAwal.replace(kataDiganti, kataPengganti);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimatAwal);
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
    
}
