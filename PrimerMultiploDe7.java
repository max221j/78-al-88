import java.util.Scanner;

public class PrimerMultiploDe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el inicio del rango: ");
        int inicio = sc.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        int fin = sc.nextInt();

        for (int i = inicio; i <= fin; i++) {

            if (i % 7 == 0) {
                System.out.println("Primer múltiplo de 7 encontrado: " + i);
                break;
            }

        }

        sc.close();
    }
}