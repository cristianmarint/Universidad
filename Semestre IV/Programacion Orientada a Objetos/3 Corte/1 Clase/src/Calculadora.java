import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Calculadora {

	private JFrame frame;
	private JTextField operadorUno;
	private JTextField operadorDos;
	private JTextField ResultadoOperacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 626, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		operadorUno = new JTextField();
		operadorUno.setBounds(10, 55, 147, 45);
		frame.getContentPane().add(operadorUno);
		operadorUno.setColumns(10);
		
		operadorDos = new JTextField();
		operadorDos.setColumns(10);
		operadorDos.setBounds(197, 55, 147, 45);
		frame.getContentPane().add(operadorDos);
		
		ResultadoOperacion = new JTextField();
		ResultadoOperacion.setEditable(false);
		ResultadoOperacion.setColumns(10);
		ResultadoOperacion.setBounds(367, 198, 230, 70);
		frame.getContentPane().add(ResultadoOperacion);
		
		
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            int v1=Integer.parseInt(operadorUno.getText());
	            int v2=Integer.parseInt(operadorDos.getText());            
	            int suma=v1+v2;           
	            ResultadoOperacion.setText(String.valueOf(suma));
			}
		});
		suma.setBounds(29, 128, 95, 85);
		frame.getContentPane().add(suma);
		
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            int v1=Integer.parseInt(operadorUno.getText());
	            int v2=Integer.parseInt(operadorDos.getText());            
	            int res=v1-v2;           
	            ResultadoOperacion.setText(String.valueOf(res));
			}
		});
		resta.setBounds(29, 235, 95, 85);
		frame.getContentPane().add(resta);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            int v1=Integer.parseInt(operadorUno.getText());
	            int v2=Integer.parseInt(operadorDos.getText());            
	            int res=(v1*v2);           
	            ResultadoOperacion.setText(String.valueOf(res));
			}
		});
		multiplicacion.setBounds(223, 128, 95, 85);
		frame.getContentPane().add(multiplicacion);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            int v1=Integer.parseInt(operadorUno.getText());
	            int v2=Integer.parseInt(operadorDos.getText());
	            
	            if(v2<=0) {
	            	ResultadoOperacion.setText("El segundo valor debe de ser mayor a 0");
	            }else {
	            	float res=v1/v2;           
	            	ResultadoOperacion.setText(String.valueOf(res));            	
	            }
	            
			}
		});
		division.setBounds(223, 235, 95, 85);
		frame.getContentPane().add(division);
		
		JButton limpiar = new JButton("Limpiar");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {    
	            operadorUno.setText("");
	            operadorDos.setText("");
	            ResultadoOperacion.setText("");
			}
		});
		limpiar.setBounds(81, 344, 204, 86);
		frame.getContentPane().add(limpiar);
		
		JLabel lblIngreseDosNumeros = new JLabel("Ingrese dos numeros");
		lblIngreseDosNumeros.setBounds(10, 11, 293, 14);
		frame.getContentPane().add(lblIngreseDosNumeros);
	}
}
