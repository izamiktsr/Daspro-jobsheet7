import java.util.Scanner;

public class Parkir18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan, durasiParkir, totalBiaya = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenisKendaraan = scanner.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasiParkir = scanner.nextInt();

            if (jenisKendaraan == 1) {
                if (durasiParkir > 5) {
                    totalBiaya += 12500;
                } else {
                    totalBiaya += durasiParkir * 3000;
                }
            } else if (jenisKendaraan == 2) {
                if (durasiParkir > 5) {
                    totalBiaya += 12500;
                } else {
                    totalBiaya += durasiParkir * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Harap masukkan 1, 2, atau 0.");
            }

        } while (jenisKendaraan != 0);

        System.out.println("Total biaya parkir: Rp " + totalBiaya);
    }
}