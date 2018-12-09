package pantallas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.text.NumberFormatter;

import com.mysql.jdbc.ResultSetMetaData;

import net.proteanit.sql.DbUtils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class administrador {

	JFrame administrador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administrador window = new administrador("");
					window.administrador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public administrador(String id_usuario) {
		initialize(id_usuario);
	}

	/**
	 * Initialize the contents of the frame.
	 */
    // frame 
    static JFrame f; 
  
    // label to diaplay text 
    static JLabel l; 
    private JTable tableUsuario;
    private JTextField nuevoNombre;
    private JTextField nuevoUsuario;
    private JTextField nuevoContrasena;
    private JTextField idUsuario;
    private JTextField idPermiso;
    private JTable tableInventario;
    private JTable tableCancion;
    private JTextField txtCancion;
    private JTextField nuevoNombreTienda;
    public String nombreTiendaPrincipal="";
  
    // default constructor 
    void text() 
    { 
    } 
	private void initialize(String id_usuario) {
		administrador = new JFrame();
		administrador.setTitle("");
		administrador.getContentPane().setBackground(Color.WHITE);
		administrador.setResizable(false);
		administrador.setBounds(100, 100, 1280, 720);
		administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//paneles
		JPanel funciones = new JPanel();
		funciones.setBounds(0, 0, 1264, 681);
		JPanel panelGestionUsuarios    = new JPanel();
		panelGestionUsuarios.setBounds(0, 0, 1264, 681);
		JPanel panelGestionInventario = new JPanel();
		panelGestionInventario.setBounds(0, 0, 1264, 681);
		JPanel panelGestionTienda = new JPanel();
		panelGestionTienda.setBounds(0, 0, 1264, 681);
		
		
		
		//botones
		JButton btnImportarUsuario = new JButton("Importar datos");
		btnImportarUsuario.setToolTipText("Importar datos de un usuario seleccionado");
		JButton btnLimpiar = new JButton("Limpiar datos");
		btnLimpiar.setToolTipText("Limpiar los datos de un usuario seleccionado");
		JButton btnIngresarCancion = new JButton("Ingresar");
		btnIngresarCancion.setToolTipText("Ingresar una nueva cancion al inventario");
		JButton btnCancionInventarioActualizar = new JButton("Actualizar");
		JButton btnCancionInventarioEliminar = new JButton("Eliminar");
		
		
		JLabel nombreTienda = new JLabel("");

		
		
		
		
		//Hace que solo reciba numeros enteros.
	    NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setValueClass(Integer.class);
	    formatter.setMinimum(0);
	    formatter.setMaximum(Integer.MAX_VALUE);
	    formatter.setAllowsInvalid(false);
	    formatter.setCommitsOnValidEdit(true);
		administrador.getContentPane().setLayout(null);
		
		panelGestionTienda.setVisible(false);			
		panelGestionTienda.setBackground(new Color(244, 248, 247));		
		panelGestionTienda.setLayout(null);
		administrador.getContentPane().add(panelGestionTienda);
		
		JLabel lblRegresarTienda = new JLabel("Regresar");
		lblRegresarTienda.setBounds(10, 10, 85, 24);
		lblRegresarTienda.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblRegresarTienda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				funciones.setVisible(true);
				panelGestionUsuarios.setVisible(false);
				panelGestionInventario.setVisible(false);
				panelGestionTienda.setVisible(false);			
			}
		});
		lblRegresarTienda.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblRegresarTienda.setBounds(0, 0, 85, 24);
		panelGestionTienda.add(lblRegresarTienda);
		
		JLabel lblNombreActual = new JLabel("Nombre actual");
		lblNombreActual.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNombreActual.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreActual.setBounds(422, 129, 441, 32);
		panelGestionTienda.add(lblNombreActual);
		lblNombreActual.setEnabled(false);
		
		nuevoNombreTienda = new JTextField();
		nuevoNombreTienda.setFont(new Font("Roboto", Font.PLAIN, 15));
		nuevoNombreTienda.setBounds(507, 296, 292, 39);
		panelGestionTienda.add(nuevoNombreTienda);
		nuevoNombreTienda.setColumns(10);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int largo = nuevoNombreTienda.getText().length();
				if(largo == 0){
						System.out.println("Nombre nuevo para la tienda vacio");
				}else {
					try {
							actualizar_tienda(nuevoNombreTienda.getText());
							nuevoNombreTienda.setText("");
							
							Class.forName("com.mysql.jdbc.Driver");
							java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
							Statement statement = conexion.createStatement();
							if(conexion != null & id_usuario.length() != 0) {		
								ResultSet resultSet =statement.executeQuery("select nombre_tienda from tienda INNER JOIN usuario_tienda on usuario_tienda.id_usuario='"+id_usuario+"';");
								
								resultSet.next();
								ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
								nombreTiendaPrincipal=resultSet.getString(1).toUpperCase();
								nombreTienda.setText("Tienda:  "+nombreTiendaPrincipal);
								lblNombreActual.setText("Nombre actual: "+nombreTiendaPrincipal);
								conexion.close();						
							}
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		});
		btnCambiar.setFont(new Font("Roboto", Font.PLAIN, 15));
		btnCambiar.setBounds(551, 363, 200, 40);
		panelGestionTienda.add(btnCambiar);
		
		
		JFormattedTextField txtCantidad = new JFormattedTextField(formatter);
		administrador.getContentPane().add(panelGestionInventario);
		panelGestionInventario.setBackground(new Color(244, 248, 247));
		panelGestionInventario.setLayout(null);
		panelGestionInventario.setVisible(false);
		
		JScrollPane scrollPaneInventario = new JScrollPane();
		scrollPaneInventario.setToolTipText("Listado de canciones en inventario");
		scrollPaneInventario.setBounds(641, 72, 553, 321);
		panelGestionInventario.add(scrollPaneInventario);
		
		tableInventario = new JTable();
		tableInventario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int row = tableInventario.getSelectedRow();
				int column = tableInventario.getSelectedColumn();			
				String nombreCancion =  (String) tableInventario.getValueAt(row, 1);
				
				txtCancion.setText(nombreCancion);
				
				txtCantidad.setText("0");
				
				btnCancionInventarioActualizar.setEnabled(true);
				btnIngresarCancion.setEnabled(false);
				btnCancionInventarioEliminar.setEnabled(true);
				txtCantidad.setEditable(true);
			}
		});
		scrollPaneInventario.setViewportView(tableInventario);
		
		JLabel lblRegresarInventario = new JLabel("Regresar");
		lblRegresarInventario.setBounds(10, 10, 85, 24);
		panelGestionInventario.add(lblRegresarInventario);
		lblRegresarInventario.setFont(new Font("Roboto", Font.PLAIN, 15));
		
		JScrollPane scrollPaneCancion = new JScrollPane();
		scrollPaneCancion.setToolTipText("Listado de canciones");
		scrollPaneCancion.setBounds(98, 73, 287, 320);
		panelGestionInventario.add(scrollPaneCancion);
		
		
		tableCancion = new JTable();
		tableCancion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				int row = tableCancion.getSelectedRow();
				int column = tableCancion.getSelectedColumn();			
				String nombreCancion =  (String) tableCancion.getValueAt(row, 1);
				
				txtCancion.setText(nombreCancion);
				
				txtCantidad.setText("0");
				
				btnIngresarCancion.setEnabled(true);
				btnCancionInventarioActualizar.setEnabled(false);
				btnCancionInventarioEliminar.setEnabled(false);
				txtCantidad.setEditable(true);
			}
		});
		scrollPaneCancion.setViewportView(tableCancion);
		
		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventario.setFont(new Font("Roboto", Font.ITALIC, 11));
		lblInventario.setBounds(646, 55, 77, 24);
		panelGestionInventario.add(lblInventario);
		
		JLabel lblCanciones = new JLabel("Canciones");
		lblCanciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblCanciones.setFont(new Font("Roboto", Font.ITALIC, 11));
		lblCanciones.setBounds(98, 55, 77, 24);
		panelGestionInventario.add(lblCanciones);
		
		txtCancion = new JTextField();
		txtCancion.setEditable(false);
		txtCancion.setToolTipText("Nombre de la cancion seleccionada");
		txtCancion.setFont(new Font("Roboto", Font.PLAIN, 17));
		txtCancion.setHorizontalAlignment(SwingConstants.CENTER);
		txtCancion.setText("Cancion");
		txtCancion.setBounds(412, 119, 200, 50);
		panelGestionInventario.add(txtCancion);
		txtCancion.setColumns(10);
		
		
		btnIngresarCancion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
							
				int row = tableCancion.getSelectedRow();
				int column = tableCancion.getSelectedColumn();			
				
				int CancionIdTabla =  (int) tableCancion.getValueAt(row, 0);
				String CancionNombreTabla =  (String) tableCancion.getValueAt(row, 1);
				
				int cantidadCanciones = Integer.parseInt( txtCantidad.getText());

				
				try {
					insert_inventario(CancionIdTabla,CancionNombreTabla,cantidadCanciones );
					update_inventario();
					update_cancion();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				txtCancion.setText("");
				txtCantidad.setText("0");
				
				btnIngresarCancion.setEnabled(false);
				txtCancion.setEnabled(false);
				txtCantidad.setEditable(false);
			}
		});
		btnIngresarCancion.setEnabled(false);
		btnIngresarCancion.setBounds(139, 508, 200, 50);
		panelGestionInventario.add(btnIngresarCancion);
		
		btnCancionInventarioActualizar.setToolTipText("actualizar cantidad");
		btnCancionInventarioActualizar.setEnabled(false);
		btnCancionInventarioActualizar.setBounds(641, 508, 141, 50);
		btnCancionInventarioActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = tableInventario.getSelectedRow();
				int column = tableInventario.getSelectedColumn();			
				
				int cancionIdTableInventario =  (int) tableInventario.getValueAt(row, 0);
				int cantidadCanciones = Integer.parseInt( txtCantidad.getText() );
				try {
					actualizar_inventario(cancionIdTableInventario,cantidadCanciones);				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		panelGestionInventario.add(btnCancionInventarioActualizar);
		

		btnCancionInventarioEliminar.setToolTipText("Eliminar cancion de inventario");
		btnCancionInventarioEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = tableInventario.getSelectedRow();
				int column = tableInventario.getSelectedColumn();			
				
				int cancionIdTableInventario =  (int) tableInventario.getValueAt(row, 0);

				
				try {
					delete_inventario(cancionIdTableInventario);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCancionInventarioEliminar.setEnabled(false);
		btnCancionInventarioEliminar.setBounds(792, 508, 132, 50);
		panelGestionInventario.add(btnCancionInventarioEliminar);
		txtCantidad.setEditable(false);
		txtCantidad.setToolTipText("Ingrese un valor numerico que este dentro del rango de ID's");
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setText("");
		txtCantidad.setBounds(477, 201, 77, 50);
		panelGestionInventario.add(txtCantidad);
		try {
			update_inventario();
			update_cancion();
		}catch (SQLException l) {l.printStackTrace();}
						
						
		lblRegresarInventario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				funciones.setVisible(true);
				panelGestionUsuarios.setVisible(false);
				panelGestionInventario.setVisible(false);
				panelGestionTienda.setVisible(false);
			}
		});
		
		
		
		
		
		funciones.setBackground(new Color(244, 248, 247));
		funciones.setForeground(Color.GREEN);
		administrador.getContentPane().add(funciones);
		funciones.setLayout(null);
		
		
		
		nombreTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		nombreTienda.setForeground(new Color(58,177,155));
		nombreTienda.setHorizontalAlignment(SwingConstants.CENTER);
		nombreTienda.setBounds(447, 11, 393, 69);
		funciones.add(nombreTienda);
		
		
		
		
		JLabel gestionCuentas = new JLabel("Gestionar usuarios");
		gestionCuentas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				funciones.setVisible(false);
				panelGestionUsuarios.setVisible(true);
				panelGestionInventario.setVisible(false);
				panelGestionTienda.setVisible(false);
			}
		});
		gestionCuentas.setBackground(Color.WHITE);
		gestionCuentas.setOpaque(true);
		gestionCuentas.setFont(new Font("Roboto", Font.BOLD, 20));
		gestionCuentas.setHorizontalAlignment(SwingConstants.CENTER);
		gestionCuentas.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		gestionCuentas.setBounds(258, 152, 258, 230);
		funciones.add(gestionCuentas);
		
		JLabel gestionInventario = new JLabel("Gestionar inventario");
		gestionInventario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				funciones.setVisible(false);
				panelGestionUsuarios.setVisible(false);
				panelGestionInventario.setVisible(true);
				panelGestionTienda.setVisible(false);
				
				try {
					update_inventario();
					update_cancion();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		gestionInventario.setBackground(Color.WHITE);
		gestionInventario.setOpaque(true);
		gestionInventario.setHorizontalAlignment(SwingConstants.CENTER);
		gestionInventario.setFont(new Font("Roboto", Font.BOLD, 20));
		gestionInventario.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		gestionInventario.setBounds(516, 152, 258, 230);
		funciones.add(gestionInventario);
		
		JLabel gestionTienda = new JLabel("Gestionar Tienda");
		gestionTienda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				funciones.setVisible(false);
				panelGestionUsuarios.setVisible(false);
				panelGestionInventario.setVisible(false);
				panelGestionTienda.setVisible(true);
			}
		});
		gestionTienda.setBackground(Color.WHITE);
		gestionTienda.setOpaque(true);
		gestionTienda.setHorizontalAlignment(SwingConstants.CENTER);
		gestionTienda.setFont(new Font("Roboto", Font.BOLD, 20));
		gestionTienda.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		gestionTienda.setBounds(774, 152, 258, 230);	
		funciones.add(gestionTienda);
		administrador.getContentPane().add(panelGestionUsuarios);
		
				panelGestionUsuarios.setBackground(new Color(244, 248, 247));
				panelGestionUsuarios.setLayout(null);
				
				JScrollPane scrollPaneUsuarios = new JScrollPane();
				scrollPaneUsuarios.setBounds(584, 28, 646, 598);
				panelGestionUsuarios.add(scrollPaneUsuarios);
				
				tableUsuario = new JTable();
				tableUsuario.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						btnImportarUsuario.setEnabled(true);
						btnLimpiar.setEnabled(true);
					}
				});
				scrollPaneUsuarios.setViewportView(tableUsuario);
				
				JLabel lblGestionarUsuario = new JLabel("Gestion de usuarios");
				lblGestionarUsuario.setBounds(47, 60, 256, 53);
				lblGestionarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
				lblGestionarUsuario.setFont(new Font("Roboto", Font.BOLD, 20));
				panelGestionUsuarios.add(lblGestionarUsuario);
				
				nuevoNombre = new JTextField();
				nuevoNombre.setText("Nombre completo");
				nuevoNombre.setBounds(106, 126, 345, 35);
				panelGestionUsuarios.add(nuevoNombre);
				nuevoNombre.setColumns(10);
				
				nuevoUsuario = new JTextField();
				nuevoUsuario.setText("Usuario");
				nuevoUsuario.setColumns(10);
				nuevoUsuario.setBounds(106, 172, 170, 35);
				panelGestionUsuarios.add(nuevoUsuario);
				
				nuevoContrasena = new JTextField();
				nuevoContrasena.setText("Contrase\u00F1a");
				nuevoContrasena.setColumns(10);
				nuevoContrasena.setBounds(286, 172, 165, 35);
				panelGestionUsuarios.add(nuevoContrasena);
				
				JLabel lblRegresarUsuarios = new JLabel("Regresar");
				lblRegresarUsuarios.setFont(new Font("Roboto", Font.PLAIN, 15));
				lblRegresarUsuarios.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						funciones.setVisible(true);
						panelGestionUsuarios.setVisible(false);
						panelGestionInventario.setVisible(false);
						panelGestionTienda.setVisible(false);
					}
				});
				lblRegresarUsuarios.setBounds(10, 11, 85, 24);			
				panelGestionUsuarios.add(lblRegresarUsuarios);
				
				idUsuario = new JTextField();
				idUsuario.setEnabled(false);
				idUsuario.setText("Id_usuario");
				idUsuario.setColumns(10);
				idUsuario.setBounds(106, 218, 170, 35);
				panelGestionUsuarios.add(idUsuario);
				
				idPermiso = new JTextField();
				idPermiso.setToolTipText("Use 1=Administrador y 2=Vendedor");
				idPermiso.setText("Permiso");
				idPermiso.setColumns(10);
				idPermiso.setBounds(286, 218, 165, 35);
				panelGestionUsuarios.add(idPermiso);
				
				JButton btnRegistrarUsuario = new JButton("Registrar");
				btnRegistrarUsuario.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						try {
							
							if(nuevoNombre.equals("Nombre completo") || nuevoUsuario.equals("Usuario") || nuevoContrasena.equals("Contrase\u00F1a") || idPermiso.equals("Permiso") ) {
								lblGestionarUsuario.setText("Ingrese el valor correspondiente en los campos de nombre,contraseña y permiso (1=administrador,2=vendedor) para registrar");
							}else {	
								insert_usuarios(nuevoNombre.getText(),nuevoUsuario.getText(),nuevoContrasena.getText(),idPermiso.getText() );
								
								nuevoContrasena.setText("Contrase\u00F1a");
								nuevoUsuario.setText("Usuario");
								nuevoNombre.setText("Nombre completo");
								idUsuario.setText("Id_suario");
								idPermiso.setText("Permiso");
							}
						}catch(SQLException ex) {Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);}
					}
				});
				btnRegistrarUsuario.setFont(new Font("Roboto", Font.PLAIN, 10));
				btnRegistrarUsuario.setBounds(106, 357, 170, 35);
				panelGestionUsuarios.add(btnRegistrarUsuario);
				
				JButton btnActualizar = new JButton("Actualizar");
				btnActualizar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						try {
							
							if(nuevoNombre.getText().equals("Nombre completo") || nuevoUsuario.getText().equals("Usuario") || nuevoContrasena.getText().equals("Contrase\u00F1a") || idPermiso.getText().equals("Permiso") ) {
								lblGestionarUsuario.setText("Ingrese el valor correspondiente en los campos de id_usuario,nombre,contraseña y permiso (1=administrador,2=vendedor) para actualizar");
							}else {	
								update_usuarios(idUsuario.getText(),nuevoNombre.getText(),nuevoUsuario.getText(),nuevoContrasena.getText(),idPermiso.getText());
								nuevoContrasena.setText("Contrase\u00F1a");
								nuevoUsuario.setText("Usuario");
								nuevoNombre.setText("Nombre completo");
								idUsuario.setText("Id_suario");
								idPermiso.setText("Permiso");
							}
						}catch(SQLException ex) {Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);}
					}
				});
				btnActualizar.setFont(new Font("Roboto", Font.PLAIN, 10));
				btnActualizar.setBounds(286, 357, 165, 35);
				panelGestionUsuarios.add(btnActualizar);
				
				JButton btnEliminar = new JButton("Eliminar");
				btnEliminar.setToolTipText("Eliminar un usuario");
				btnEliminar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						try {
							
							if(idUsuario.equals("Usuario") ) {
								lblGestionarUsuario.setText("Ingrese el valor correspondiente en el campo de ID para eliminar al usuario");
							}else {	
								int row = tableUsuario.getSelectedRow();
								int id_usuario =  (int) tableUsuario.getValueAt(row, 0);
								delete_usuarios(id_usuario);
								
								nuevoContrasena.setText("Contrase\u00F1a");
								nuevoUsuario.setText("Usuario");
								nuevoNombre.setText("Nombre completo");
								idUsuario.setText("Id_suario");
								idPermiso.setText("Permiso");
							}
						}catch(SQLException ex) {Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);}
					}
				});
				btnEliminar.setFont(new Font("Roboto", Font.PLAIN, 10));
				btnEliminar.setBounds(197, 422, 170, 35);
				panelGestionUsuarios.add(btnEliminar);
				//Carga la tabla de usuarios por primera vez
				try {
					update_usuarios();
				}catch (SQLException l) {l.printStackTrace();}
				
		panelGestionUsuarios.add(btnImportarUsuario);

		
		
		
		btnImportarUsuario.setEnabled(false);
		btnImportarUsuario.setBounds(324, 42, 127, 25);
		btnImportarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = tableUsuario.getSelectedRow();
				int column = tableUsuario.getSelectedColumn();
				
				int id =  (int) tableUsuario.getValueAt(row, 0);
				String nombre =  (String) tableUsuario.getValueAt(row, 1);
				String usuario =  (String) tableUsuario.getValueAt(row, 2);
				String permiso =  "nada";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
					Statement statement = conexion.createStatement();
					if(conexion != null) {		
					ResultSet resultSet =statement.executeQuery("select id_permiso from usuario where id_usuario='"+id+"';");
					resultSet.next();
					ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
					idPermiso.setText(resultSet.getString(1));
					conexion.close();						
					}
					
				} catch(ClassNotFoundException o) {o.printStackTrace();	} catch (SQLException l) {l.printStackTrace();}				
				
				nuevoNombre.setText(nombre);
				nuevoUsuario.setText(usuario);
				nuevoContrasena.setText("***");
				idUsuario.setText(String.valueOf(id));
			}
		});
		panelGestionUsuarios.add(btnImportarUsuario);
		
		
		btnLimpiar.setEnabled(false);
		btnLimpiar.setBounds(324, 72, 127, 25);
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				nuevoNombre.setText("Nombre completo");
				nuevoUsuario.setText("Usuario");
				nuevoContrasena.setText("Contraseña");
				idUsuario.setText("Id_usuario");
				idPermiso.setText("Permiso");
				btnLimpiar.setEnabled(false);
			}
		});
		panelGestionUsuarios.add(btnLimpiar);
		
		JLabel lblRegresarCliente = new JLabel("Salir");
		lblRegresarCliente.setForeground(Color.RED);
		lblRegresarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				inicio window3 = new inicio();
				window3.inicio.setVisible(true);
				administrador.dispose();
			}
		});
		lblRegresarCliente.setBounds(10, 10, 85, 24);
		lblRegresarCliente.setFont(new Font("Roboto", Font.PLAIN, 20));
		funciones.add(lblRegresarCliente);
				

				
				
				
