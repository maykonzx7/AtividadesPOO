import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int escolha = scanner.nextInt();
            double num1, num2;

            switch (escolha) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + soma(num1, num2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + subtracao(num1, num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + multiplicacao(num1, num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + divisao(num1, num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static double soma(double a, double b) {
        return a + b;
    }

    private static double subtracao(double a, double b) {
        return a - b;
    }

    private static double multiplicacao(double a, double b) {
        return a * b;
    }

    private static double divisao(double a, double b) {
        return a / b;
    }
}
