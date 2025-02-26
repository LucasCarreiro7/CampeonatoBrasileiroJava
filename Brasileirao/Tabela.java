package Brasileirao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* A classe Tabela simula todas as partidas de uma temporada e organiza a classificação final com base nos resultados
das partidas jogadas. */

public class Tabela implements InterfaceTabela{
    // ATRIBUTOS
    private List<Time> times;

    // CONSTRUTOR
    public Tabela() {
        this.times = new ArrayList<>();
    }

    // MÉTODOS

    // Recebe um objeto da classe Time e o adiciona a lista que representa a tabela do campeonato.
    public void adicionarTime (Time time) {
        times.add(time);
    }

    /* Simula todas as partidas do campeonato, fazendo com que todos os times enfrentem duas vezes
    todos os seus adversários. */
    public void simularCampeonato() {
        for (int i=0; i < times.size(); i++) {
            for (int j=(i+1); j < times.size(); j++) {
                Partida partida = new Partida(times.get(i), times.get(j));
                partida.jogarPartida();
            }
        }

        for (int i=0; i < times.size(); i++) {
            for (int j=(i+1); j < times.size(); j++) {
                Partida partida = new Partida(times.get(j), times.get(i));
                partida.jogarPartida();
            }
        }
    }

    /* Ordena a lista que funciona como classificação com base nos critérios determinados (pontos,
    vitórias, saldo de gols e gols feitos) e a exibe pro usuário. */

    public void exibirTabela () {
        times.sort(Comparator.comparing(Time::getPontos).thenComparing(Time::getVitorias)
                .thenComparing(Time::getSaldoDeGols).thenComparing(Time::getGolsFeitos).reversed());
        System.out.println("---------------------------- RESULTADO DO CAMPEONATO ----------------------------");
        for (int i=0; i < times.size(); i++) {
            System.out.println((i+1) + "° - " + times.get(i).getNome() + " - Pontos: " + times.get(i).getPontos() +
                    " - Vitórias: " + times.get(i).getVitorias() + " - Empates: " + times.get(i).getEmpates() +
                    " - Derrotas: " + times.get(i).getDerrotas() + " - Saldo de Gols: " + times.get(i).getSaldoDeGols() +
                    " - Gols Feitos: " + times.get(i).getGolsFeitos() + " - Gols Sofridos: " + times.get(i).getGolsSofridos());
        }

    }


}
