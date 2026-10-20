import java.util.Scanner;
/**
 * TiketBioskop08
 */
public class TiketBioskop08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, hargaTiket = 50000, jumlah, bayar, totalTiket = 0, totalPenjualan=0;
        double diskon;
        String namaPelanggan;
        System.out.print("Menyediakan berapa tiket hari ini: ");
        tiket = sc.nextInt();
        sc.nextLine();

         while (tiket < 0) {
            System.out.println("Jumlah tiket tidak valid");
            System.out.print("Menyediakan berapa tiket hari ini: ");
            tiket = sc.nextInt();
            sc.nextLine();
        }

        while (tiket > 0) {
            System.out.print("Nama pelanggan: ");
            namaPelanggan = sc.nextLine();
            System.out.print("Jumlah tiket: ");
            jumlah = sc.nextInt();
            sc.nextLine();
            if (jumlah <= 0) {
                System.out.println("Jumlah tiket harus lebih dari 0");
                continue;
            }
            if (jumlah > tiket) {
                System.out.println("Tiket tidak cukup, tersisa "+ tiket + " tiket");
                continue;
            }
            tiket -= jumlah;
            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }
            bayar = jumlah * hargaTiket;
            bayar -= bayar * diskon;
            totalTiket += jumlah;
            totalPenjualan += bayar;
            System.out.println("\n-------------------------------------------Nota Tiket-------------------------------------------");
            System.out.println("Nama pelanggan: " + namaPelanggan);
            System.out.println("Diskon "+ diskon);
            System.out.println("Total pembayaran: Rp " + bayar);
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("\nSisa tiket: " + tiket);
        }
        System.out.println("\nTiket habis terjual");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        sc.close();
    }
}