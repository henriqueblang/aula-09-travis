package br.inatel.cdg.aula_09_travis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPilha {

	@Test
	public void testPilhaVazia() {
		Pilha pilha = new Pilha();
		assertTrue(pilha.isVazia());
	}
	
	@Test
	public void testPush() {
		Pilha pilha = new Pilha();
		pilha.push(23);
		assertFalse(pilha.isVazia());
	}

}
