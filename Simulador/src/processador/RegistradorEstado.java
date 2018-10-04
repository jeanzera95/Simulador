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

public class RegistradorEstado extends Registrador<Byte> {
	private Byte palavra = 0;

	RegistradorEstado(String alias, Representacao representacao) {
		super(alias, representacao);
	}

	@Override
	void setPalavra(Byte palavra) {
		this.palavra = palavra;
	}

	@Override
	Byte getPalavra() {
		return palavra;
	}

}