//***********************TITULO DE LA TIENDA QUE ADMINISTRA EL USUARIO
		
try {
	Class.forName("com.mysql.jdbc.Driver");
	java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
	Statement statement = conexion.createStatement();
	if(conexion != null & id_usuario.length() != 0) {		
		ResultSet resultSet =statement.executeQuery("select nombre_tienda from tienda INNER JOIN usuario_tienda on usuario_tienda.id_usuario='"+id_usuario+"';");
		
		resultSet.next();
		ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
		nombreTiendaPrincipal=resultSet.getString(1).toUpperCase();
		nombreTienda.setText("Tienda:  "+nombreTiendaPrincipal);
		lblNombreActual.setText("Nombre actual: "+nombreTiendaPrincipal);
		conexion.close();						
	}
	
} catch(ClassNotFoundException o) {o.printStackTrace();	} catch (SQLException l) {l.printStackTrace();}


		
		
//***********************COLOCA EL TITULO A LA VENTANA Y VALIDA LOS PERMISOS DEL USUARIO
		int id_permiso=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			if(conexion != null & id_usuario.length() != 0) {		
				ResultSet resultSet =statement.executeQuery("select nombres,id_permiso from usuario where id_usuario='"+id_usuario+"';");
				
				resultSet.next();
				ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
		    	administrador.setTitle("Bienvenido "+resultSet.getString(1));
		    	id_permiso = Integer.parseInt(resultSet.getString(2));
		    	conexion.close();						
			}
			
		}catch(ClassNotFoundException o) {o.printStackTrace();	} catch (SQLException l) {l.printStackTrace();}
		
		
		if(id_permiso!=1) {												
			administrador.dispose();
			administrador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			administrador=null;
			inicio window = new inicio();
			window.inicio.setVisible(true);
			System.out.println("El usuario debe validarse primero para acceder a administrador.java");
		}
		
}
	
	
	
