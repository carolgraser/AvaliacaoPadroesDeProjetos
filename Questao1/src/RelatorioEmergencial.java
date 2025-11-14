class RelatorioEmergencial implements Relatorio {
    @Override
    public void prepararRelatorio() {
        System.out.println("!!! Relatório Emergencial: Coletando dados de alta prioridade e fontes em tempo real. !!!");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo: Alerta de anomalia de alto risco. Formato: Texto simples e conciso.");
    }
}