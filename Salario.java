public abstract class Employee {
    protected String nome;
    protected double salarioBase;
    protected double bonus;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = 0;
    }

    public abstract double calcularSalario();
    public abstract double calcularBonus();

    public void promover() {
        // Método a ser sobrescrito pelas subclasses se necessário
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBonus() {
        return bonus;
    }
}