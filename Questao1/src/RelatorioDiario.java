public class RelatorioDiario implements Relatorio {
    @Override
    public void prepararRelatorio() {
        System.out.println("-> Relatório Diário: Coletando dados operacionais do dia.");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo: Exibindo KPIs de performance de curto prazo em formato de tabela.");
    }
}