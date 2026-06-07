public class ContarHastaLimite {
    public static void main(String[] args) {

        int suma = 0;
        int contador = 0;
        int limite = 50;

        for (int i = 1; i <= 100; i++) {

            suma += i;
            contador++;

            if (suma > limite) {
                break;
            }
        }

        System.out.println("Cantidad de números contados: " + contador);
        System.out.println("Suma acumulada: " + suma);
    }
}