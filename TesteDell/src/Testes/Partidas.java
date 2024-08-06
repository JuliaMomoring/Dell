package Testes;

import java.util.ArrayList;
import java.util.Collections;

public class Partidas {
    private ArrayList<Time> times;

    public Partidas(ArrayList<Time> times) {
        this.times = new ArrayList<>(times);
    }
//aqui puxa os nomes da classe CadastroTimes e randomiza os times para ficarem um contra o outro
    public ArrayList<String> getPartidas() {
        Collections.shuffle(times);
        ArrayList<String> partidas = new ArrayList<>();

    
        if (times.size() >= 8) {
            Time time1 = times.get(0);
            Time time2 = times.get(1);
            Time time3 = times.get(2);
            Time time4 = times.get(3);
            Time time5 = times.get(4);
            Time time6 = times.get(5);
            Time time7 = times.get(6);
            Time time8 = times.get(7);
            //primeira fase dos times aqui
            partidas.add("|" + time1.getNomeTime() + " vs " + time2.getNomeTime() + "|");
            partidas.add("|" + time3.getNomeTime() + " vs " + time4.getNomeTime() + "|");
            partidas.add("|" + time5.getNomeTime() + " vs " + time6.getNomeTime() + "|");
            partidas.add("|" + time7.getNomeTime() + " vs " + time8.getNomeTime() + "|");

            
            
            
            
            
            
            
          //vencedores da primeira fase aqui
            Time vencedor1 = time1; 
            Time vencedor2 = time3;
            Time vencedor3 = time5; 
            Time vencedor4 = time7; 
            
           //Os times vencedores da primeira fase, aqui segue a segunda fase
            partidas.add("|" + vencedor1.getNomeTime() + " vs " + vencedor2.getNomeTime() + "|");
            partidas.add("|" + vencedor3.getNomeTime() + " vs " + vencedor4.getNomeTime() + "|");

            // Terceira fase (vencedores da segunda fase)
            Time finalista1 = vencedor1; 
            Time finalista2 = vencedor3; 
            
            
            partidas.add("|" + finalista1.getNomeTime() + " vs " + finalista2.getNomeTime() + "|");
        } else {
            partidas.add("");
        }

        return partidas;
    }

    public void exibirPartidas() {
        ArrayList<String> partidas = getPartidas();
        System.out.println("=== Randomizando partidas ===");
        System.out.println("Times selecionados para as partidas:");
        for (String partida : partidas) {
            System.out.println(partida);
        }
    }
    
 
    
  
}
