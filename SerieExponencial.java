import java.util.Scanner;

public class SerieExponencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int suma = 1;
        int potencia = 1;

        for (int i = 1; i <= n; i++) {
            potencia *= x;
            suma += potencia;
        }

        System.out.println("Resultado de la serie: " + suma);

        sc.close();
    }
}