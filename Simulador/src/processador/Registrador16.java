/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processador;

/**
 *
 * @author a120035
 */
import computador.Representacao;


public class Registrador16 extends Registrador<Short> {
	private Short palavra;
	
	Registrador16(String alias, Representacao representacao) {
		super(alias, representacao);
		palavra = 0;
	}

	@Override
	void setPalavra(Short palavra) {
		this.palavra = palavra;
	}

	@Override
	Short getPalavra() {
		return palavra;
	}
	
	
}
