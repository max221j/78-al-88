import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        // 1. Lectura del número entero por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numeroOriginal = teclado.nextInt();
        
        int numero = Math.abs(numeroOriginal); // Trabajamos con el valor positivo
        int numeroInvertido = 0;
        
        // 2. Bucle while para invertir el número
        while (numero > 0) {
            int digito = numero % 10;                     // Extrae el último dígito
            numeroInvertido = (numeroInvertido * 10) + digito; // Desplaza y añade el dígito
            numero = numero / 10;                         // Elimina el último dígito
        }
        
        // Si el número original era negativo, devolvemos el signo menos al resultado
        if (numeroOriginal < 0) {
            numeroInvertido = -numeroInvertido;
        }
        
        // 3. Imprimir el resultado
        System.out.println("El número invertido es: " + numeroInvertido);
        
        teclado.close();
    }
}