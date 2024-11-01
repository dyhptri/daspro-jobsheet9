import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total mahasiswa: ");
        int n = input.nextInt();

        int arrMhs[] = new  int [n + 1];
        int sum = 0, nTingggi= 0, nRendah = 100;

        System.out.println("--------------------");

        for (int i = 1; i < arrMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            arrMhs[i] = input.nextInt();

            if (nTingggi < arrMhs[i]) {
                nTingggi = arrMhs[i];
            } 
            else if (nRendah > arrMhs[i]) {
                nRendah = arrMhs[i];
            }
            
            sum += arrMhs [i];
        }

        double rata2 = sum/arrMhs.length;

        System.out.println();
        System.out.println("Berikut adalah nilai-nilai mahasiswa: ");

        for (int i = 1; i < arrMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + i + " adalah: " + arrMhs[i]);
        }

        System.out.println("----------------------------");
        System.out.println("Nilai rata-rata adalah: " + rata2);
        System.out.println("Nilai tertingginya adalah: " + nTingggi);
        System.out.println("Nilai terendahnya adalah :" + nRendah);
    }
}