//***********************METODOS PARA LA GESTION DE USUARIOS
	void update_usuarios() throws SQLException {
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("select Id_usuario ,nombres AS Nombre,user AS Usuario, descripcion AS Tipo_de_usuario from usuario INNER JOIN permiso ON permiso.id_permiso=usuario.id_permiso ORDER BY Tipo_de_usuario;");
		tableUsuario.setModel(DbUtils.resultSetToTableModel(resultSet));
	}
	
	void insert_usuarios(String nombre,String usuario,String contrasena,String id_permiso) throws SQLException {
		boolean nuevo = true;
		
		int nColumnas = tableUsuario.getRowCount(),i=0;
		//System.out.println("****argu -> "+usuario);
		for(i=0;i<nColumnas;i++) {
			String usuarioTabla=(String) tableUsuario.getValueAt(i, 2);
			if( usuarioTabla.equals(usuario)) {
				System.out.println("Usuario repetido");
				i=nColumnas;
				nuevo=false;
			}
			//System.out.println("tabla -> "+usuarioTabla);
		}
		if(nuevo) {
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			String sql = "insert into usuario(nombres,user,pass,id_permiso) values('"+nombre+"','"+usuario+"','"+contrasena+"','"+id_permiso+"');";								
			int resultSet = statement.executeUpdate(sql);
			update_usuarios();
		}
	}

	void delete_usuarios(int id_usuario) throws SQLException {
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		String sql = "delete from usuario where id_usuario='"+id_usuario+"';";								
		int resultSet = statement.executeUpdate(sql);
		update_usuarios();
	}
	
	void update_usuarios(String id_Usuario,String nombre,String usuario,String contrasena,String id_Permiso) throws SQLException {
		
		boolean nuevo = true;
		
		int nColumnas = tableUsuario.getRowCount(),i=0;
		for(i=0;i<nColumnas;i++) {
			String usuarioTabla=(String) tableUsuario.getValueAt(i, 2);
			if( usuarioTabla.equals(usuario) ) {
				System.out.println("Usuario igual al anterior, no se actualizo");
				i=nColumnas;
				nuevo=false;
			}
			//System.out.println("tabla -> "+usuarioTabla);
		}
		if(nuevo) {
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			String sql = "UPDATE usuario SET nombres='"+nombre+"',user='"+usuario+"',pass='"+contrasena+"',id_permiso='"+id_Permiso+"' WHERE id_usuario='"+id_Usuario+"';";
			int resultSet = statement.executeUpdate(sql);
			update_usuarios();
		}
		

	}


	
	
	
