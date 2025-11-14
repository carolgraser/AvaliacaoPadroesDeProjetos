class CriadorRelatorioEmergencial extends CriadorRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}