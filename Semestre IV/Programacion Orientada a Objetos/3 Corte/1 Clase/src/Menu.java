import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;

public class Menu {

	private JFrame frame;
	private JTextField ojoIzq;
	private JTextField ojoDer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 398, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu comb1 = new JMenu("Combinaciones c:");
		menuBar.add(comb1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMaximum(60);
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(164, 126, 71, 14);
		progressBar.setValue(0);
		frame.getContentPane().add(progressBar);
		
		JMenuItem RojoNegro = new JMenuItem("Rojo + Negro");
			RojoNegro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.getContentPane().setBackground(new Color(34,34,34));
					progressBar.setValue(10);
					progressBar.setBackground(new Color(255,82,82));
					ojoIzq.setBackground(new Color(255,82,82));				
					ojoDer.setBackground(new Color(255,82,82));
				}
			});
		comb1.add(RojoNegro);
		
		
		
		JMenuItem AmarilloNegro = new JMenuItem("Amarillo + Negro");
		AmarilloNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(34,34,34));
				progressBar.setValue(20);
				progressBar.setBackground(new Color(255,212,84));
				ojoIzq.setBackground(new Color(255,212,84));				
				ojoDer.setBackground(new Color(255,212,84));
			}
		});
		comb1.add(AmarilloNegro);
		
		
		
		JMenuItem AzulNegro = new JMenuItem("Azul + Negro");
		AzulNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(34,34,34));
				progressBar.setValue(30);
				progressBar.setBackground(new Color(82,195,255));
				ojoIzq.setBackground(new Color(82,195,255));				
				ojoDer.setBackground(new Color(82,195,255));
			}
		});
		comb1.add(AzulNegro);

//--------------------------------------------------
		
		JMenuItem RojoBlanco = new JMenuItem("Rojo + Blanco");
		RojoBlanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(238,238,238));
				progressBar.setValue(40);
				progressBar.setBackground(new Color(255,82,82));
				ojoIzq.setBackground(new Color(255,82,82));				
				ojoDer.setBackground(new Color(255,82,82));
			}
		});
		comb1.add(RojoBlanco);

		
		
		JMenuItem AmarilloBlanco = new JMenuItem("Amarillo + Blanco");
		AmarilloBlanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(238,238,238));
				progressBar.setValue(50);
				progressBar.setBackground(new Color(255,212,84));
				ojoIzq.setBackground(new Color(255,212,84));				
				ojoDer.setBackground(new Color(255,212,84));
			}
		});
		comb1.add(AmarilloBlanco);

		
		
		JMenuItem AzulBlanco = new JMenuItem("Azul + Blanco");
		AzulBlanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(238,238,238));
				progressBar.setValue(60);
				progressBar.setBackground(new Color(82,195,255));
				ojoIzq.setBackground(new Color(82,195,255));				
				ojoDer.setBackground(new Color(82,195,255));
			}
		});
		comb1.add(AzulBlanco);
		
		//--------------------------------------------------

		JMenuItem vacio = new JMenuItem("Restaurar");
		vacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(Color.WHITE);
				progressBar.setValue(0);
				progressBar.setBackground(Color.WHITE);
				ojoIzq.setBackground(Color.WHITE);				
				ojoDer.setBackground(Color.WHITE);
			}
		});
		comb1.add(vacio);
		
		frame.getContentPane().setLayout(null);
		
		
		
		
		ojoIzq = new JTextField();
		ojoIzq.setEditable(false);
		ojoIzq.setBounds(93, 85, 86, 20);
		frame.getContentPane().add(ojoIzq);
		ojoIzq.setColumns(10);
		
		ojoDer = new JTextField();
		ojoDer.setEditable(false);
		ojoDer.setBounds(220, 85, 86, 20);
		frame.getContentPane().add(ojoDer);
		ojoDer.setColumns(10);
		
		frame.getContentPane().setBackground(Color.WHITE);		
		ojoIzq.setBackground(Color.WHITE);				
		ojoDer.setBackground(Color.WHITE);
		
	}
}