//***********************METODOS PARA LA GESTION DE INVENTARIO
	void update_inventario() throws SQLException {
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("SELECT cancion.id_cancion,cancion.nombres_cancion AS Cancion,inventario_cancion.Cantidad from usuario INNER JOIN usuario_tienda ON usuario_tienda.id_usuario = usuario.id_usuario INNER JOIN tienda ON tienda.id_tienda = usuario_tienda.id_usuario INNER JOIN inventario_cancion ON inventario_cancion.id_tienda = usuario_tienda.id_tienda INNER JOIN cancion ON cancion.id_cancion = inventario_cancion.id_cancion WHERE usuario_tienda.id_tienda = 1;");
		tableInventario.setModel(DbUtils.resultSetToTableModel(resultSet));
	}
	void update_cancion() throws SQLException {
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("select id_cancion as ID,nombres_cancion AS Cancion from cancion;");
		//ResultSet resultSet =statement.executeQuery("select DISTINCT  cancion.id_cancion as ID, cancion.nombres_cancion AS Cancion from inventario_cancion INNER JOIN cancion ON cancion.id_cancion != inventario_cancion.id_cancion;");
		//ResultSet resultSet =statement.executeQuery("select cancion.id_cancion as ID, cancion.nombres_cancion AS Cancion from inventario_cancion INNER JOIN cancion ON cancion.id_cancion != inventario_cancion.id_cancion GROUP BY cancion.id_cancion;");
		tableCancion.setModel(DbUtils.resultSetToTableModel(resultSet));
		System.out.println("Lista de canciones actualizada");
	}
	
	void insert_inventario(int cancionIdTabla,String nombre,int cantidad) throws SQLException {
		boolean nuevo = true;
		
		int nColumnas = tableInventario.getRowCount(),i=0;
		if(cantidad<1) {i=nColumnas;nuevo=false;System.out.println("La cantidad debe de ser mayor a cero (0)");}
		for(i=0;i<nColumnas;i++) {
			int idCancionInventario = (int) tableInventario.getValueAt(i, 0);
			if( idCancionInventario==cancionIdTabla ) {
				System.out.println("Cancion repetida");
				i=nColumnas;
				nuevo=false;
			}
		}
		if(nuevo) {
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			String sql = "insert into inventario_cancion(id_cancion,id_tienda,cantidad) values('"+cancionIdTabla+"',1,'"+cantidad+"');";								
			int resultSet = statement.executeUpdate(sql);
			update_inventario();
			update_cancion();
			System.out.println("Cancion insertada");
		}
	}	
	
	
	
	void delete_inventario(int id_cancion) throws SQLException {
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		String sql = "delete from inventario_cancion where id_cancion='"+id_cancion+"';";								
		int resultSet = statement.executeUpdate(sql);
		System.out.println("Cancion eliminada");
		update_inventario();
		update_cancion();
	}

	void actualizar_inventario(int id_cancion,int cantidad) throws SQLException {
		
		boolean nuevo = true;
		
		
		int nColumnas = tableUsuario.getColumnCount(),i=0;
		for(i=0;i<nColumnas;i++) {
			int idCancionTabla=(int) tableInventario.getValueAt(i, 0);
			int cantidadTableInventario=(int) tableInventario.getValueAt(i, 2);
			if(id_cancion == idCancionTabla) {
				if( cantidad==cantidadTableInventario) {
					System.out.println("Cantidad igual a la anterior, no se actualizo");
					i=nColumnas;
					nuevo=false;
				}
			}
		}
		if(nuevo) {
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			String sql = "UPDATE inventario_cancion SET cantidad='"+cantidad+"' WHERE id_cancion='"+id_cancion+"';";
			int resultSet = statement.executeUpdate(sql);
			update_inventario();
			update_cancion();
			System.out.println("Cancion actualizada");
		}
		

	}
	
	
//***********************METODOS PARA LA GESTION DE TIENDA
	
	void actualizar_tienda(String nombre) throws SQLException {
		
		boolean nuevo = true;
		
		if(nombre.equals(nombreTiendaPrincipal)) {
				System.out.println("Nombre de la tienda igual al anterior, no se actualizo");
				nuevo=false;
		}
		if(nuevo) {
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			String sql = "UPDATE tienda SET nombre_tienda='"+nombre+"' WHERE id_tienda='1';";
			int resultSet = statement.executeUpdate(sql);
			update_inventario();
			update_cancion();
			System.out.println("Nombre actualizado");
		}
		

	}
	
	
}
