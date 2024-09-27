public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro Leleco", 17, "Masculino", "Brasileiro", "Rua Rio da Barra, 123", "4002-8922", "lelecodeofreefire@gmail.com", "123.456.789-00", "MG-12.345.678", "Estudante");
        Pessoa pessoa2 = new Pessoa("Maykon Amassanoob", 10, "Masculino", "Brasileiro", "Avenida Queiroz, 456", "9876-5432", "mzdoquero7@email.com", "987.654.321-00", "SP-98.765.432", "Estudante");

        pessoa1.exibirDados();
        System.out.println();
        pessoa2.exibirDados();
    }
}
