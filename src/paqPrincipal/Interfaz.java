package paqPrincipal;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame {
	
	JFrame ventana = new JFrame();
	
	JPanel panelprincipal = new JPanel();
	JPanel paneletiqueta = new JPanel();
	JPanel panelcolores = new JPanel();
	JPanel panelbotones = new JPanel();
	
	JPanel panelcolorobjetivo = new JPanel();
	JPanel panelcolorcambiante = new JPanel();
	
	Label etiqueta1 = new Label();
	
	Dimension tamañobotones = new Dimension(40,40);
	
	JButton ArrayBotones[] = new JButton[6];
	
	
	public Interfaz () {
		Ventana();
		Layout();
		Setpaneles();
		Etiqueta();
		Addpanelescolor();
		Addbotones();
	}
	
	public void Ventana () {
		ventana.setTitle("adivina mi color 2.0");
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(300, 220);
	}
	
	public void Layout () {
		panelprincipal.setLayout(new BorderLayout());
		ventana.add(panelprincipal);
	}
	
	public void Setpaneles () {
		paneletiqueta.setBackground(Color.LIGHT_GRAY);
		panelprincipal.add(paneletiqueta, BorderLayout.NORTH);
		
		panelcolores.setBackground(Color.GRAY);
		panelcolores.setLayout(new GridLayout(1, 2));
		panelprincipal.add(panelcolores, BorderLayout.CENTER);
		
		panelbotones.setBackground(Color.DARK_GRAY);
		panelbotones.setLayout(new GridLayout(1, 6));
		panelprincipal.add(panelbotones, BorderLayout.SOUTH);
	}
	
	public void Etiqueta () {
		etiqueta1.setText("ADIVINA MI COLOR");
		etiqueta1.setFont(new Font("arial", Font.CENTER_BASELINE, 15));
		etiqueta1.setAlignment(Label.CENTER);
		paneletiqueta.add(etiqueta1);
	}
	
	public void Addpanelescolor () {
		//panelcolorobjetivo.setBackground(Color.blue);
		panelcolores.add(panelcolorobjetivo);
		
		//panelcolorcambiante.setBackground(Color.red);
		panelcolores.add(panelcolorcambiante);
	}
	
	public void Addbotones () {
		
		boolean bandera = false;
		
		for (int i=0; i<6; i++) {
			ArrayBotones[i] = new JButton();
			if (bandera == false) {
				ArrayBotones[i].setText("+");
				bandera = true;
				
			}else if (bandera == true) {
				ArrayBotones[i].setText("-");
				bandera = false;
				
			}
			
			ArrayBotones[i].setFont(new Font(getName(), Font.BOLD, 15));
			
			switch (i) {
			case 0: ArrayBotones[i].setBackground(Color.red);
					ArrayBotones[i].setName("boton"+i);break;
			case 1: ArrayBotones[i].setBackground(Color.red);
					ArrayBotones[i].setName("boton"+i);break;
			
			case 2: ArrayBotones[i].setBackground(Color.blue);ArrayBotones[i].setName("boton"+i);break;
			case 3: ArrayBotones[i].setBackground(Color.blue);ArrayBotones[i].setName("boton"+i);break;
			
			case 4: ArrayBotones[i].setBackground(Color.green);ArrayBotones[i].setName("boton"+i);break;
			case 5: ArrayBotones[i].setBackground(Color.green);ArrayBotones[i].setName("boton"+i);break;
			}
			
			panelbotones.add(ArrayBotones[i]);
		}
	}
}
