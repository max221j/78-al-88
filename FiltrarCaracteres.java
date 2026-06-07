import java.util.Scanner;

public class FiltrarCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {

            char c = texto.charAt(i);

            if (Character.isDigit(c)) {
                continue;
            }

            System.out.print(c);
        }

        sc.close();
    }
}