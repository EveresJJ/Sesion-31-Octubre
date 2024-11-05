import models.Auto;
import models.Moto;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("KIA", "Seltos", 2024,4);
        System.out.println("Informacion del auto:");
        auto.imprimirInformacion();

        System.out.println();

        Moto moto = new Moto("Pulsar", "NS 200", 2023, true);
        System.out.println("Informacion del moto:");
        moto.imprimirInformacion();
    }
}
