import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        int temperatura = scanner.nextInt();

        if (temperatura > 30) {
            System.out.println("O clima está quente.");
        }else{
            System.out.println("O clima está frio.");
        }
        scanner.close();
    }
}
