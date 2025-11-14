public abstract class CriadorRelatorio {

    public abstract Relatorio criarRelatorio();

    public void gerarRelatorio() {
        Relatorio relatorio = criarRelatorio(); 
        System.out.println("Iniciando a geração do relatório...");
        relatorio.prepararRelatorio();
        relatorio.exibirConteudo();
        System.out.println("Geração de relatório concluída.\n");
    }
}