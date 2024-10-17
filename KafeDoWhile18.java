import java.util.Scanner;

public class KafeDoWhile18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar)");
            int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
            String namaPelanggan;
            int kopi, teh, roti;
            int totalHarga;
            namaPelanggan = sc.nextLine();
            if  (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
    
}
