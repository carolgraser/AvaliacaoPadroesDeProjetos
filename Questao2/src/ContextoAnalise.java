public class ContextoAnalise {
    private CalculoRiscoStrategy strategy;
    
    
    public ContextoAnalise(CalculoRiscoStrategy strategy) {
        this.strategy = strategy;
    }

    
    public void setStrategy(CalculoRiscoStrategy strategy) {
        this.strategy = strategy;
        System.out.println("-> Método de cálculo alterado para: " + strategy.getClass().getSimpleName());
    }

    
    public double executarCalculoRisco(double patrimonio, int idade) {
        System.out.print("Executando cálculo com " + strategy.getClass().getSimpleName() + "...");
        return strategy.calcularRisco(patrimonio, idade);
    }
}