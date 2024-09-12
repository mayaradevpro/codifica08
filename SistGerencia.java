import java.util.ArrayList;

public class SistemaGerenciamento {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        funcionarios.add(new Gerente("Thiago", 8000));
        funcionarios.add(new Desenvolvedor("Kiara", 5000));
        funcionarios.add(new Desenvolvedor("Amanda", 7000));
        funcionarios.add(new Estagiario("Junior", 2000));

        calcularFolhaPagamento();
        promoverFuncionario("Junior");
        calcularFolhaPagamento();
    }

    private static void calcularFolhaPagamento() {
        double totalSalarios = 0;
        double totalBonus = 0;

        System.out.println("\nFolha de Pagamento:");
        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario();
            double bonus = f.calcularBonus();
            totalSalarios += salario;
            totalBonus += bonus;

            System.out.println(f.getNome() + ": Salário = R$ " + salario + ", Bônus = R$ " + bonus);
        }

        System.out.println("\nTotal de Salário: R$ " + totalSalarios);
        System.out.println("Total de Bônus: R$ " + totalBonus);
    }

    private static void promoverFuncionario(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                f.promover();
                return;
            }
        }
        System.out.println("Funcionário com o nome " + nome + " não encontrado no sistema.");
    }
}