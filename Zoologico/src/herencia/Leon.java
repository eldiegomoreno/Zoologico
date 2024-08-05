package herencia;

public class Leon extends Animal implements Alimentable {

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El león ruge");
    }

    @Override
    public void comer() {
        System.out.println("El león está comiendo");
    }

    public void beber() {
        System.out.println("El león está bebiendo");
    }
}
