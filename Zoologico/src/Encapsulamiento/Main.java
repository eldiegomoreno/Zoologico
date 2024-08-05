package encapsulamiento;

import herencia.Perro;
import herencia.Gato;
import herencia.Cebra;
import herencia.Leon;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro, Gato, Cebra y León
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Miau", 3);
        Cebra cebra = new Cebra("Rayas", 4);
        Leon leon = new Leon("Simba", 6);

        // Llamar a los métodos en las instancias creadas
        perro.hacerSonido();
        perro.comer();
        perro.beber();
        perro.dormir();
        perro.hacerTruco();
        perro.hacerTruco("dar la pata");

        gato.hacerSonido();
        gato.comer();
        gato.beber();
        gato.dormir();

        cebra.hacerSonido();
        cebra.comer();
        cebra.beber();
        cebra.dormir();
    }
}
