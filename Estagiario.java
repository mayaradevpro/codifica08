public class Estagiario extends Employee {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase; 
    }

    @Override
    public double calcularBonus() {
        return 0; 
    }

    @Override
    public void promover() {
        System.out.println(nome + " foi promovido ao cargo de Desenvolvedor Junior!");
    }
}