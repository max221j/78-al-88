import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int numeroOriginal = teclado.nextInt();
        
        // El factorial no está definido para números negativos
        if (numeroOriginal < 0) {
            System.out.println("Error: El factorial no existe para números negativos.");
        } else {
            int numero = numeroOriginal;
            long factorial = 1; // Usamos 'long' porque el factorial crece muy rápido
            
            // El bucle se ejecuta mientras el número sea mayor que 1
            while (numero > 1) {
                factorial = factorial * numero; // Operador de multiplicación
                numero--; // Operador de decremento (resta 1 al número)
            }
            
            // Mostrar el resultado
            System.out.println("El factorial de " + numeroOriginal + " es: " + factorial);
        }
        
        teclado.close();
    }
}