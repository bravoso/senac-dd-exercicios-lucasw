package exercicio05.model.BO;

import exercicio05.model.DAO.FuncionarioDAO;
import exercicio05.model.VO.Funcionario;

public class FuncionarioBO {

	FuncionarioDAO dao = new FuncionarioDAO();
	public boolean inserir(Funcionario funcionario) {
		int idGerado = dao.inserir(funcionario);
		return idGerado > 0;
	}
	public Funcionario buscarFuncionarioPorId(String textoId) {
		Funcionario funcionarioBuscado = dao.obterPorId(Integer.parseInt(textoId));
		return funcionarioBuscado;
	}
	public boolean atualizar(Funcionario funcionario) {
		boolean sucesso = dao.atualizar(funcionario);
		return sucesso;
	}
}
