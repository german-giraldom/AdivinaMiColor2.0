package paqPrincipal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;

public class Logica extends Interfaz {
	
	private int objrojo=0, objazul=0, objverde=0;
	private int rojo=0, azul=0, verde=0;
	
	Random all = new Random();
	 
	AccionBotones accionbotones = new AccionBotones();
	
	Color colorobjetivo = new Color(objrojo,objazul,objverde);
	Color colorcambiante = new Color(rojo, azul, verde);
	
	public Logica () {
		super ();
		GenerarColor();
		AddAccion();
	}

	public void AddAccion() {
		for (int i=0; i<6; i++) {
			ArrayBotones[i].addActionListener(accionbotones);
		}
	}
	
	public class AccionBotones implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == ArrayBotones[0]) { // boton rojo+
				if (rojo<=245) {
					rojo+=15;
					ActualizarColor();
					Comparador();
				}
			}else if (e.getSource() == ArrayBotones[1]) { // boton rojo-
				if (rojo>=15) {
					rojo-=15;
					ActualizarColor();
					Comparador();
				}
			}else if (e.getSource() == ArrayBotones[2]) { // boton azul+
				if (azul<=245) {
					azul+=15;
					ActualizarColor();
					Comparador();
				}
			}else if (e.getSource() == ArrayBotones[3]) { // boton azul-
				if (azul>=15) {
					azul-=15;
					ActualizarColor();
					Comparador();
				}
			}else if (e.getSource() == ArrayBotones[4]) { // boton verde+
				if (verde<=245) {
					verde+=15;
					ActualizarColor();
					Comparador();
				}
			}else if (e.getSource() == ArrayBotones[5]) { // boton verde-
				if (verde>=15) {
					verde-=15;
					ActualizarColor();
					Comparador();
				}
			}
		}
	}
	
	public void ActualizarColor () {
		colorcambiante = new Color(rojo, azul, verde);
		panelcolorcambiante.setBackground(colorcambiante);
	}
	
	public void GenerarColor () {
		objrojo=all.nextInt(17)*15;
		objazul=all.nextInt(17)*15;
		objverde=all.nextInt(17)*15;
		
		colorobjetivo = new Color(objrojo,objazul,objverde);
		panelcolorobjetivo.setBackground(colorobjetivo);
		
		rojo=all.nextInt(17)*15;
		azul=all.nextInt(17)*15;
		verde=all.nextInt(17)*15;
		
		colorcambiante = new Color(rojo, azul, verde);
		panelcolorcambiante.setBackground(colorcambiante);
	}
	
	public void Comparador () {
		if (rojo==objrojo && azul==objazul && verde==objverde) {
			JOptionPane.showMessageDialog(paneletiqueta, "ADIVINASTE!");
		}
	}
}
