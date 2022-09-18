// 2502141233 - Aulia Rahma Azzahra

// import Scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean status = true;
        Scanner scan = new Scanner(System.in);

        // Deklarasi Variabel
        int banyakAngka = 0,
                bedaAngka = 0,
                aritmatika = 1,
                geometri = 1,
                faktorial = 1;

        while (status) {
            // judul program
            System.out.println("Belajar Deret Artimatika, Geometri, dan Menghitung Faktorial");

            do {
                System.out.print("Masukkan Banyak Angka Yang Mau Dicetak [2--10]\t: ");
                try {
                    banyakAngka = Integer.parseInt(scan.nextLine());
                    if (banyakAngka < 2 || banyakAngka > 10) {
                        System.out.println("Silakan Coba Lagi, hanya angka 2 sampai dengan 10 yang bisa dimasukkan");
                    }
                } catch (Exception e) {
                    System.out.println((e));
                }
            } while (banyakAngka < 2 || banyakAngka > 10);

            do {
                System.out.print("Masukkan Beda Masing-Masing Angka [2--9]\t\t: ");
                try {
                    bedaAngka = Integer.parseInt(scan.nextLine());
                    if (bedaAngka < 2 || bedaAngka > 9) {
                        System.out.println("Silakan Coba Lagi, hanya angka 2 sampai dengan 10 yang bisa dimasukkan");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } while (bedaAngka < 2 || bedaAngka > 9);

            System.out.println("Deret Aritmatika : ");
            for (int x = 1; x <= banyakAngka; x++) {
                System.out.print(aritmatika + " ");
                aritmatika += bedaAngka;
            }

            System.out.println("\nDeret Geometri : ");
            for (int x = 1; x <= banyakAngka; x++) {
                System.out.print(geometri + " ");
                geometri += bedaAngka;
            }

            System.out.println("\nFaktorial dari " + banyakAngka + " : ");
            for (int x = banyakAngka; x >= 1; x--) {
                if (x == 1) {
                    System.out.print(x);
                } else {
                    System.out.print(x + " * ");
                }
                faktorial *= x;
            }
            System.out.println(" = " + faktorial);

            // konfirmasi jika ingin mengulangi program/tidak
            System.out.print("Apakah Anda Ingin Mengulangi Programnya? [Y/T] = ");
            String jawaban = scan.nextLine();

            if (jawaban.equalsIgnoreCase("T")) {
                status = false;
            } else if (jawaban.equalsIgnoreCase("Y")) {
                status = true;
            } else {
                status = false;
            }

        }
    }
}