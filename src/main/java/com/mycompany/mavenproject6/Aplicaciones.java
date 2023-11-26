import java.util.ArrayList;

public class Aplicaciones {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(500, 300, 100, true);
        Auto auto = new Auto(15000, 0.2, false);
        Bicicleta bicicleta = new Bicicleta(false, 10, 0);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println("Impacto Ecológico: " + objeto.obtenerImpactoEcologico() + " kg de CO2");
        }
    }
}

