import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    trabalharFuncionario();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastrar funcionário");
        System.out.println("2. Listar funcionários e calcular bônus");
        System.out.println("3. Trabalhar (mostrar trabalho dos funcionários)");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o tipo de funcionário: ");
        System.out.println("1. Gerente");
        System.out.println("2. Desenvolvedor");
        System.out.print("Escolha uma opção: ");
        int tipoFuncionario = Integer.parseInt(scanner.nextLine());

        Funcionario funcionario = null;

        switch (tipoFuncionario) {
            case 1:
                funcionario = new Gerente(nome, salario);
                break;
            case 2:
                funcionario = new Desenvolvedor(nome, salario);
                break;
            default:
                System.out.println("Tipo de funcionário inválido.");
                return;
        }

        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\nLista de funcionários:");
            for (Funcionario f : funcionarios) {
                System.out.println(f.getNome() + ": Bônus: R$ " + f.calcularBonus());
            }
        }
    }

    private static void trabalharFuncionario() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\nTrabalho dos funcionários:");
            for (Funcionario f : funcionarios) {
                f.trabalhar();
            }
        }
    }
}