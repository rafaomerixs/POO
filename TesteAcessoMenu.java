import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }
}

public class TesteAcessoMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        Pessoa p1 = new Pessoa("João", 20);

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Mostrar dados (toString)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nDados da pessoa:");
                    System.out.println(p1.toString());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}