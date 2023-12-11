import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Barang {
    private String nama;
    private double harga;

    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}

class PencarianBarang {
    private List<Barang> daftarBarang;

    public PencarianBarang() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public List<Barang> cariBarang(String kataKunci) {
        List<Barang> hasilPencarian = new ArrayList<>();
        for (Barang barang : daftarBarang) {
            if (barang.getNama().toLowerCase().contains(kataKunci.toLowerCase())) {
                hasilPencarian.add(barang);
            }
        }
        return hasilPencarian;
    }
}

public class Main {
    public static void main(String[] args) {
        PencarianBarang pencarianBarang = new PencarianBarang();

        pencarianBarang.tambahBarang(new Barang("Laptop", 5000000));
        pencarianBarang.tambahBarang(new Barang("Smartphone", 2000000));
        pencarianBarang.tambahBarang(new Barang("Mouse", 50000));
        pencarianBarang.tambahBarang(new Barang("Keyboard", 100000));

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata kunci untuk mencari barang: ");
        String kataKunci = scanner.nextLine();

        
        List<Barang> hasilPencarian = pencarianBarang.cariBarang(kataKunci);

       
        if (hasilPencarian.isEmpty()) {
            System.out.println("Barang tidak ditemukan.");
        } else {
            System.out.println("Hasil Pencarian:");
            for (Barang barang : hasilPencarian) {
                System.out.println("Nama: " + barang.getNama() + ", Harga: " + barang.getHarga());
            }
        }
    }
}
