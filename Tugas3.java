package Jobsheet8;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal harus 1. Silakan input ulang!");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 1;
        int maxBarang = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i + " : ");

            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Silakan input ulang!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangPerToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print("  Jumlah barang pelanggan ke-" + j + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif. Silakan input ulang!");
                    }
                } while (jumlahBarang < 0);

                totalBarangPerToko += jumlahBarang;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangPerToko);
            System.out.println();

            totalBarangSeluruhToko += totalBarangPerToko;

            if (totalBarangPerToko > maxBarang) {
                maxBarang = totalBarangPerToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}