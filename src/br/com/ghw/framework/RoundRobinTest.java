package br.com.ghw.framework;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoundRobinTest {

	@Test
	void deveriaAdicionarVariosProcessosAoEscalonador() {
		
		/*
			P1 RF
			P2 WRRF
			P3 WWWRRRWWRRRF
			P4 NNWWWWRRF
		 */
		
		EscalonadorRoundRobin escalonador = new EscalonadorRoundRobin(3);
		escalonador.addProcesso("P1", 0, 1);
		escalonador.addProcesso("P2", 0, 2);
		escalonador.addProcesso("P3", 0, 6);
		escalonador.addProcesso("P4", 3, 2);
		
		TabelaResultante tabela = escalonador.rodar();
		assertEquals(StatusProcesso.Executando, escalonador.checarStatus("P1", 0));
		assertEquals("P1 RF\n", tabela.linhaProcesso("P1"));
		
		assertEquals("P1 RF\n" + 
				"P2 WRRF\n" + 
				"P3 WWWRRRWWRRRF\n" + 
				"P4 NNWWWWRRF\n", tabela.resultado());
		
	}
	
	@Test
	void deveCriarUmProcesso() {
		Processo pro = new Processo();
		pro.setPid("P1");
		pro.setTempoExec(3);
		pro.setTempoInicio(0);
		assertEquals("P1", pro.getPid());
		assertEquals(3, pro.getTempoExec());
		assertEquals(0, pro.getTempoInicio());
	}
}
