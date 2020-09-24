package br.inatel.cdg.aula_09_travis;

public class Pilha {

	int qtd = 0;
	public boolean isVazia() {
		if(qtd==0)
			return true;
		else
			return false;
	}

	public void push(int i) {
		qtd = i;
		
	}

}
