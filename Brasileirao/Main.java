package Brasileirao;

public class Main {
    public static void main(String[] args) {
        Tabela tabela = new Tabela();
        tabela.adicionarTime(new Time("Atlético-MG"));
        tabela.adicionarTime(new Time("Bahia"));
        tabela.adicionarTime(new Time("Botafogo"));
        tabela.adicionarTime(new Time("Bragantino"));
        tabela.adicionarTime(new Time("Ceará"));
        tabela.adicionarTime(new Time("Corinthians"));
        tabela.adicionarTime(new Time("Cruzeiro"));
        tabela.adicionarTime(new Time("Flamengo"));
        tabela.adicionarTime(new Time("Fluminense"));
        tabela.adicionarTime(new Time("Fortaleza"));
        tabela.adicionarTime(new Time("Grêmio"));
        tabela.adicionarTime(new Time("Internacional"));
        tabela.adicionarTime(new Time("Juventude"));
        tabela.adicionarTime(new Time("Mirassol"));
        tabela.adicionarTime(new Time("Palmeiras"));
        tabela.adicionarTime(new Time("Santos"));
        tabela.adicionarTime(new Time("São Paulo"));
        tabela.adicionarTime(new Time("Sport"));
        tabela.adicionarTime(new Time("Vasco"));
        tabela.adicionarTime(new Time("Vitória"));

        tabela.simularCampeonato();
        tabela.exibirTabela();

    }
}
