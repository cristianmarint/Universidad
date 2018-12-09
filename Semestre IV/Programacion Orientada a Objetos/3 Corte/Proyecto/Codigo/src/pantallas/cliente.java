package pantallas;

import pantallas.inicio;

import java.nio.file.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Image;
import net.proteanit.sql.DbUtils;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.ScrollPane;



public class cliente {
	

	private static final String Lista_Artista = null;
	JFrame cliente;
	private Label label_frase;
	private JTable Table_Artistas;
	private JScrollPane scrollPane_Genero;
	private JTable Table_Generos;
	private JTable Table_Disqueras;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cliente window = new cliente(null,null,null,null);
					window.cliente.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cliente(String id_genero, String id_usuario, String id_cancion,String id_artista) {
		initialize(id_genero,id_usuario,id_cancion,id_artista);
	}
	public static int id;
	private JTable Table_Canciones;
	private JTable Table_Canciones1;
	
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id_genero,String id_usuario,String id_cancion,String id_artista) {
		cliente = new JFrame();
		cliente.setResizable(false);
		cliente.setTitle("Inicio");
		cliente.setBounds(100, 100, 1042, 721);
		cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cliente.getContentPane().setBackground(new Color(255, 255, 255));
		
		String rutaIMG="imagenes/";
		//Inicio
				ImageIcon fot = new ImageIcon(rutaIMG+"Yatra.jpg");
				ImageIcon foto = new ImageIcon(rutaIMG+"Maroon5.jpg");
				ImageIcon foto2 = new ImageIcon(rutaIMG+"Cepeda.png");
				ImageIcon foto3 = new ImageIcon(rutaIMG+"Musica.png");
				ImageIcon foto4 = new ImageIcon(rutaIMG+"Artistas.png");
		//Imagenes Musica
				ImageIcon foto5 = new ImageIcon(rutaIMG+"Guitarra.jpg");
		//Imagenes Artistas
				ImageIcon foto6 = new ImageIcon(rutaIMG+"cantantes.jpg");
		//Imagenes Quienes Somos
				ImageIcon foto7 = new ImageIcon(rutaIMG+"Steven.jpeg");
				ImageIcon foto9 = new ImageIcon(rutaIMG+"Marin.jpg");
				ImageIcon foto10 = new ImageIcon(rutaIMG+"Yeison.jpg");
		//Imagenes Disquera
				ImageIcon foto8 = new ImageIcon(rutaIMG+"Disquera.png");
				
		
		//Programa -------------------------------------------------------------------------------------------------------
				
		//Artistas
		
		JPanel panelArtistas = new JPanel();
		panelArtistas.setBackground(Color.WHITE);
		panelArtistas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelArtistas.setVisible(true);
			}
		});
		panelArtistas.setBounds(0, 65, 1026, 616);
		cliente.getContentPane().add(panelArtistas);
		panelArtistas.setLayout(null);
		
		Label Titulo_Artistas = new Label("Artistas!!");
		Titulo_Artistas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Titulo_Artistas.setBounds(457, 34, 151, 22);
		panelArtistas.add(Titulo_Artistas);
		
		Label descripcion_artistas = new Label("Los artistas del momento!!");
		descripcion_artistas.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		descripcion_artistas.setBounds(61, 65, 323, 22);
		panelArtistas.add(descripcion_artistas);
		
		Panel Tabla_Artistas = new Panel();
		Tabla_Artistas.setBounds(61, 143, 466, 353);
		panelArtistas.add(Tabla_Artistas);
		Tabla_Artistas.setLayout(null);
		
		JScrollPane ScrollPanel_Artistas = new JScrollPane();
		ScrollPanel_Artistas.setBounds(0, 0, 466, 353);
		Tabla_Artistas.add(ScrollPanel_Artistas);
		
		Table_Artistas = new JTable();
		Table_Artistas.setEnabled(false);
		ScrollPanel_Artistas.setViewportView(Table_Artistas);
		
		JLabel lbl_Imagen_Artista = new JLabel("");
		lbl_Imagen_Artista.setBounds(626, 65, 355, 523);
		Icon icono6 = new ImageIcon(foto6.getImage().getScaledInstance(lbl_Imagen_Artista.getWidth(),lbl_Imagen_Artista.getHeight(),Image.SCALE_DEFAULT));
		lbl_Imagen_Artista.setIcon(icono6);
		panelArtistas.add(lbl_Imagen_Artista);
		//panelArtistas.setBackground(Color.RED);
		panelArtistas.setVisible(false);
		
		//Quienes somos
		
		JPanel panelQuienesSomos = new JPanel();
		panelQuienesSomos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelQuienesSomos.setVisible(true);
			}
		});
		panelQuienesSomos.setBounds(0, 65, 1026, 616);
		cliente.getContentPane().add(panelQuienesSomos);
		panelQuienesSomos.setLayout(null);
		
		Panel Steven = new Panel();
		Steven.setBackground(new Color(255, 215, 0));
		Steven.setBounds(57, 65, 247, 405);
		panelQuienesSomos.add(Steven);
		Steven.setLayout(null);
		
		JLabel QuienesSomos_Steven = new JLabel("");
		QuienesSomos_Steven.setBounds(10, 11, 227, 276);
		Icon icono7 = new ImageIcon(foto7.getImage().getScaledInstance(QuienesSomos_Steven.getWidth(),QuienesSomos_Steven.getHeight(),Image.SCALE_DEFAULT));
		QuienesSomos_Steven.setIcon(icono7);
		Steven.add(QuienesSomos_Steven);
		
		Label Nombre_Steven = new Label("Cristian Steven Gonzalez Arango");
		Nombre_Steven.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		Nombre_Steven.setAlignment(Label.CENTER);
		Nombre_Steven.setBounds(10, 293, 227, 22);
		Steven.add(Nombre_Steven);
		
		Panel Marin = new Panel();
		Marin.setBackground(new Color(30, 144, 255));
		Marin.setBounds(367, 65, 247, 405);
		panelQuienesSomos.add(Marin);
		Marin.setLayout(null);
		
		JLabel QuienesSomos_Marin = new JLabel("");
		QuienesSomos_Marin.setBounds(10, 11, 227, 276);
		Icon icono9 = new ImageIcon(foto9.getImage().getScaledInstance(QuienesSomos_Marin.getWidth(),QuienesSomos_Marin.getHeight(),Image.SCALE_DEFAULT));
		QuienesSomos_Marin.setIcon(icono9);
		Marin.add(QuienesSomos_Marin);
		
		Label Nombre_Marin = new Label("Cristian Alexander Marin Aguirre");
		Nombre_Marin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		Nombre_Marin.setAlignment(Label.CENTER);
		Nombre_Marin.setBounds(10, 293, 227, 22);
		Marin.add(Nombre_Marin);
		
		Panel Yeison = new Panel();
		Yeison.setBackground(new Color(178, 34, 34));
		Yeison.setBounds(663, 65, 247, 405);
		panelQuienesSomos.add(Yeison);
		Yeison.setLayout(null);
		
		JLabel QuienesSomos_Yeison = new JLabel("");
		QuienesSomos_Yeison.setBounds(10, 11, 227, 276);
		Icon icono10 = new ImageIcon(foto10.getImage().getScaledInstance(QuienesSomos_Yeison.getWidth(), QuienesSomos_Yeison.getHeight(), Image.SCALE_DEFAULT));
		QuienesSomos_Yeison.setIcon(icono10);
		Yeison.add(QuienesSomos_Yeison);
		
		Label Nombre_Yeison = new Label("Yeison Stiven Castro");
		Nombre_Yeison.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		Nombre_Yeison.setAlignment(Label.CENTER);
		Nombre_Yeison.setBounds(10, 292, 227, 22);
		Yeison.add(Nombre_Yeison);
		//panelQuienesSomos.setBackground(Color.RED);
		panelQuienesSomos.setVisible(false);
		
		
		
		//Generos
		
		JPanel panelGeneros = new JPanel();
		panelGeneros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelGeneros.setVisible(true);
			}
		});
		panelGeneros.setBounds(0, 65, 1264, 616);
		cliente.getContentPane().add(panelGeneros);
		panelGeneros.setLayout(null);
		
		Label Titulo_Generos = new Label("Generos");
		Titulo_Generos.setAlignment(Label.CENTER);
		Titulo_Generos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Titulo_Generos.setBounds(399, 46, 206, 22);
		panelGeneros.add(Titulo_Generos);
		
		Panel Tabla_Generos = new Panel();
		Tabla_Generos.setLayout(null);
		Tabla_Generos.setBounds(41, 133, 466, 353);
		panelGeneros.add(Tabla_Generos);
		
		JScrollPane scrollPanel_Generos = new JScrollPane();
		scrollPanel_Generos.setBounds(0, 0, 466, 353);
		Tabla_Generos.add(scrollPanel_Generos);
		
		Table_Generos = new JTable();
		Table_Generos.setEnabled(false);
		scrollPanel_Generos.setViewportView(Table_Generos);
		
		JLabel lbl_Imagen_Generos = new JLabel("");
		lbl_Imagen_Generos.setIcon(new ImageIcon(rutaIMG+"Genero.png"));
		lbl_Imagen_Generos.setBounds(548, 35, 440, 528);
		panelGeneros.add(lbl_Imagen_Generos);
		//panelGeneros.setBackground(Color.RED);
		panelGeneros.setVisible(false);
		
		
		//Disqueras
		
		JPanel panelDisqueras = new JPanel();
		panelDisqueras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelDisqueras.setVisible(true);
			}
		});
		panelDisqueras.setBounds(0, 66, 1026, 615);
		cliente.getContentPane().add(panelDisqueras);
		panelDisqueras.setLayout(null);
		
		Label Titulo_Disqueras = new Label("Disqueras");
		Titulo_Disqueras.setAlignment(Label.CENTER);
		Titulo_Disqueras.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Titulo_Disqueras.setBounds(361, 38, 222, 22);
		panelDisqueras.add(Titulo_Disqueras);
		
		Panel Tabla_Disqueras = new Panel();
		Tabla_Disqueras.setBounds(76, 144, 409, 413);
		panelDisqueras.add(Tabla_Disqueras);
		Tabla_Disqueras.setLayout(null);
		
		JScrollPane scrollPanel_Disqueras = new JScrollPane();
		scrollPanel_Disqueras.setBounds(0, 0, 407, 413);
		Tabla_Disqueras.add(scrollPanel_Disqueras);
		
		Table_Disqueras = new JTable();
		Table_Disqueras.setEnabled(false);
		scrollPanel_Disqueras.setViewportView(Table_Disqueras);
		
		JLabel lbl_Imagen_Disquera = new JLabel("");
		lbl_Imagen_Disquera.setBounds(598, 151, 378, 378);
		Icon icono8 = new ImageIcon(foto8.getImage().getScaledInstance(lbl_Imagen_Disquera.getWidth(),lbl_Imagen_Disquera.getHeight(),Image.SCALE_DEFAULT));
		lbl_Imagen_Disquera.setIcon(icono8);
		panelDisqueras.add(lbl_Imagen_Disquera);
		
		Label label = new Label("Steven Productions");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		label.setBounds(628, 98, 303, 22);
		panelDisqueras.add(label);
		//panelDisqueras.setBackground(Color.RED);
		panelDisqueras.setVisible(false);
		
		
		
		//Inicio
		JPanel panelInicio = new JPanel();
		panelInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelInicio.setVisible(true);
			}
		});
		panelInicio.setBounds(0, 65, 1026, 616);
		cliente.getContentPane().add(panelInicio);
		panelInicio.setLayout(null);
		
		Label Titulo = new Label("Bienvenido!!");
		Titulo.setBounds(371, 10, 180, 44);
		panelInicio.add(Titulo);
		Titulo.setAlignment(Label.CENTER);
		Titulo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		
		Label descripcion = new Label("La Mejor Musica del Momento solo la encontraras aqui !!");
		descripcion.setBounds(210, 71, 513, 32);
		panelInicio.add(descripcion);
		descripcion.setAlignment(Label.CENTER);
		descripcion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		
		Panel Musica_Del_momento = new Panel();
		Musica_Del_momento.setBounds(0, 130, 1026, 54);
		panelInicio.add(Musica_Del_momento);
		Musica_Del_momento.setBackground(new Color(192, 192, 192));
		Musica_Del_momento.setLayout(null);
		
		Label label_3 = new Label("Musica Del Momento !!");
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		label_3.setBounds(10, 10, 241, 22);
		Musica_Del_momento.add(label_3);
		
		JLabel Musica = new JLabel("New label");
		Musica.setBounds(981, 580, 35, 32);
		panelInicio.add(Musica);
		Musica.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		Icon icono3 = new ImageIcon(foto3.getImage().getScaledInstance(Musica.getWidth(),Musica.getHeight(),Image.SCALE_DEFAULT));
		Musica.setIcon(icono3);
		
		JLabel Maroon5 = new JLabel("New label");
		Maroon5.setBounds(406, 222, 155, 126);
		panelInicio.add(Maroon5);
		Icon icono1 = new ImageIcon(foto.getImage().getScaledInstance(Maroon5.getWidth(),Maroon5.getHeight(),Image.SCALE_DEFAULT));
		Maroon5.setIcon(icono1);
		
		JLabel Andres_Cepeda = new JLabel("New label");
		Andres_Cepeda.setBounds(711, 217, 166, 126);
		panelInicio.add(Andres_Cepeda);
		Icon icono2 = new ImageIcon(foto2.getImage().getScaledInstance(Andres_Cepeda.getWidth(),Andres_Cepeda.getHeight(),Image.SCALE_DEFAULT));
		Andres_Cepeda.setIcon(icono2);
		
		Label label_1 = new Label("Maroon 5 - Sugar");
		label_1.setBounds(394, 371, 195, 22);
		panelInicio.add(label_1);
		label_1.setAlignment(Label.CENTER);
		
		Label label_Sebastian;
		label_Sebastian = new Label("Sebastian Yatra - No Hay Nadie M\u00E1s");
		label_Sebastian.setBounds(96, 371, 203, 22);
		panelInicio.add(label_Sebastian);
		label_Sebastian.setAlignment(Label.CENTER);
		
		Label label_2 = new Label("Andres Cepeda - D\u00EDa Tras D\u00EDa");
		label_2.setBounds(707, 364, 220, 22);
		panelInicio.add(label_2);
		label_2.setAlignment(Label.CENTER);
		
		JLabel Yatra = new JLabel("");
		Yatra.setBounds(121, 222, 143, 126);
		panelInicio.add(Yatra);
		Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Yatra.getWidth(),Yatra.getHeight(),Image.SCALE_DEFAULT));
		Yatra.setIcon(icono);
		
		JLabel Ver_Artistas = new JLabel("Artistas");
		Ver_Artistas.setBounds(220, 406, 203, 193);
		panelInicio.add(Ver_Artistas);
		Ver_Artistas.setBackground(new Color(255, 255, 255));
		Ver_Artistas.setBorder(new LineBorder(new Color(230, 230, 230)));
		Ver_Artistas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelInicio.setVisible(false);
				panelArtistas.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Ver_Artistas.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Ver_Artistas.setBorder(new LineBorder(new Color(230, 230, 230), 1));
			}
		});
		Ver_Artistas.setHorizontalAlignment(SwingConstants.CENTER);
		Ver_Artistas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		Ver_Artistas.setForeground(new Color(0, 0, 0));
		
		JLabel Ver_Generos = new JLabel("Generos");
		Ver_Generos.setBounds(421, 405, 212, 193);
		panelInicio.add(Ver_Generos);
		Ver_Generos.setForeground(new Color(0, 0, 0));
		Ver_Generos.setBackground(new Color(255, 255, 255));
		Ver_Generos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelInicio.setVisible(false);
				panelGeneros.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Ver_Generos.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Ver_Generos.setBorder(new LineBorder(new Color(230, 230, 230), 1));
			}
		});
		Ver_Generos.setHorizontalAlignment(SwingConstants.CENTER);
		Ver_Generos.setBorder(new LineBorder(new Color(230, 230, 230)));
		Ver_Generos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		
		JLabel Ver_Disqueras = new JLabel("Disqueras");
		Ver_Disqueras.setBounds(632, 404, 203, 193);
		panelInicio.add(Ver_Disqueras);
		Ver_Disqueras.setForeground(new Color(0, 0, 0));
		Ver_Disqueras.setBackground(new Color(255, 255, 255));
		Ver_Disqueras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelInicio.setVisible(false);
				panelDisqueras.setVisible(true);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Ver_Disqueras.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Ver_Disqueras.setBorder(new LineBorder(new Color(230, 230, 230), 1));
			}
		});
		Ver_Disqueras.setHorizontalAlignment(SwingConstants.CENTER);
		Ver_Disqueras.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		Ver_Disqueras.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(0, 0, 46, 14);
		panelInicio.add(label_4);
		
		
		//Musica
		
		JPanel panelMusica = new JPanel();
		panelMusica.setBackground(new Color(255, 255, 255));
		panelMusica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelMusica.setVisible(true);
			}
		});
		panelMusica.setBounds(0, 66, 1026, 616);
		cliente.getContentPane().add(panelMusica);
		panelMusica.setLayout(null);
		
		JLabel Instrumento = new JLabel("");
		Instrumento.setBounds(580, 32, 75, 66);
		panelMusica.add(Instrumento);
		Icon icono5 = new ImageIcon(foto5.getImage().getScaledInstance(Instrumento.getWidth(),Instrumento.getHeight(),Image.SCALE_DEFAULT));
		Instrumento.setIcon(icono5);
				
		Label label_5 = new Label("Musica");
		label_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(352, 55, 233, 32);
		panelMusica.add(label_5);
		
		label_frase = new Label("Sin m\u00FAsica, la vida perder\u00EDa el sentido.  - F.Nietzsche");
		label_frase.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 15));
		label_frase.setBounds(10, 100, 435, 22);
		panelMusica.add(label_frase);
		
		Panel Tabla_Canciones = new Panel();
		Tabla_Canciones.setBounds(84, 146, 904, 460);
		panelMusica.add(Tabla_Canciones);
		Tabla_Canciones.setLayout(null);
		
		JScrollPane scrollPanel_Canciones = new JScrollPane();
		scrollPanel_Canciones.setBounds(0, 0, 904, 460);
		Tabla_Canciones.add(scrollPanel_Canciones);
		
		Table_Canciones1 = new JTable();
		Table_Canciones1.setEnabled(false);
		scrollPanel_Canciones.setViewportView(Table_Canciones1);
		
		
		
		// Menu-Bar
		cliente.getContentPane().setLayout(null);
		
		JPanel Head = new JPanel();
		Head.setBounds(0, 0, 1026, 66);
		Head.setLayout(null);
		Head.setBackground(new Color(58, 177, 155));
		cliente.getContentPane().add(Head);
		
		JLabel Ver_Inicio = new JLabel("Inicio");
		Ver_Inicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelMusica.setVisible(false);
				panelInicio.setVisible(true);
				panelQuienesSomos.setVisible(false);
				panelArtistas.setVisible(false);
				panelGeneros.setVisible(false);
				panelDisqueras.setVisible(false);

				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Ver_Inicio.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Ver_Inicio.setBorder(new LineBorder(new Color(58, 177, 155)));
			}
			
		});
		Ver_Inicio.setHorizontalAlignment(SwingConstants.CENTER);
		Ver_Inicio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Ver_Inicio.setBounds(522, 0, 105, 66);
		Head.add(Ver_Inicio);
		
		JLabel Ver_Musica = new JLabel("Musica");
		Ver_Musica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelMusica.setVisible(true);
				panelInicio.setVisible(false);
				panelQuienesSomos.setVisible(false);
				panelArtistas.setVisible(false);
				panelGeneros.setVisible(false);
				panelDisqueras.setVisible(false);
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Ver_Musica.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Ver_Musica.setBorder(new LineBorder(new Color(58, 177, 155)));
			}
		});
		Ver_Musica.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		Ver_Musica.setHorizontalAlignment(SwingConstants.CENTER);
		Ver_Musica.setBounds(633, 0, 105, 66);
		Head.add(Ver_Musica);
		
		JLabel Quienes_Somos = new JLabel("\u00BFQuienes Somos?");
		Quienes_Somos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelMusica.setVisible(false);
				panelInicio.setVisible(false);
				panelQuienesSomos.setVisible(true);
				panelArtistas.setVisible(false);
				panelGeneros.setVisible(false);
				panelDisqueras.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent arg0){
				Quienes_Somos.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Quienes_Somos.setBorder(new LineBorder(new Color(58, 177, 155)));
			}
		});
		Quienes_Somos.setHorizontalAlignment(SwingConstants.CENTER);
		Quienes_Somos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		Quienes_Somos.setBounds(737, 0, 174, 66);
		Head.add(Quienes_Somos);
		
		JLabel lb_lSalir = new JLabel("Ingresar");
		lb_lSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i=0;
				inicio window3 = new inicio();
				window3.inicio.setVisible(true);
				cliente.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lb_lSalir.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lb_lSalir.setBorder(new LineBorder(new Color(58, 177, 155)));
			}
		});
		lb_lSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lb_lSalir.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lb_lSalir.setBounds(908, 0, 118, 66);
		Head.add(lb_lSalir);
		//cliente.setBounds(100, 100, 1280, 720);
		cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			update_artistas();
			update_generos();
			update_disqueras();
			update_canciones();
		}catch (SQLException l) {l.printStackTrace();}
	}
	
	void update_artistas() throws SQLException{
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("select nombres_artista as Nombre from artista");
		Table_Artistas.setModel(DbUtils.resultSetToTableModel(resultSet));
		
	}
	
	
	void update_generos() throws SQLException{
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("select nombres_genero as Genero from genero");
		Table_Generos.setModel(DbUtils.resultSetToTableModel(resultSet));
	}
	
	void update_disqueras() throws SQLException{
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("select nombres_disquera as Disquera from disquera");
		Table_Disqueras.setModel(DbUtils.resultSetToTableModel(resultSet));
	}
	
	void update_canciones() throws SQLException{
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("			"
				+ "SELECT artista.nombres_artista AS Artista,cancion.nombres_cancion AS Cancion,inventario_cancion.Cantidad from usuario \r\n" + 
				"			INNER JOIN usuario_tienda ON usuario_tienda.id_usuario = usuario.id_usuario \r\n" + 
				"			INNER JOIN tienda ON tienda.id_tienda = usuario_tienda.id_usuario \r\n" + 
				"			INNER JOIN inventario_cancion ON inventario_cancion.id_tienda = usuario_tienda.id_tienda \r\n" + 
				"			INNER JOIN cancion ON cancion.id_cancion = inventario_cancion.id_cancion \r\n" + 
				"			INNER JOIN artista ON cancion.id_artista = artista.id_artista \r\n" + 
				"			WHERE usuario_tienda.id_tienda = 1\r\n" + 
				"			;"
				);
		Table_Canciones1.setModel(DbUtils.resultSetToTableModel(resultSet));
	}
	
	
	
}


