public class Conservador implements CalculoRiscoStrategy {
    @Override
    public double calcularRisco(double patrimonio, int idade) {
        double riscoBase = patrimonio * 0.02;
        return riscoBase * 0.1;
    }
}