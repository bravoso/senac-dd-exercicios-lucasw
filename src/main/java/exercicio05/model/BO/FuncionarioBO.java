package exercicio05.model.BO;

import exercicio05.model.DAO.FuncionarioDAO;
import exercicio05.model.VO.FuncionarioVO;

public class FuncionarioBO {

	FuncionarioDAO dao = new FuncionarioDAO();
	public boolean inserir(FuncionarioVO funcionario) {
		int idGerado = dao.inserir(funcionario);
		return idGerado > 0;
	}
	public FuncionarioVO buscarProdutoPorId(String textoId) {
		FuncionarioVO funcionarioBuscado = dao.obterPorId(Integer.parseInt(textoId));
		return funcionarioBuscado;
	}
	public boolean atualizar(FuncionarioVO funcionario) {
		boolean sucesso = dao.atualizar(funcionario);
		return sucesso;
	}
}
