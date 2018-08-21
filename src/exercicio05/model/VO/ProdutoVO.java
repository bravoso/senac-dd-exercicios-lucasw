package exercicio05.model.VO;

public class ProdutoVO {

	private int id;
	private String nome;
	private String Fabricante;
	private Double custo;
	private Double preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public ProdutoVO(int id, String nome, String fabricante, Double custo, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		Fabricante = fabricante;
		this.custo = custo;
		this.preco = preco;
	}

	public ProdutoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
