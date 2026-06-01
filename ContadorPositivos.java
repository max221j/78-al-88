import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int contadorPositivos = 0;
        
        System.out.println("Introduce números enteros (ingresa 0 para terminar):");
        
        // 1. Leer el primer número antes de entrar al bucle
        numero = teclado.nextInt();
        
        // 2. El bucle se repite MIENTRAS el número NO sea 0
        while (numero != 0) {
            // Evaluamos si el número ingresado es positivo
            if (numero > 0) {
                contadorPositivos++; // Operador de incremento (suma 1 al contador)
            }
            
            // Pedimos el siguiente número dentro del bucle
            numero = teclado.nextInt();
        }
        
        // 3. Mostrar el resultado final
        System.out.println("Se ingresaron " + contadorPositivos + " números positivos.");
        
        teclado.close();
    }
}