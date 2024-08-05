package herencia;

public class Perro extends Animal implements Alimentable {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El Firu ladra");
    }

    @Override
    public void comer() {
        System.out.println("El Firu está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("El Firu está bebiendo");
    }

    public void hacerTruco() {
        System.out.println("El Firu está haciendo un truco");
    }

    public void hacerTruco(String truco) {
        System.out.println("El Firu está haciendo el truco: " + truco);
    }
}
