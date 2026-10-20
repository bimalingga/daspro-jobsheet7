import java.util.Scanner;

/**
 * Parkir08
 */
public class Parkir08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi ,total=0;
        do {
            System.out.print("jenis kendaraan (1=mobil 2=motor): ");
            jenis=sc.nextInt();
            if (jenis==1 || jenis==2) {
            System.out.print("berapa lama? ");
            durasi=sc.nextInt();
                if (jenis==1) {
                total += durasi*3000;
                } else {
                total += durasi*2000;
                }
            }
        }while (jenis!=0);
        System.out.println("Total pembayaran parkir : Rp "+total);
    }
}