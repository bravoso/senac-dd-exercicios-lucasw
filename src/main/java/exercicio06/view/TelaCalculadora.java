package exercicio06.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class TelaCalculadora {

	private JFrame CalculadoraGUI;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora window = new TelaCalculadora();
					window.CalculadoraGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCalculadora() {
		initialize();
	}
	
	Double valor1;
	Double valor2;
	String operacao ="";

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CalculadoraGUI = new JFrame();
		CalculadoraGUI.setResizable(false);
		CalculadoraGUI.getContentPane().setBackground(new Color(0, 204, 153));
		CalculadoraGUI.setTitle("Calculadora");
		CalculadoraGUI.setBounds(100, 100, 292, 306);
		CalculadoraGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalculadoraGUI.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(7, 94, 1, 2);
		CalculadoraGUI.getContentPane().add(separator);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "1");			}
		});
		button1.setBounds(26, 145, 61, 23);
		CalculadoraGUI.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "2");	
			}
		});
		button2.setBounds(86, 145, 61, 23);
		CalculadoraGUI.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "3");	
			}
		});
		button3.setBounds(146, 145, 55, 23);
		CalculadoraGUI.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "4");	
			}
		});
		button4.setBounds(26, 172, 61, 23);
		CalculadoraGUI.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "5");	
			}
		});
		button5.setBounds(86, 172, 61, 23);
		CalculadoraGUI.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});
		button6.setBounds(146, 172, 55, 23);
		CalculadoraGUI.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "7");	
			}
			
		});
		button7.setBounds(26, 199, 61, 23);
		CalculadoraGUI.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "8");	
			}
		});
		button8.setBounds(86, 199, 61, 23);
		CalculadoraGUI.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "9");	
			}
		});
		button9.setBounds(146, 199, 55, 23);
		CalculadoraGUI.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "0");	
			}
		});
		button0.setBounds(86, 226, 61, 23);
		CalculadoraGUI.getContentPane().add(button0);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = " ";
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText(t);
				operacao = "somar";
			}
		});
		buttonPlus.setBounds(211, 145, 61, 23);
		CalculadoraGUI.getContentPane().add(buttonPlus);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = " ";
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText(t);
				operacao = "subtrair";
			}
		});
		buttonMinus.setBounds(211, 172, 61, 23);
		CalculadoraGUI.getContentPane().add(buttonMinus);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = " ";
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText(t);
				operacao = "dividir";
			}
		});
		buttonDivide.setBounds(211, 199, 61, 23);
		CalculadoraGUI.getContentPane().add(buttonDivide);
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = " ";
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText(t);
				operacao = "multiplicar";
			}
		});
		buttonMultiply.setBounds(211, 226, 61, 23);
		CalculadoraGUI.getContentPane().add(buttonMultiply);
		
		JButton buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + ".");	
				
			}
		});
		buttonDot.setBounds(146, 226, 55, 23);
		CalculadoraGUI.getContentPane().add(buttonDot);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Impact", Font.PLAIN, 14));
		txtResultado.setBackground(new Color(255, 204, 204));
		txtResultado.setBounds(25, 59, 247, 37);
		CalculadoraGUI.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		
		//calcula o resultado da operação
		JButton Equals = new JButton("=");
		Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtResultado.getText());
				calcular();
			}

			private void calcular() {
				if(operacao == "multiplicar") {
					txtResultado.setText(String.valueOf(valor1 * valor2));
				};
				if(operacao == "somar"){
					txtResultado.setText(String.valueOf(valor1 + valor2));
				};
				if(operacao == "subtrair"){
					txtResultado.setText(String.valueOf(valor1 - valor2));
				};
				if(operacao == "dividir"){
					txtResultado.setText(String.valueOf(valor1 / valor2));
				};
			}
		});
		Equals.setBounds(26, 226, 61, 23);
		CalculadoraGUI.getContentPane().add(Equals);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = "";
				valor1 =0.0;
				valor2 =0.0;
				txtResultado.setText(t);
			}
		});
		btnClear.setBounds(26, 111, 61, 23);
		CalculadoraGUI.getContentPane().add(btnClear);
		
		JLabel lblEstaCalculadoraCalcula = new JLabel("Esta calculadora calcula apenas dois valores.");
		lblEstaCalculadoraCalcula.setBounds(7, 11, 279, 14);
		CalculadoraGUI.getContentPane().add(lblEstaCalculadoraCalcula);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(24, 45, 97, 14);
		CalculadoraGUI.getContentPane().add(lblResultado);
	}


		
	}
	



