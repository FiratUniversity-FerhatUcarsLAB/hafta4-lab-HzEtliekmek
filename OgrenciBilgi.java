import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.print("Adinizi girin: ");
        String ad = input.next();
        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();
        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();
        System.out.print("Yasiniz: ");
        int yas = input.nextInt();
        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println();
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        input.close();
    }
}
