public class RelatorioSemanal implements Relatorio {
    @Override
    public void prepararRelatorio() {
        System.out.println("-> Relatório Semanal: Agregando dados de tráfego e inventário da semana.");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo: Apresentando análise de tendências e gráficos de variação semanal.");
    }
}