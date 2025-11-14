public class PlataformaInvestimentos {
    public static void main(String[] args) {
        double patrimonioCliente = 100000.00;
        int idadeCliente = 35;

        System.out.println("--- Análise de Risco de Investimentos---");
        System.out.println("Patrimônio: R$ " + patrimonioCliente + " | Idade: " + idadeCliente + "\n");
    
        ContextoAnalise analise = new ContextoAnalise(new Moderado());
        
        double riscoModerado = analise.executarCalculoRisco(patrimonioCliente, idadeCliente);
        System.out.printf("Risco calculado (Moderado): %.2f\n\n", riscoModerado);

        analise.setStrategy(new Agressivo());
        double riscoAgressivo = analise.executarCalculoRisco(patrimonioCliente, idadeCliente);
        System.out.printf("Risco calculado (Agressivo): %.2f\n\n", riscoAgressivo);
    
        analise.setStrategy(new Conservador());
        double riscoConservador = analise.executarCalculoRisco(patrimonioCliente, idadeCliente);
        System.out.printf("Risco calculado (Conservador): %.2f\n\n", riscoConservador);
    }
}