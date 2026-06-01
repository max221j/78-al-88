import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Generar un número aleatorio entre 1 y 100
        // Math.random() genera un decimal entre 0.0 y 0.999... 
        // Al multiplicar por 100 y sumar 1, obtenemos el rango de 1 a 100.
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        
        int intentoUsuario = 0;
        int intentosTotales = 0;
        
        System.out.println("¡Bienvenido al juego! He pensado un número entre 1 y 100.");
        System.out.println("Intenta adivinar cuál es.");
        
        // 2. El bucle continúa MIENTRAS el usuario no adivine el número
        while (intentoUsuario != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intentoUsuario = teclado.nextInt();
            intentosTotales++; // Sumamos un intento utilizando el operador de incremento
            
            // 3. Evaluar con operadores relacionales si es mayor, menor o igual
            if (intentoUsuario < numeroSecreto) {
                System.out.println("Demasiado bajo. ¡Intenta otra vez!");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("Demasiado alto. ¡Intenta otra vez!");
            } else {
                System.out.println("¡FELICIDADES! Has adivinado el número secreto.");
                System.out.println("Te tomó " + intentosTotales + " intentos.");
            }
            System.out.println("------------------------------------");
        }
        
        teclado.close();
    }
}