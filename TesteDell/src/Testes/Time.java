package Testes;

public class Time {
	String nomeTime;
	String gritoTime;
	int anoFund;
	int PontosIni = 50;
	
	
	public Time(String nomeTime, String gritoTime , int anoFund ) {
		this.nomeTime = nomeTime;
		this.gritoTime = gritoTime;
		this.anoFund = anoFund;
		this.PontosIni = 50;
	}
	
	
	public String getNomeTime() {
		return nomeTime;
	}


	public String getGritoTime() {
		return gritoTime;
	}


	public int getAnoFund() {
		return anoFund;
	}
	

	public int getPontosI() {
        return PontosIni;
    }

    public void adicionarPontos(int pontos) {
        this.PontosIni += pontos;
    }


	@Override
	public String toString() {
		return "Time=" + nomeTime + ", Grito=" + gritoTime + ", Ano de fundação=" + anoFund + "";
	}
	
	
}
