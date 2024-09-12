import java.util.ArrayList;

public class MainPolimorfismoAbstrato {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}