package Jobsheet8;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        int totalAngka = 0;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i*j + " ");
                totalAngka += i*j;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total angka yang dicetak: " + totalAngka);
        sc.close();
    }
}
