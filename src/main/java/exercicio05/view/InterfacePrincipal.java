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

	public static void erroMenu(String resultado) {
		// TODO Auto-generated method stub

		if (resultado == "erro") {
			resultado = selecionarOpcao();
		}
		;
	}

	public static String selecionarOpcao() {
		int opcao = -1;
		boolean decisao = true;

		do {
			String OPCOES_MENU = "1 - Cadastrar novo produto \n2 - Cadastrar novo funcionário \n3 - Consultar produtos \n4 - Consultar funcionários";
			String selecao = JOptionPane.showInputDialog(OPCOES_MENU);

			try {
				opcao = Integer.parseInt(selecao);
				decisao = false;
			} catch (java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Opção inválida, por favor digite um número inteiro");

			}
			;

		} while (decisao == true);
		switch (opcao) {
		case 1:
			CadastroProduto();
			break;
		case 2:
			CadastroFuncionario();
			break;
		case 3:
			ConsultarProduto();
			break;
		case 4:
			ConsultarFuncionario();
			break;
		default:
			break;
		}

		return null;
	}


	private static void ConsultarFuncionario() {
		JFrame frame = new JFrame("Cadastro Funcionario");
		frame.setVisible(true);
		frame.setSize(310, 350);
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
		btnCadastrar.setBounds(68, 287, 153, 23);
		painelCadastroFuncionario.add(btnCadastrar);

		frame.getContentPane().add(painelCadastroFuncionario);

	}

	

	private static void ConsultarProduto() {
		JFrame frmCadastroProduto = new JFrame("Cadastro Funcionario");
		frmCadastroProduto.setTitle("Consultar produto");
		frmCadastroProduto.setVisible(true);
		frmCadastroProduto.setSize(310, 509);
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
		btnCadastrar.setBounds(80, 446, 133, 23);
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
		frame.setSize(310, 350);
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
		btnCadastrar.setBounds(73, 287, 144, 23);
		painelCadastroFuncionario.add(btnCadastrar);

		frame.getContentPane().add(painelCadastroFuncionario);
	}


	private static void CadastroProduto() {
		JFrame frmCadastroProduto = new JFrame("Cadastro Funcionario");
		frmCadastroProduto.setTitle("Cadastro Produto");
		frmCadastroProduto.setVisible(true);
		frmCadastroProduto.setSize(310, 462);
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
		btnCadastrar.setBounds(74, 399, 136, 23);
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
