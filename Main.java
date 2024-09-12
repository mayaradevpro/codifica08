import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    deletarProduto();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastrar produto");
        System.out.println("2. Listar produtos");
        System.out.println("3. Deletar produto");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        double preco;
        while (true) {
            try {
                System.out.print("Digite o preço do produto: ");
                preco = Double.parseDouble(scanner.nextLine());
                if (preco < 0) {
                    throw new IllegalArgumentException("O preço não pode ser negativo.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int quantidade;
        while (true) {
            try {
                System.out.print("Digite a quantidade em estoque: ");
                quantidade = Integer.parseInt(scanner.nextLine());
                if (quantidade < 0) {
                    throw new IllegalArgumentException("A quantidade não pode ser negativa.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\nLista de produtos a seguir:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i));
            }
        }
    }

    private static void deletarProduto() {
        listarProdutos();

        if (!produtos.isEmpty()) {
            System.out.print("Digite o código do produto para ser deletado: ");
            int indice = Integer.parseInt(scanner.nextLine());

            if (indice > 0 && indice <= produtos.size()) {
                produtos.remove(indice - 1);
                System.out.println("Produto deletado.");
            } else {
                System.out.println("Índice incorreto.");
            }
        }
    }
}