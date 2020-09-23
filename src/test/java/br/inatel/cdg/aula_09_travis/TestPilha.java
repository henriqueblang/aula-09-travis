package br.inatel.cdg.aula_09_travis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPilha {

	@Test
	public void testPilhaVazia() {
		Pilha pilha = new Pilha();
		assertTrue(pilha.isVazia());
	}

}
