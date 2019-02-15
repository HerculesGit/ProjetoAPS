package br.com.ghw.framework;

import java.util.Queue;

public class EscalonadorRoundRobin extends Escalonador {
	
	private int quantum;
	private Queue<Processo> fila;

	public EscalonadorRoundRobin() {
		// TODO Auto-generated constructor stub
	}
	
	public EscalonadorRoundRobin(int quantum) {
		this.quantum = quantum;
	}

	public int getQuantum() {
		return quantum;
	}

	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}

	@Override
	public TabelaResultante rodar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void salvaContexto() {
		// avançar o quantum
		quantum+=1;
		
		// verificar qual o processo atual
		//fila
		
		
		
		
	}
	
}
