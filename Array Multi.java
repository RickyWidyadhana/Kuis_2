package latihan.pencariandata1;
import java.util.Scanner;
public class pencariandata1 {
    
    public static void main(String[] args) {
        String[] menuMakanan = {"Bakso Jamur", "Bakso Ikan", "Bakso Keju", "Bakso Mercon", "Bakso Telur"};
        int[] hargaMakanan = {12000, 10000, 16000, 14000, 18000};

     
        String[] hasilPencarianMenu = new String[menuMakanan.length];
        int[] hasilPencarianHarga = new int[hargaMakanan.length];
        int jumlahPencarian = 0;
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harga Minimal : ");
        int hargaBawah = scanner.nextInt();
        System.out.print("Harga Maksimal : ");
        int hargaAtas = scanner.nextInt();

        for (int i = 0; i < menuMakanan.length; i++) {
            if (hargaMakanan[i] >= hargaBawah && hargaMakanan[i] <= hargaAtas) {
                hasilPencarianMenu[jumlahPencarian] = menuMakanan[i];
                hasilPencarianHarga[jumlahPencarian] = hargaMakanan[i];
                jumlahPencarian++;
            }
        }
      
        if (jumlahPencarian > 0) {
            System.out.println("Menu Makanan Yang Sesuai : ");
            for (int i = 0; i < jumlahPencarian; i++) {
                System.out.println((i + 1) + ". " + hasilPencarianMenu[i] + " - Rp" + hasilPencarianHarga[i]);
            }

            System.out.print("Pilih Nomor Menu yang Akan Dipilih : ");
            int pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= jumlahPencarian) {
                
                System.out.println("Anda telah menambahkan " + hasilPencarianMenu[pilihan - 1] + " Dalam daftar.");
              
            } else {
                System.out.println("Nomor yang anda pilih tidak ada");
            }

        } else {
            System.out.println("Tidak Ada Menu Di Kisaran Harga Tersebut");
        }
     }
}