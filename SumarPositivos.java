import java.util.Scanner;

public class SumarPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();

            if (num < 0) {
                continue;
            }

            suma += num;
        }

        System.out.println("La suma de los números positivos es: " + suma);

        sc.close();
    }
}