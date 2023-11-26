public class Edificio implements ImpactoEcologico {
    private double consumoEnergia; // Energía consumida en kWh
    private double emisionesMateriales; // Emisiones por materiales en kg CO2
    private double residuosGenerados; // Residuos generados en kg
    private boolean esEficienteEnergeticamente;

    // Constructor y métodos getters y setters

    @Override
    public double obtenerImpactoEcologico() {
        double factorEficiencia = esEficienteEnergeticamente ? 0.75 : 1;
        return (consumoEnergia + emisionesMateriales + residuosGenerados) * factorEficiencia;
    }
}

