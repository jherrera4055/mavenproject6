public class Bicicleta implements ImpactoEcologico {
    private boolean esElectrica;
    private double emisionesFabricacion; // Emisiones durante la fabricación
    private double consumoEnergetico; // Consumo energético si es eléctrica

    // Constructor y métodos getters y setters

    @Override
    public double obtenerImpactoEcologico() {
        double factorEmision = esElectrica ? consumoEnergetico : 0;
        return emisionesFabricacion + factorEmision;
    }
}
