package Testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class pontosPartida {
    private int BLOT = 5;
    private int PLIF = 1;
    private int ADV = -10;

    public void jogar(Time time) {
        List<Integer> jogada = new ArrayList<>();
        jogada.add(BLOT);
        jogada.add(PLIF);
        jogada.add(ADV);
        Collections.shuffle(jogada);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int pontosGanhos = jogada.get(random.nextInt(jogada.size()));
            if (pontosGanhos == BLOT) {
                time.adicionarPontos(BLOT);
            } else if (pontosGanhos == PLIF) {
                time.adicionarPontos(PLIF);
            } else if (pontosGanhos == ADV) {
                time.adicionarPontos(ADV);
            }
            System.out.println(time.getNomeTime() + " fez " + pontosGanhos + " pontos na rodada " + (i + 1));
        }
    }
}
