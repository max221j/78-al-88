import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double nota;
        double sumaNotas = 0;
        int contadorNotas = 0;
        
        System.out.println("Introduce las notas (ingresa -1 para finalizar):");
        
        // 1. Lectura de la primera nota
        nota = teclado.nextDouble();
        
        // 2. El bucle se repite MIENTRAS la nota NO sea -1
        while (nota != -1) {
            sumaNotas += nota;       // Sumamos la nota al acumulador
            contadorNotas++;         // Incrementamos el contador de notas
            
            // Pedimos la siguiente nota dentro del bucle
            nota = teclado.nextDouble();
        }
        
        // 3. Calcular y mostrar el promedio (solo si se ingresó al menos una nota)
        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.println("--------------------------------------------");
            System.out.println("Cantidad de notas registradas: " + contadorNotas);
            System.out.printf("El promedio final es: %.2f\n", promedio);
        } else {
            System.out.println("No se registraron notas para calcular el promedio.");
        }
        
        teclado.close();
    }
}