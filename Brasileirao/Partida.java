package Brasileirao;
import java.util.Random;

// A classe Partida simulada um confronto entre duas equipes do campeonato, fornecendo o seu resultado.

public class Partida {
    // ATRIBUTOS
    private Time time1;
    private Time time2;

    // CONSTRUTOR
    /* Uma partida é inicializada com dois objetos da classe Time, que são as equipes que irão se enfrentar na
    partida em questão */
    public Partida(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    // MÉTODOS ACESSORES
    public Time getTime1() { return time1; }
    public void setTime1(Time time1) { this.time1 = time1; }

    public Time getTime2() { return time2; }
    public void setTime2(Time time2) { this.time2 = time2; }

    // MÉTODOS

    /* Define de forma randômica um número de gols para cada equipe, determinando o resultado da
    partida com base nos gols */
    public void jogarPartida() {
        Random random = new Random();
        int gols1 = random.nextInt(0, 4);
        int gols2 = random.nextInt(0, 4);
        System.out.println("\nPartida: " + time1.getNome() + " X " + time2.getNome());
        System.out.println("Resultado: " + time1.getNome() + " " + gols1 + " X " + gols2 + " " + time2.getNome());

        if (gols1 > gols2) {
            time1.anotarVitoria(gols1, gols2);
            time2.anotarDerrota(gols2, gols1);
        } else if (gols1 == gols2) {
            time1.anotarEmpate(gols1, gols2);
            time2.anotarEmpate(gols1, gols2);
        } else {
            time1.anotarDerrota(gols1, gols2);
            time2.anotarVitoria(gols2, gols1);
        }
    }

}