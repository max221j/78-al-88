import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce números enteros (ingresa 0 para terminar):");
        
        // 1. Leer el primer número para inicializar el menor
        int numero = teclado.nextInt();
        
        // Si el primer número ya es 0, terminamos de inmediato
        if (numero == 0) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            // Inicializamos la variable 'menor' con el primer número ingresado
            int menor = numero;
            
            // 2. El bucle continúa MIENTRAS el número NO sea 0
            while (numero != 0) {
                // Si el número actual es más pequeño que el que teníamos guardado, lo reemplazamos
                if (numero < menor) {
                    menor = numero;
                }
                
                // Pedimos el siguiente número
                numero = teclado.nextInt();
            }
            
            // 3. Mostrar el menor número encontrado
            System.out.println("------------------------------------------");
            System.out.println("El menor número ingresado fue: " + menor);
        }
        
        teclado.close();
    }
}