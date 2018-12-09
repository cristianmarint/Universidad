package pantallas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class vendedor {

	JFrame vendedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vendedor window = new vendedor();
					window.vendedor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vendedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		vendedor = new JFrame();
		vendedor.setTitle("Inicio Vendedor");
		vendedor.setBounds(100, 100, 450, 300);
		vendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vendedor.getContentPane().setBackground(Color.WHITE);
		vendedor.setResizable(false);
		vendedor.setBounds(100, 100, 1280, 720);
		vendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vendedor.getContentPane().setLayout(null);
	}

}
