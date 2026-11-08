import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Registrar contato");
            System.out.println("3 - Registrar diagnostico");
            System.out.println("4 - Rastrear contatos de uma pessoa");
            System.out.println("5 - Exibir todas as conexoes");
            System.out.println("6 - Listar pessoas cadastradas");
            System.out.println("0 - Sair");
            System.out.println("================================");
            System.out.print("Escolha uma opcao: ");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cadastro de pessoa");
                    break;

                case 2:
                    System.out.println("Registro de contato");
                    break;

                case 3:
                    System.out.println("Registro de diagnostico");
                    break;

                case 4:
                    System.out.println("Rastreamento de contatos");
                    break;

                case 5:
                    System.out.println("Exibir conexoes");
                    break;

                case 6:
                    System.out.println("Listar pessoas cadastradas");
                    break;

                case 0:
                    System.out.println("Encerrado o sistema");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao !=0);
    }
}
