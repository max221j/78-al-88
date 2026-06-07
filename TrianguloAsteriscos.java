import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la altura del triángulo: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}