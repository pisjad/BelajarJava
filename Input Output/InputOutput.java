public class InputOutput {
    public static void main(String[] args)

    {
        System.out.print("halo nama aku orang ");
        System.out.printf("My Name is %s \n", "Conrad Donovan");
        System.out.printf("My Score is %d \n", 90);
        System.out.printf("Nilaiku %f \n", 89.3434);

        // %s untuk string
        // &d untuk integer (bilangan bulat)
        // %f untuk FLoat (bilangan koma atau real)

        // padding, memberikan space pada tulisan
        System.out.println(" ");

        System.out.printf("|%15s|\n", "Juara");
        System.out.printf("|%-15s|\n", "Juara");

        System.out.printf("|%20d|\n", 200);
        System.out.printf("|%-20d|\n", 200);

        System.out.printf("|%15f|\n", 40.343);
        System.out.printf("|%-15f|\n", 40.343);

        System.out.printf("|%10s|\n", " ");
        System.out.printf("|%-10s|\n", " ");
        System.out.printf("|%15s|\n", " ");
        System.out.printf("|%-15s|\n", " ");

        float nilaiA = 30;
        float nilaiB = 40;
        float nilaiC = 50;

        float rataRata = (nilaiA + nilaiB + nilaiC) / 3;
        System.out.println(" ");
        System.out.printf("Rata-rata : %.2f \n", rataRata);

        System.out.printf("%-15s: %s \n", "Nama Lengkap", nama);
        System.out.printf("%-15s: %s \n", "Panggilan", panggilan);
        System.out.printf("%-15d: %d \n", "Umur", umur);
        System.out.printf("%-15s: %s \n", "No Telepon", notelp);
        System.out.printf("%-15: %s \n", "Asal Kota", kota);
    }

}