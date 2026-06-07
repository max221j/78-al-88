import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        while (true) {
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                System.out.println("Edad inválida. Intente nuevamente.");
                continue;
            }

            break;
        }

        System.out.println("Edad válida: " + edad);

        sc.close();
    }
}