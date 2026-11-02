package Jobsheet8;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        int jumlahAngka = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print((j+1)+" ");
                j++;
                jumlahAngka++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Jumlah angka yang dicetak: " + jumlahAngka);
        sc.close();
    }
}
