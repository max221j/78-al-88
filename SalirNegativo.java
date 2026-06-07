import java.util.Scanner;

public class SalirNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            System.out.println("Número ingresado: " + numero);
        }

        System.out.println("Se ingresó un número negativo. Programa terminado.");

        sc.close();
    }
}