public class Auto implements ImpactoEcologico {
    private double kilometrosRecorridos;
    private double emisionesPorKilometro;
    private boolean esElectrico;

    // Constructor y métodos getters y setters

    @Override
    public double obtenerImpactoEcologico() {
        double factorEmision = esElectrico ? 0.5 : 1;
        return kilometrosRecorridos * emisionesPorKilometro * factorEmision;
    }
}
