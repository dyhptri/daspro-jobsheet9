import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa jumlah pesanan? ");
        int n = input.nextInt();
        input.nextLine();

        String arrNama[] = new String[n + 1];
        int arrHarga[] = new int[n + 1];
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Masukkan nama makanan/minuman: ");
            arrNama [i] = input.nextLine();

            System.out.println("Masukkan harga makanan/minuman: ");
            arrHarga[i] = input.nextInt();
            input.nextLine();


            sum += arrHarga[i];
        }
        System.out.println();
        System.out.println("Berikut adalah daftar pesanan: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " . " + arrNama[i]);
        }
        System.out.println("Total biaya semua pesana: " + sum);
    }   
}
