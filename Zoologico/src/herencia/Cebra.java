package herencia;

public class Cebra extends Animal implements Alimentable {

    public Cebra(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La cebra relincha");
    }

    @Override
    public void comer() {
        System.out.println("La cebra está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("La cebra está bebiendo");
    }
}
