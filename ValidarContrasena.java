import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Definimos la contraseña correcta (el sistema es sensible a mayúsculas)
        String contrasenaCorrecta = "Java1234";
        String intentoUsuario = "";
        
        System.out.println("=== SISTEMA DE SEGURIDAD ===");
        
        // El bucle se repite MIENTRAS el intento sea DIFERENTE a la contraseña correcta
        // Usamos el operador '!' para negar la igualdad
        while (!intentoUsuario.equals(contrasenaCorrecta)) {
            System.out.print("Introduce la contraseña: ");
            intentoUsuario = teclado.next();
            
            // Si no coincide, mostramos un mensaje de advertencia
            if (!intentoUsuario.equals(contrasenaCorrecta)) {
                System.out.println("Contraseña incorrecta. ¡Inténtalo de nuevo!");
                System.out.println("----------------------------------------");
            }
        }
        
        // Si sale del bucle significa que la contraseña fue correcta
        System.out.println("\n¡Acceso concedido! Bienvenido al sistema.");
        
        teclado.close();
    }
}