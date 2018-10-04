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
public enum Estado {
	SOLICITAR_INSTRUCAO,
	BUSCA_INSTRUCAO,
	DECODIFICACAO,
	BUSCA_OPERANDO,
	EXECUCAO,
	HALT
}