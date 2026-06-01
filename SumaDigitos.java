import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        // 1. Lectura del número entero por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numeroOriginal = teclado.nextInt();
        
        // Convertimos a positivo para asegurar que funcione con números negativos
        int numero = Math.abs(numeroOriginal);
        int sumaDigitos = 0;
        
        // 2. Bucle while para calcular la suma
        while (numero > 0) {
            int digito = numero % 10;     // Operador Módulo (%): extrae el último dígito
            sumaDigitos += digito;        // Operador de Suma: acumula el dígito extraído
            numero = numero / 10;         // Operador División (/): elimina el último dígito
        }
        
        // 3. Imprimir el resultado
        System.out.println("La suma de los dígitos de " + numeroOriginal + " es: " + sumaDigitos);
        
        teclado.close();
    }
}