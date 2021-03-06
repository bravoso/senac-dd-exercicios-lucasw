/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05.controller;

import exercicio05.model.BO.FuncionarioBO;
import exercicio05.model.VO.Funcionario;

/**
 *
 * @author Lucas Willuweit
 */
public class ControladoraFuncionario {

	FuncionarioBO bo = new FuncionarioBO();

	public String salvar(Funcionario funcionario) {
		String validacao = validarFuncionario(funcionario);

		if (validacao == "") {
			if (funcionario.getIdFuncionario() > 0) {
				// INSERT
				if (bo.atualizar(funcionario)) {
					validacao = "Produto atualizado com sucesso!";
				} else {
					validacao = "Erro ao atualizar produto";
				}
			} else {
				// INSERT
				if (bo.inserir(funcionario)) {
					validacao = "Produto salvo com sucesso!";
				} else {
					validacao = "Erro ao salvar produto";
				}
			}
		}

		return validacao;
	};

	private String validarFuncionario(Funcionario funcionario) {
		String validacao = "";

		if (funcionario == null) {
			validacao = "Funcionario est� NULO!";
		} else {
			// Validar o preenchimento
			if (funcionario.getNome().trim().equals("")) {
				validacao += "- Nome � obrigat�rio \n";
			}
			if (funcionario.getCpf().trim().equals("")) {
				validacao += "- CPF � obrigat�rio \n";
			}
		}
		return validacao;
	}


}
