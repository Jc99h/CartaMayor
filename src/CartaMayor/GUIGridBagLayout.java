package CartaMayor;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used for ...
 * @autor Camilo Ordoñez 1827625-2711 juan.ordonez.hurtado@correounivalle.edu.co
 * @version @version v.1.0.0 date:10/12/2021
 */
public class GUIGridBagLayout extends JFrame {

	private static final String MENSAJE_INICIO= "Bienvenido a Carta Mayor \n"+
			"Oprime el boton Sacar Carta para iniciar el juego \n"+
			"Una ves ya saques carta, la maquina sacara otra carta \n"+
			"Se compara tu carta con la de la maquina \n"+
			"Ganara el que tenga la carta con mas valor numerico \n"+
			"En caso de empate, el criterio de desempate es: \n"+
			"Oros mayor que copas\n"+
			"Copas mayor que Espadas\n"+
			"Espadas mayor que Bastos\n";

	private Header headerProject;
	private JLabel cartaJugador, cartaMaquina;
	private JButton sacarCarta, ayuda, salir;
	private JPanel panelCartaJugador, panelCartaMaquina;
	private ImageIcon imagenCarta;
	private JTextArea mensajeSalida, resultadosCartas;
	private Escucha escucha;
	//private ModelCraps modelCraps;

	/**
	 * Constructor of GUI class
	 */
	public GUIGridBagLayout(){
		initGUI();

		//Default JFrame configuration
		this.setTitle("Carta Mayor");
		this.pack();
		this.setResizable(true);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * This method is used to set up the default JComponent Configuration,
	 * create Listener and control Objects used for the GUI class
	 */
	private void initGUI() {
		//Set up JFrame Container's Layout
		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		//Create Listener Object and Control Object
		//Set up JComponents
		headerProject = new Header("Mesa Juego Carta Mayor", Color.BLACK);
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.gridwidth=3;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		this.add(headerProject,constraints);

		ayuda = new JButton("?");
		//ayuda.addActionListener(escucha);
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.LINE_START;
		this.add(ayuda, constraints);

		salir = new JButton("Salir");
		//salir.addActionListener(escucha);
		constraints.gridx=2;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.LINE_END;
		this.add(salir, constraints);

		imagenCarta = new ImageIcon(getClass().getResource("/resources/cartaOculta.png"));
		cartaJugador = new JLabel(imagenCarta);
		cartaMaquina = new JLabel(imagenCarta);

		panelCartaJugador = new JPanel();
		panelCartaJugador.setPreferredSize(new Dimension(170,250));
		panelCartaJugador.setBorder(BorderFactory.createTitledBorder("Tu Carta Jugador"));
		panelCartaJugador.add(cartaJugador);
		constraints.gridx=0;
		constraints.gridy=2;
		constraints.gridwidth=1;
		constraints.fill=GridBagConstraints.BOTH;
		constraints.anchor=GridBagConstraints.CENTER;
		add(panelCartaJugador, constraints);

		panelCartaMaquina = new JPanel();
		panelCartaMaquina.setPreferredSize(new Dimension(170,250));
		panelCartaMaquina.setBorder(BorderFactory.createTitledBorder("Tu Carta Maquina"));
		panelCartaMaquina.add(cartaMaquina);
		constraints.gridx=1;
		constraints.gridy=2;
		constraints.gridwidth=1;
		constraints.fill=GridBagConstraints.BOTH;
		constraints.anchor=GridBagConstraints.CENTER;
		add(panelCartaMaquina, constraints);

		resultadosCartas = new JTextArea(5, 20);
		resultadosCartas.setBorder(BorderFactory.createTitledBorder("Resultados"));
		resultadosCartas.setText("Debes sacar una carta");
		resultadosCartas.setEditable(false);
		constraints.gridx=2;
		constraints.gridy=2;
		constraints.gridwidth=1;
		constraints.fill=GridBagConstraints.BOTH;
		constraints.anchor=GridBagConstraints.CENTER;
		add(resultadosCartas, constraints);

		sacarCarta = new JButton("Sacar Carta");
		//sacarCarta.addActionListener(escucha);
		constraints.gridx=1;
		constraints.gridy=3;
		constraints.gridwidth=1;
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.CENTER;
		add(sacarCarta, constraints);

		mensajeSalida = new JTextArea(4, 31);
		mensajeSalida.setText("Usa el boton (?) para ver las reglas del juego");
		mensajeSalida.setBorder(BorderFactory.createTitledBorder("Mensajes"));
		mensajeSalida.setEditable(false);
		constraints.gridx=0;
		constraints.gridy=4;
		constraints.gridwidth=3;
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.CENTER;
		add(mensajeSalida, constraints);

	}

	/**
	 * Main process of the Java program
	 * @param args Object used in order to send input data from command line when
	 *             the program is execute by console.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(() -> {
			GUIGridBagLayout miProjectGUI = new GUIGridBagLayout();
		});
	}

	/**
	 * inner class that extends an Adapter Class or implements Listeners used by GUI class
	 */
	private class Escucha
	{

	}
}