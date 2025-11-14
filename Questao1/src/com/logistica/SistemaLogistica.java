public class SistemaLogistica {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Geração de Relatórios (Factory Method) ---\n");

        // 1. Gerar Relatório Diário
        CriadorRelatorio criadorDiario = new CriadorRelatorioDiario();
        criadorDiario.gerarRelatorio();

        // 2. Gerar Relatório Semanal
        CriadorRelatorio criadorSemanal = new CriadorRelatorioSemanal();
        criadorSemanal.gerarRelatorio();

        // 3. Gerar Novo Relatório (Demonstrando a Extensão)
        CriadorRelatorio criadorEmergencial = new CriadorRelatorioEmergencial();
        criadorEmergencial.gerarRelatorio();
    }
}