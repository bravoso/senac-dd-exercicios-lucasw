package exercicio05.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import exercicio05.model.DAO.BaseDAO;
import exercicio05.model.VO.Funcionario;

public class FuncionarioDAO extends BaseDAO<Funcionario>{

	public int inserir(Funcionario p){
		int novoId = -1;

		String sql = " INSERT INTO FUNCIONARIO (NOME, MATRICULA, CPF) "
				+ " VALUES (?,?,?) ";

		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql, 
				Statement.RETURN_GENERATED_KEYS);

		try {
			prepStmt.setString(1, p.getNome());
			prepStmt.setString(2, p.getNumeroMatricula());
			prepStmt.setString(3, p.getCpf());

			prepStmt.execute();

			ResultSet generatedKeys = prepStmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				novoId = generatedKeys.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir funcionario. Causa: \n: " + e.getMessage());
		} finally{
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conexao);
		}

		return novoId;
	}

	public boolean atualizar(Funcionario p){
		boolean sucessoUpdate = false;

		String sql = " UPDATE FUNCIONARIO P SET NOME=?, MATRICULA=?, CPF=? "
				+ " WHERE P.ID = ? ";

		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);

		try {
			prepStmt.setString(1, p.getNome());
			prepStmt.setString(2, p.getNumeroMatricula());
			prepStmt.setString(3, p.getCpf());
			prepStmt.setDouble(5, p.getIdFuncionario());

			int codigoRetorno = prepStmt.executeUpdate();

			if(codigoRetorno == 1){
				sucessoUpdate = true;
			}

		} catch (SQLException e) {
			System.out.println("Erro ao atualizar funcionario");
		}finally{
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conexao);
		}

		return sucessoUpdate;
	}
	
	//DELETE
	public boolean remover(int id){
		boolean sucessoDelete = false;

		String sql = " DELETE FROM FUNCIONARIO "
				+ " WHERE ID = ? ";

		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);

		try {
			prepStmt.setInt(1, id);

			int codigoRetorno = prepStmt.executeUpdate();

			if(codigoRetorno == 1){//1 - sucesso na execução
				sucessoDelete = true;
			}

		} catch (SQLException e) {
			System.out.println("Erro ao remover FUNCIONARIO. Id = " + id);
		}finally{
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conexao);
		}
		return sucessoDelete;
	}
	
	public ArrayList<Funcionario> listarTodos(){
		String sql = " SELECT * FROM FUNCIONARIO ";
		
		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);
		ArrayList<Funcionario> produtos = new ArrayList<Funcionario>();
		
		try {
			ResultSet result = prepStmt.executeQuery(sql);
			
			while(result.next()){
				Funcionario p = new Funcionario();
				
				//Obtendo valores pelo NOME DA COLUNA
				p.setIdFuncionario(result.getInt("ID"));
				p.setNome(result.getString("NOME"));
				p.setNumeroMatricula(result.getString("MATRICULA"));
				p.setCpf(result.getString("CPF"));
				produtos.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produtos;
	}
	
	/**
	 * Retorna um produto dado um id.
	 * 
	 * @param id o identificador do produto
	 * @return um produto caso o id exista na tabela Produto
	 * 		   null caso contrário
	 */
	public Funcionario obterPorId(int id){
		String sql = " SELECT * FROM FUNCIONARIO "
				+ " WHERE ID=?";
		
		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);
		Funcionario p = null;
		
		try {
			prepStmt.setInt(1, id);
			ResultSet result = prepStmt.executeQuery();
			
			while(result.next()){
				p = new Funcionario();
				
				//Obtendo valores pelo NOME DA COLUNA
				p.setIdFuncionario(result.getInt("ID"));
				p.setNome(result.getString("NOME"));
				p.setCpf(result.getString("CPF"));
				p.setNumeroMatricula(result.getString("MATRICULA"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public String getNomeTabela() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNomeColunaChavePrimaria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNomesColunasInsert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInterrogacoesInsert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValoresAtributosInsert(Funcionario entidade, PreparedStatement preparedStmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getValoresClausulaSetUpdate(Funcionario entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValoresAtributosUpdate(Funcionario entidade, PreparedStatement stmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario construirObjetoDoResultSet(ResultSet resultado) {
		// TODO Auto-generated method stub
		return null;
	}



}

