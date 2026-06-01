import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal entero positivo: ");
        int decimal = teclado.nextInt();
        
        // Validar que sea un número positivo
        if (decimal < 0) {
            System.out.println("Por favor, introduce un número mayor o igual a 0.");
        } else if (decimal == 0) {
            System.out.println("El número binario es: 0");
        } else {
            int numero = decimal;
            String binario = ""; // Aquí acumularemos los residuos como texto
            
            // Bucle while para las divisiones sucesivas
            while (numero > 0) {
                int residuo = numero % 2; // Obtenemos el residuo (0 o 1)
                
                // Concatenamos el residuo AL PRINCIPIO de la cadena para invertir el orden
                binario = residuo + binario; 
                
                numero = numero / 2; // Dividimos el número entre 2 para la siguiente ronda
            }
            
            // Mostrar el resultado final
            System.out.println("El número " + decimal + " en binario es: " + binario);
        }
        
        teclado.close();
    }
}