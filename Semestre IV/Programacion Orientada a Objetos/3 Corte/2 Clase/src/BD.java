import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class BD {

	private JFrame frame;
	private JTextField inputnombre;
	private JTextField inputmatricula;
	private JLabel lblresp;
	private JTextField inputgrado;
	private JTextField inputtelefono;
	private JTextField inputdireccion;
	private JTextField inputnacionalidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BD window = new BD();
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
	public BD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 620, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		inputnombre = new JTextField();
		inputnombre.setBounds(132, 28, 359, 20);
		frame.getContentPane().add(inputnombre);
		inputnombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(28, 31, 71, 14);
		frame.getContentPane().add(lblNombre);
		
		inputmatricula = new JTextField();
		inputmatricula.setBounds(132, 59, 359, 20);
		frame.getContentPane().add(inputmatricula);
		inputmatricula.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(28, 65, 71, 14);
		frame.getContentPane().add(lblMatricula);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.setBounds(128, 245, 89, 23);
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/universidad","root","");
			
					if(conexion != null) {
						Statement st = conexion.createStatement();
						lblresp.setText("Conexion exitosa");
					}else {
						System.out.println("Conexion fallida");
					}
				}
				
					catch (SQLException e) {e.printStackTrace();}
					catch (ClassNotFoundException e) {e.printStackTrace(); }
					catch (Exception e) {e.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnConectar);
		
		lblresp = new JLabel("...");
		lblresp.setBounds(28, 313, 496, 125);
		frame.getContentPane().add(lblresp);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(227, 245, 89, 23);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
					
					Statement statement = conexion.createStatement();
					
					if(conexion != null) {
						String nombre = inputnombre.getText();
						int matricula = Integer.parseInt( inputmatricula.getText() );
						
						int grado = Integer.parseInt( inputgrado.getText() );
						String telefono = inputtelefono.getText();
						
						String direccion = inputdireccion.getText();
						String nacionalidad = inputnacionalidad.getText();
						
						//if(nombre != null && matricula != null && grado != null && telefono != null && direccion != null && nacionalidad != null)
						((java.sql.Statement)statement).executeUpdate("Insert into alumno(nombre,matricula,grado,telefono,direccion,nacionalidad) values('"+nombre+"','"+matricula+"','"+grado+"','"+telefono+"','"+direccion+"','"+nacionalidad+"')");
						conexion.close();
						
						inputnombre.setText("");
						inputmatricula.setText("");
						inputgrado.setText("");
						inputtelefono.setText("");
						inputdireccion.setText("");
						inputnacionalidad.setText("");
	
						lblresp.setText("Alumno registrado");			
					}else {
						lblresp.setText("No hay conexion con la base de datos");
					}
					
				} catch(ClassNotFoundException o) {
					// TODO Auto-generated catch block
					o.printStackTrace();
				} catch (SQLException l) {
					// TODO Auto-generated catch block
					l.printStackTrace();					
				}
			}
		});
		frame.getContentPane().add(btnAgregar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(326, 245, 89, 23);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(inputmatricula.getText());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
					Statement statement = conexion.createStatement();
					ResultSet resultSet = statement.executeQuery("Select nombre,grado from alumno where matricula='"+id+"';");
					
					if(resultSet.next() ==  true) {
						lblresp.setText("Se ha encontrado a: "+resultSet.getString("nombre")+", grado actual: "+resultSet.getString("grado"));
					}
					
					conexion.close();
					inputmatricula.setText("");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(inputmatricula.getText());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
					Statement statement = conexion.createStatement();

					String query = "Delete from alumno where matricula ="+id;
					statement.executeUpdate(query);
					
					conexion.close();
					inputmatricula.setText("");
					lblresp.setText("Alumno borrado");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBorrar.setBounds(435, 245, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		JLabel lblGrado = new JLabel("Grado");
		lblGrado.setBounds(28, 90, 46, 14);
		frame.getContentPane().add(lblGrado);
		
		inputgrado = new JTextField();
		inputgrado.setBounds(131, 87, 360, 20);
		frame.getContentPane().add(inputgrado);
		inputgrado.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(28, 118, 94, 14);
		frame.getContentPane().add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(28, 146, 94, 14);
		frame.getContentPane().add(lblDireccion);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(28, 174, 94, 14);
		frame.getContentPane().add(lblNacionalidad);
		
		inputtelefono = new JTextField();
		inputtelefono.setBounds(131, 115, 360, 20);
		frame.getContentPane().add(inputtelefono);
		inputtelefono.setColumns(10);
		
		inputdireccion = new JTextField();
		inputdireccion.setBounds(132, 143, 359, 20);
		frame.getContentPane().add(inputdireccion);
		inputdireccion.setColumns(10);
		
		inputnacionalidad = new JTextField();
		inputnacionalidad.setBounds(132, 171, 359, 20);
		frame.getContentPane().add(inputnacionalidad);
		inputnacionalidad.setColumns(10);
	}
}
