import java.util.Scanner;

public class ConteoPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el inicio del rango: ");
        int inicio = sc.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        int fin = sc.nextInt();

        int cantidadPrimos = 0;

        for (int num = inicio; num <= fin; num++) {

            if (num < 2) {
                continue;
            }

            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                cantidadPrimos++;
            }
        }

        System.out.println("Cantidad de números primos: " + cantidadPrimos);

        sc.close();
    }
}