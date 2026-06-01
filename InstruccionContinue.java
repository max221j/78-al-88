public class InstruccionContinue {
    public static void main(String[] args) {
        
        for (int numero = 1; numero <= 10; numero = numero + 1) {
            if (numero == 7) {
                continue; // Salta el resto de esta iteración y va al siguiente número
            }
            System.out.print(numero + " ");
        }
        
    } // Fin del método main
} // Fin de la clase InstruccionContinue