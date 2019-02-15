package br.com.ghw.framework;

public class Processo {
	private String pid;
	private int tempoInicio;
	private int tempoExec;
	private int tempoAtual;
	StatusProcesso meuStatus;

	public Processo() {
		// TODO Auto-generated constructor stub
	}
	
	public Processo(String pid, int tempoInicio, int tempoExec) {
		this.pid = pid;
		this.tempoInicio = tempoInicio;
		this.tempoExec = tempoExec;
		this.tempoAtual = 0;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getTempoInicio() {
		return tempoInicio;
	}

	public void setTempoInicio(int tempoInicio) {
		this.tempoInicio = tempoInicio;
	}

	public int getTempoExec() {
		return tempoExec;
	}

	public void setTempoExec(int tempoExec) {
		this.tempoExec = tempoExec;
	}
	
	public void setTempoAtual(int tempoAtual) {
		this.tempoAtual = tempoAtual;
	}

	public int getTempoAtual() {
		return tempoAtual;
	}
}
