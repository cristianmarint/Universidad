import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo {

	private JFrame frame;
	private JTextField varUno;
	private JTextField varDos;
	private JTextField Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo window = new Ejemplo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("COMO SUMAR");
		titulo.setBounds(160, 0, 130, 25);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(titulo);
		
		varUno = new JTextField();
		varUno.setBounds(182, 49, 86, 20);
		frame.getContentPane().add(varUno);
		varUno.setColumns(10);
		
		varDos = new JTextField();
		varDos.setBounds(182, 101, 86, 20);
		frame.getContentPane().add(varDos);
		varDos.setColumns(10);
		
		JLabel textUno = new JLabel("Valor uno");
		textUno.setBounds(48, 49, 46, 14);
		frame.getContentPane().add(textUno);
		
		JLabel textDos = new JLabel("Valor dos");
		textDos.setBounds(48, 104, 46, 14);
		frame.getContentPane().add(textDos);
		
		Resultado = new JTextField();
		Resultado.setEditable(false);
		Resultado.setBounds(272, 148, 86, 20);
		frame.getContentPane().add(Resultado);
		Resultado.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            int v1=Integer.parseInt(varUno.getText());
	            int v2=Integer.parseInt(varDos.getText());
	            int suma=v1+v2;
	            Resultado.setText(String.valueOf(suma));
			}
		});
		btnSumar.setBounds(178, 147, 89, 23);
		frame.getContentPane().add(btnSumar);
	}
}
