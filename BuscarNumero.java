import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.print("Ingrese el número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                encontrado = true;
                System.out.println("Número encontrado en la posición: " + i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número no encontrado.");
        }

        sc.close();
    }
}