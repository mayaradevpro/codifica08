import java.util.ArrayList;
import java.util.Scanner;

public class Atv2 {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        Gerente gerente = new Gerente("Madalena", 8000);
        Desenvolvedor dev = new Desenvolvedor("Ronaldo", 5000);
        
        funcionarios.add(gerente);
        funcionarios.add(dev);
        
        for (Funcionario f : funcionarios) {
            f.trabalhar();
            System.out.println("Bônus: R$ " + f.calcularBonus());
        }
    }
}