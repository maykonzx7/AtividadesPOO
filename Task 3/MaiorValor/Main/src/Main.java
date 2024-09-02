import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        int x = scanner.nextInt();

        System.out.println("Digite o valor de y:");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("O maior valor é X: " + x);
        } else if (y > x) {
            System.out.println("O maior valor é Y: " + y);
        } else {
            System.out.println("X e Y são iguais: " + x);
        }
        scanner.close();
    }
}