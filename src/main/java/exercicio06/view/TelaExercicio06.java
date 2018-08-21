package exercicio06.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio06 {

	private JFrame frmTelaSistema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio06 window = new TelaExercicio06();
					window.frmTelaSistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaExercicio06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaSistema = new JFrame();
		frmTelaSistema.getContentPane().setBackground(Color.GRAY);
		frmTelaSistema.setTitle("Tela Sistema");
		frmTelaSistema.setBounds(100, 100, 450, 300);
		frmTelaSistema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaSistema.getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][]", "[][][][][][]"));
		
		JButton btnCadastrarNovoCarro = new JButton("Cadastrar novo carro");
		btnCadastrarNovoCarro.setBackground(Color.LIGHT_GRAY);
		frmTelaSistema.getContentPane().add(btnCadastrarNovoCarro, "cell 0 2");
		
		JButton btnCadastrarNovoMotorista = new JButton("Cadastrar novo Motorista");
		btnCadastrarNovoMotorista.setBackground(Color.LIGHT_GRAY);
		frmTelaSistema.getContentPane().add(btnCadastrarNovoMotorista, "cell 10 2");
		
		JButton btnConsultarCarro = new JButton("Consultar carro");
		btnConsultarCarro.setBackground(Color.LIGHT_GRAY);
		frmTelaSistema.getContentPane().add(btnConsultarCarro, "cell 0 5,growx");
		
		JButton btnConsultarMotoristas = new JButton("Consultar motoristas");
		btnConsultarMotoristas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConsultarMotoristas.setBackground(Color.LIGHT_GRAY);
		frmTelaSistema.getContentPane().add(btnConsultarMotoristas, "cell 10 5,growx");
	}

}
