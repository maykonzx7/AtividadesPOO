import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String input = scanner.nextLine();

        int numCaracteres = input.length();
        System.out.println("Número de caracteres: " + numCaracteres);

        String maiuscula = input.toUpperCase();
        System.out.println("String em maiúsculas: " + maiuscula);

        int numVogais = contarVogais(input);
        System.out.println("Número de vogais: " + numVogais);

        boolean comecaComUNI = input.toLowerCase().startsWith("uni");
        System.out.println("Começa com 'UNI': " + comecaComUNI);

        boolean terminaComRIO = input.toLowerCase().endsWith("rio");
        System.out.println("Termina com 'RIO': " + terminaComRIO);

        scanner.close();
    }

    private static int contarVogais(String input) {
        int count = 0;
        String vogais = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
