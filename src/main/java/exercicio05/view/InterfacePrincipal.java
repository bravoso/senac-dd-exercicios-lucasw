package exercicio05.view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InterfacePrincipal {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;

	public static void main(String[] args) {

		selecionarOpcao();

	}

	private static void selecionarOpcao() {
		int opcao = -1;
		String OPCOES_MENU = "1 - Cadastrar novo produto \n2 - Cadastrar novo funcion�rio \n3 - Consultar produtos \n4 - Consultar funcion�rios";
		String selecao = JOptionPane.showInputDialog(OPCOES_MENU);

		try {
			opcao = Integer.parseInt(selecao);
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Op��o inv�lida, por favor digite um n�mero inteiro");
			selecao = JOptionPane.showInputDialog(OPCOES_MENU);
		}
		;
		if (opcao == 1) {
			CadastroProduto();
		}
		if (opcao == 2) {
			CadastroFuncionario();
		}
		if (opcao == 3) {
			ConsultarProduto();
		}
		if (opcao == 4) {
			ConsultarFuncionario();
		}
	}



	private static void ConsultarFuncionario() {
		JFrame frame = new JFrame("Cadastro Funcionario");
	    frame.setVisible(true);
	    frame.setSize(310, 271);
	    frame.setResizable(false);
		JPanel painelCadastroFuncionario = new JPanel();
		painelCadastroFuncionario.setLayout(null);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do funcion\u00E1rio:");
		lblDigiteONome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteONome.setBounds(20, 32, 255, 14);
		painelCadastroFuncionario.add(lblDigiteONome);
		
		textField = new JTextField();
		textField.setBounds(20, 58, 255, 20);
		painelCadastroFuncionario.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o CPF:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOCpf.setBounds(20, 103, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 131, 255, 20);
		painelCadastroFuncionario.add(textField_1);
		
		JButton btnCadastrar = new JButton("Consultar");
		btnCadastrar.setBounds(104, 191, 89, 23);
		painelCadastroFuncionario.add(btnCadastrar);

		frame.getContentPane().add(painelCadastroFuncionario);
		
	}



	private static void ConsultarProduto() {
		JFrame frmCadastroProduto = new JFrame("Cadastro Funcionario");
		frmCadastroProduto.setTitle("Consultar produto");
	    frmCadastroProduto.setVisible(true);
	    frmCadastroProduto.setSize(310, 489);
	    frmCadastroProduto.setResizable(false);
		JPanel painelCadastroFuncionario = new JPanel();
		painelCadastroFuncionario.setLayout(null);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do produto:");
		lblDigiteONome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteONome.setBounds(20, 122, 255, 14);
		painelCadastroFuncionario.add(lblDigiteONome);
		
		textField = new JTextField();
		textField.setBounds(20, 148, 255, 20);
		painelCadastroFuncionario.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o fabricante:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOCpf.setBounds(20, 193, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 221, 255, 20);
		painelCadastroFuncionario.add(textField_1);
		
		JButton btnCadastrar = new JButton("Consultar");
		btnCadastrar.setBounds(100, 426, 89, 23);
		painelCadastroFuncionario.add(btnCadastrar);

		frmCadastroProduto.getContentPane().add(painelCadastroFuncionario);
		
		JLabel lblDigiteOPreo = new JLabel("Digite o pre\u00E7o de custo:");
		lblDigiteOPreo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOPreo.setBounds(20, 262, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOPreo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 287, 255, 20);
		painelCadastroFuncionario.add(textField_2);
		
		JLabel lblDigiteOPreo_1 = new JLabel("Digite o pre\u00E7o de venda:");
		lblDigiteOPreo_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOPreo_1.setBounds(20, 331, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOPreo_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(20, 356, 255, 20);
		painelCadastroFuncionario.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(20, 87, 255, 20);
		painelCadastroFuncionario.add(textField_4);
		
		JLabel lblDigiteOId = new JLabel("Digite o ID do produto:");
		lblDigiteOId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOId.setBounds(20, 61, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOId);
	}

	private static void CadastroFuncionario() {
		JFrame frame = new JFrame("Cadastro Funcionario");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.setSize(310, 271);
	    frame.setResizable(false);
		JPanel painelCadastroFuncionario = new JPanel();
		painelCadastroFuncionario.setLayout(null);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do funcion\u00E1rio:");
		lblDigiteONome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteONome.setBounds(20, 32, 255, 14);
		painelCadastroFuncionario.add(lblDigiteONome);
		
		textField = new JTextField();
		textField.setBounds(20, 58, 255, 20);
		painelCadastroFuncionario.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o CPF:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOCpf.setBounds(20, 103, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 131, 255, 20);
		painelCadastroFuncionario.add(textField_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(104, 191, 89, 23);
		painelCadastroFuncionario.add(btnCadastrar);

		frame.getContentPane().add(painelCadastroFuncionario);
	}

	private static void CadastroProduto() {
		JFrame frmCadastroProduto = new JFrame("Cadastro Funcionario");
		frmCadastroProduto.setTitle("Cadastro Produto");
	    frmCadastroProduto.setVisible(true);
	    frmCadastroProduto.setSize(310, 422);
	    frmCadastroProduto.setResizable(false);
		JPanel painelCadastroFuncionario = new JPanel();
		painelCadastroFuncionario.setLayout(null);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do produto:");
		lblDigiteONome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteONome.setBounds(20, 32, 255, 14);
		painelCadastroFuncionario.add(lblDigiteONome);
		
		textField = new JTextField();
		textField.setBounds(20, 58, 255, 20);
		painelCadastroFuncionario.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o fabricante:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOCpf.setBounds(20, 103, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 131, 255, 20);
		painelCadastroFuncionario.add(textField_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(100, 359, 89, 23);
		painelCadastroFuncionario.add(btnCadastrar);

		frmCadastroProduto.getContentPane().add(painelCadastroFuncionario);
		
		JLabel lblDigiteOPreo = new JLabel("Digite o pre\u00E7o de custo:");
		lblDigiteOPreo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOPreo.setBounds(20, 172, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOPreo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 197, 255, 20);
		painelCadastroFuncionario.add(textField_2);
		
		JLabel lblDigiteOPreo_1 = new JLabel("Digite o pre\u00E7o de venda:");
		lblDigiteOPreo_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteOPreo_1.setBounds(20, 241, 255, 14);
		painelCadastroFuncionario.add(lblDigiteOPreo_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(20, 266, 255, 20);
		painelCadastroFuncionario.add(textField_3);
	}
}
