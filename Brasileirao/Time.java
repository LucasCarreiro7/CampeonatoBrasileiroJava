package Brasileirao;

/* A classe Time representa uma equipe do campeonato, com todos os abritutos (estatíscas) que serão apresentados na
 tabela final. */

public class Time implements InterfaceTime {
    // ATRIBUTOS
    private String nome;
    private int pontos = 0;
    private int jogos = 0;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;
    private int golsFeitos = 0;
    private int golsSofridos = 0;
    private int saldoDeGols = 0;

    // CONSTRUTOR
    // Inicializa um time com o nome colocado pelo usuário.
    public Time(String nome) {
        this.nome = nome;
    }

    // MÉTODOS ACESSORES
    public String getNome() {return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getPontos() {return pontos; }
    public void setPontos(int pontos) { this.pontos = pontos; }

    public int getJogos() { return jogos; }
    public void setJogos(int jogos) { this.jogos = jogos; }

    public int getVitorias() { return vitorias; }
    public void setVitorias(int vitorias) { this.vitorias = vitorias; }

    public int getEmpates() { return empates; }
    public void setEmpates(int empates) { this.empates = empates; }

    public int getDerrotas() { return derrotas; }
    public void setDerrotas(int derrotas) { this.derrotas = derrotas; }

    public int getGolsFeitos() { return golsFeitos; }
    public void setGolsFeitos(int golsFeitos) { this.golsFeitos = golsFeitos; }

    public int getGolsSofridos() { return golsSofridos; }
    public void setGolsSofridos(int golsSofridos) { this.golsSofridos = golsSofridos; }

    public int getSaldoDeGols() { return saldoDeGols; }
    public void setSaldoDeGols(int saldoDeGols) { this.saldoDeGols = saldoDeGols; }

    // MÉTODOS

    // Atualiza as estatísticas da equipe após uma vitória.
    public void anotarVitoria(int gols1, int gols2) {
        this.jogos++;
        this.vitorias++;
        this.pontos += 3;
        this.golsFeitos += gols1;
        this.golsSofridos += gols2;
        this.setSaldoDeGols(getGolsFeitos() - getGolsSofridos());
    }

    // Atualiza as estatísticas da equipe após um empate.
    public void anotarEmpate(int gols1, int gols2) {
        this.jogos++;
        this.empates++;
        this.pontos++;
        this.golsFeitos += gols1;
        this.golsSofridos += gols2;
        this.setSaldoDeGols(getGolsFeitos() - getGolsSofridos());
    }

    // Atualiza as estatísticas da equipe após uma derrota.
    public void anotarDerrota(int gols1, int gols2) {
        this.jogos++;
        this.derrotas++;
        this.golsFeitos += gols1;
        this.golsSofridos += gols2;
        this.setSaldoDeGols(getGolsFeitos() - getGolsSofridos());
    }

}