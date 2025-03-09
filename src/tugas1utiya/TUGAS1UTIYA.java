package tugas1utiya;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TUGAS1UTIYA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        final int MAX_PERCOBAAN = 5; 
        final int MIN_ANGKA = 1; 
        final int MAX_ANGKA = 20;
        int targetAngka = random.nextInt(MAX_ANGKA - MIN_ANGKA + 1) + MIN_ANGKA;
        int jumlahTebakan = 0;
        boolean statusTebakan = false;

//        int[] contohTebakan = {1, 4, 6, 8, 10}; 
//        System.out.println("Petunjuk! Contoh tebakan: " + contohTebakan[0] + "," + contohTebakan[1] + "," + contohTebakan[2]+ "," + contohTebakan[3]+ "," + contohTebakan[4]); 
        System.out.println("Petunjuk! Contoh tebakan : 1, 3, 5, 8, 10");

        List<Integer> historyTebakan = new ArrayList<>();

        System.out.println("=== Selamat Datang di Game Tebak Angka ===");
        System.out.println("Silahkan pilih antara angka  " + MIN_ANGKA + " hingga " + MAX_ANGKA);
        System.out.println("Anda punya " + MAX_PERCOBAAN + " kesempatan untuk menebak.");

        while (jumlahTebakan < MAX_PERCOBAAN && !statusTebakan) {
            System.out.print("\nMasukkan tebakan Anda: ");
            int tebakanUser = scanner.nextInt();
            historyTebakan.add(tebakanUser); 
            jumlahTebakan++;

            if (tebakanUser == targetAngka) {
                statusTebakan = true;
                System.out.println("Selamat! Anda menebak dengan benar: " + targetAngka);
            } else if (tebakanUser < targetAngka) {
                System.out.println("Tebakan terlalu kecil! Coba lagi.");
            } else if (tebakanUser < MIN_ANGKA || tebakanUser >MAX_ANGKA) {
                System.out.println("Tebakan anda diluar jangkauan! Coba lagi.");
            } else {
                System.out.println("Tebakan terlalu besar! coba lagi.");
            }

            System.out.println("Sisa percobaan: " + (MAX_PERCOBAAN - jumlahTebakan));
        }

        if (!statusTebakan) {
            System.out.println("\nAnda kehabisan percobaan! Angka yang benar adalah: " + targetAngka);
        }

        System.out.println("Riwayat tebakan Anda: " + historyTebakan);

        scanner.close();
    }
}

