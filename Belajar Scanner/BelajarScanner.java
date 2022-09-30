import java.util.Scanner;

public class BelajarScanner {
    public static void main(String[] args) {
        String nama, kelas, asalKota;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda = ");
        nama = input.next();
        System.out.print("Masukkan kelas Anda = ");
        kelas = input.next();
        System.out.print("Masukkan asal kota Anda = ");
        asalKota = input.next();

        System.out.println("=======================");
        System.out.printf("Nama Anda = %s \n", nama);
        System.out.printf("Kelas Anda = %s \n", kelas);
        System.out.printf("Asal Kota Anda = %s \n", asalKota);
    }
}