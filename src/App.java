import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Clase Scanner que nos permite leer la entrada por cosola
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("La palabra a divinar es: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("felicidades has adivinado la palabra secreta");

            }
        }
        if (!palabraAdivinada) {
            System.out.println("Que pena esres un manco de mrd que no puedo avuivinar la palabra");
        }
        scanner.close();
    }
}
