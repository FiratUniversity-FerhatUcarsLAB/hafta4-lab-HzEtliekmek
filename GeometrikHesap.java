import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();

        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * r * r * r;
        double kureYuzeyAlani = 4 * PI * r * r;

        System.out.println();
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani         : %.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi       : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi          : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi          : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani    : %.2f cm^2%n", kureYuzeyAlani);

        input.close();
    }
}
