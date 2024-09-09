import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Zubumafu");
        nomes.add("Killua");
        nomes.add("Chapolim");
        nomes.add("Antonio");
        nomes.add("Maykon");

        nomes.remove(1);
        System.out.println("Após remover o segundo nome: " + nomes);

        nomes.remove(2);
        System.out.println("Após remover o terceiro nome: " + nomes);

        if (nomes.get(0).equals("Zubumafu")) {
            System.out.println("O primeiro nome é Zubumafu.");
        } else {
            System.out.println("O primeiro nome não é Zubumafu.");
        }
    }
}
