package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;

public class GUI {

	private JFrame frmAplicaoCarro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmAplicaoCarro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAplicaoCarro = new JFrame();
		frmAplicaoCarro.getContentPane().setBackground(Color.GRAY);
		frmAplicaoCarro.setTitle("Aplica\u00E7\u00E3o Carro");
		frmAplicaoCarro.setBounds(100, 100, 450, 300);
		frmAplicaoCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAplicaoCarro.getContentPane().setLayout(new MigLayout("", "[131px][153px]", "[23px][23px]"));
		
		JButton btnCadastrarCarro = new JButton("Cadastrar novo carro");
		btnCadastrarCarro.setBackground(Color.LIGHT_GRAY);
		frmAplicaoCarro.getContentPane().add(btnCadastrarCarro, "cell 0 0,alignx center,aligny center");
		
		JButton btnConsultarCarro = new JButton("Consultar carro por placa");
		btnConsultarCarro.setBackground(Color.LIGHT_GRAY);
		frmAplicaoCarro.getContentPane().add(btnConsultarCarro, "cell 1 0,alignx center,aligny center");
		
		JButton btnCadastrarDono = new JButton("Cadastrar dono");
		btnCadastrarDono.setBackground(Color.LIGHT_GRAY);
		frmAplicaoCarro.getContentPane().add(btnCadastrarDono, "cell 0 1,growx,aligny center");
		
		JButton btnConsultarDono = new JButton("Consultar dono por CPF");
		btnConsultarDono.setBackground(Color.LIGHT_GRAY);
		frmAplicaoCarro.getContentPane().add(btnConsultarDono, "cell 1 1,growx,aligny center");
	}

}
