public class Agressivo implements CalculoRiscoStrategy {
    @Override
    public double calcularRisco(double patrimonio, int idade) {
        
        double riscoBase = patrimonio * 0.05;
        double ajusteIdade = (40 - Math.min(idade, 40)) * 0.01;
        return riscoBase * 1.8 + ajusteIdade;
    }
}