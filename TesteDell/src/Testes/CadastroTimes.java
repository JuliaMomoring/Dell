package Testes;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTimes {
    private ArrayList<Time> times;

    public CadastroTimes() {
        times = new ArrayList<>();
    }

    public void cadastrarTimes() {
        Scanner scan = new Scanner(System.in);
        // Cadastro de até 8 times(mínimo)
        for (int i = 0; i < 8; i++) {
            System.out.println("Cadastro do time " + (i + 1));

            System.out.print("Nome do time: ");
            String nomeTime = scan.nextLine();

            System.out.print("Grito de guerra do time: ");
            String gritoTime = scan.nextLine();

            System.out.print("Ano de fundação do time: ");
            int anoFund = scan.nextInt();
            scan.nextLine(); 

            Time time = new Time(nomeTime, gritoTime, anoFund);
            times.add(time);

            System.out.println(); 
            
           
        }
        scan.close();
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public static void main(String[] args) {
        CadastroTimes cadastro = new CadastroTimes();
        cadastro.cadastrarTimes();
        
        ArrayList<Time> times = cadastro.getTimes();
        
        // Cria' a instância de Partidas com a lista de times
        Partidas partidas = new Partidas(times);
        
        // Chamar o método para exibir as partidas
        partidas.exibirPartidas();
    }
}
