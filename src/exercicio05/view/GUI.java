package exercicio05.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Menu Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		GridBagConstraints gbc_btnCadastrarProduto = new GridBagConstraints();
		gbc_btnCadastrarProduto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCadastrarProduto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCadastrarProduto.gridx = 1;
		gbc_btnCadastrarProduto.gridy = 1;
		contentPane.add(btnCadastrarProduto, gbc_btnCadastrarProduto);
		
		JButton btnCadastrarFuncionrio = new JButton("Cadastrar Funcion\u00E1rio");
		btnCadastrarFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnConsultarProduto = new JButton("Consultar Produto");
		GridBagConstraints gbc_btnConsultarProduto = new GridBagConstraints();
		gbc_btnConsultarProduto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConsultarProduto.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultarProduto.gridx = 5;
		gbc_btnConsultarProduto.gridy = 1;
		contentPane.add(btnConsultarProduto, gbc_btnConsultarProduto);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 5;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 3;
		contentPane.add(separator, gbc_separator);
		GridBagConstraints gbc_btnCadastrarFuncionrio = new GridBagConstraints();
		gbc_btnCadastrarFuncionrio.insets = new Insets(0, 0, 0, 5);
		gbc_btnCadastrarFuncionrio.gridx = 1;
		gbc_btnCadastrarFuncionrio.gridy = 4;
		contentPane.add(btnCadastrarFuncionrio, gbc_btnCadastrarFuncionrio);
		
		JButton btnConsultarFuncionrio = new JButton("Consultar Funcion\u00E1rio");
		GridBagConstraints gbc_btnConsultarFuncionrio = new GridBagConstraints();
		gbc_btnConsultarFuncionrio.gridx = 5;
		gbc_btnConsultarFuncionrio.gridy = 4;
		contentPane.add(btnConsultarFuncionrio, gbc_btnConsultarFuncionrio);
	}

}
