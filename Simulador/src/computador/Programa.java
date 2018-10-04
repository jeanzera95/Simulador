/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author a120035
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Programa {
	private List<Short> instrucoes;
	private String preProcessedCode;
	
	public Programa() {
		instrucoes = new LinkedList<Short>();
		preProcessedCode = null;
	}
	
	public void addInstrucao(short instrucao) {
		instrucoes.add(instrucao);
	}
	
	public Iterator<Short> iterador() {
		return instrucoes.iterator();
	}

	public void addInstrucao(int instrucao) {
		addInstrucao((short) instrucao); 
	}
	
	public String getPreProcessedCode() {
		return preProcessedCode;
	}

	public void setPreProcessedCode(String preProcessedCode) {
		this.preProcessedCode = preProcessedCode;
	}
}
