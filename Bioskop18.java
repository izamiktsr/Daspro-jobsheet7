import java.util.Scanner;

public class Bioskop18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Harga tiket
        int hargaTiket = 50000;

        // Total tiket terjual
        int totalTiket = 0;

        // Total harga penjualan
        int totalPenjualan = 0;

        // Loop untuk input jumlah tiket
        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            int jumlahTiket = input.nextInt();

            // Jika input tidak valid (negatif)
            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid. Silahkan masukkan lagi.");
                continue;
            }

            // Hitung total tiket terjual
            totalTiket += jumlahTiket;

            // Hitung diskon
            int diskon = 0;
            if (jumlahTiket >= 10) {
                diskon = 15;
            } else if (jumlahTiket >= 4) {
                diskon = 10;
            }

            // Hitung harga tiket setelah diskon
            int hargaTiketDiskon = hargaTiket - (hargaTiket * diskon / 100);

            // Hitung total harga penjualan
            totalPenjualan += hargaTiketDiskon * jumlahTiket;

            // Tanyakan apakah ingin input lagi
            System.out.print("Apakah ingin input jumlah tiket lagi? (y/n): ");
            String inputLagi = input.next();
            if (!inputLagi.equalsIgnoreCase("y")) {
                break;
            }
        }

        // Tampilkan hasil
        System.out.println("\nTotal tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan: Rp " + totalPenjualan);
    }
}