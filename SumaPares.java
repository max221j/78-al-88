public class SumaPares {
    public static void main(String[] args) {

        int numero = 2;
        int suma = 0;

        while (numero <= 100) {
            suma += numero;
            numero += 2;
        }

        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
    }
}