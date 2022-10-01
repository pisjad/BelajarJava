import java.util.Scanner;

public class BelajarPadding {
    public static void main(String[] args) {
        // * */ Deklarasi Variabel
        String nama, kelas;
        int nilaiSatu, nilaiDua, nilaiTiga;
        Scanner input = new Scanner(System.in);

        System.out.println("==================== Alat Penghitung Rata-rata ====================");
        System.out.print("Masukkan nama Anda = ");
        nama = input.nextLine();
        System.out.print("Masukkan nama kelas Anda = ");
        kelas = input.nextLine();
        System.out.print("Masukkan nilai pertama Anda = ");
        nilaiSatu = input.nextInt();
        System.out.print("Masukkan nilai kedua Anda = ");
        nilaiDua = input.nextInt();
        System.out.print("Masukkan nilai ketiga Anda = ");
        nilaiTiga = input.nextInt();

        float rataRata = (nilaiSatu + nilaiDua + nilaiTiga) / 3;

        // Kondisi
        if (rataRata >= 90 && rataRata <= 100) {
            System.out.println("");
            System.out.println("=============================== Hasil =============================");
            System.out.printf("%-25s %s %s \n", "Nama", ": ", nama);
            System.out.printf("%-25s %s %s \n", "Kelas", ": ", kelas);
            System.out.println("Selamat Anda Lulus");
            System.out.println("Nilai Anda A");
            System.out.printf("%-25s %s %.2f", "Rata-rata nilai", ": ", rataRata);

        } else if (rataRata >= 70 && rataRata <= 89) {
            System.out.println("");
            System.out.println("=============================== Hasil =============================");
            System.out.printf("%-25s %s %s \n", "Nama", ": ", nama);
            System.out.printf("%-25s %s %s \n", "Kelas", ": ", kelas);
            System.out.println("Selamat Anda Lulus");
            System.out.println("Nilai Anda B");
            System.out.printf("%-25s %s %.2f", "Rata-rata nilai", ": ", rataRata);

        } else if (rataRata >= 35 && rataRata <= 69) {
            System.out.println("");
            System.out.println("=============================== Hasil =============================");
            System.out.printf("%-25s %s %s \n", "Nama", ": ", nama);
            System.out.printf("%-25s %s %s \n", "Kelas", ": ", kelas);
            System.out.println("Maaf Anda tidak lulus");
            System.out.println("Nilai Anda C");
            System.out.printf("%-25s %s %.2f", "Rata-rata nilai", ": ", rataRata);

        } else if (rataRata >= 0 && rataRata <= 34) {
            System.out.println("");
            System.out.println("=============================== Hasil =============================");
            System.out.printf("%-25s %s %s \n", "Nama", ": ", nama);
            System.out.printf("%-25s %s %s \n", "Kelas", ": ", kelas);
            System.out.println("Maaf Anda tidak lulus");
            System.out.println("Nilai Anda D");
            System.out.printf("%-25s %s %.2f", "Rata-rata nilai", ": ", rataRata);

        }

    }
}
