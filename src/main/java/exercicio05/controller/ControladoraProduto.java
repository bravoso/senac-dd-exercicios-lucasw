package exercicio05.controller;

import exercicio05.model.BO.ProdutoBO;
import exercicio05.model.DAO.ProdutoDAO;
import exercicio05.model.VO.Produto;

public class ControladoraProduto {

	private ProdutoBO bo = new ProdutoBO();

	public String salvar(Produto produto) {
		String validacao = validarProduto(produto);

		if(validacao == "") {
			if(produto.getId() > 0) {
				//INSERT
				if(bo.atualizar(produto)) {
					validacao = "Produto atualizado com sucesso!";
				}else {
					validacao = "Erro ao atualizar produto";
				}
			}else {
				//INSERT
				if(bo.inserir(produto)) {
					validacao = "Produto salvo com sucesso!";
				}else {
					validacao = "Erro ao salvar produto";
				}
			}
		}

		return validacao;
	}

	private String validarProduto(Produto produto) {
		String validacao = "";

		if(produto == null) {
			validacao = "Produto está NULO!";
		}else {
			//Validar o preenchimento
			if(produto.getNome().trim().equals("")) {
				validacao += "- Nome é obrigatório \n";
			}
			if(produto.getFabricante().trim().equals("")) {
				validacao += "- Fabricante é obrigatório \n";
			}
		}
		return validacao;
	}
}
