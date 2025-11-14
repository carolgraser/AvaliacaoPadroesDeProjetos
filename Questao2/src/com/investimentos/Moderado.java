public class Moderado implements CalculoRiscoStrategy {
    @Override
    public double calcularRisco(double patrimonio, int idade) {
        
        double riscoBase = patrimonio * 0.03;
        double ajusteIdade = (double)idade / 10 * 0.005;
        return riscoBase + ajusteIdade;
    }
}