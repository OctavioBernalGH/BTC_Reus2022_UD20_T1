package com.dou.ud20.t1;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 03/05/2022
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Se crea la clase View y se definen los elementos a utilizar.
public class View {

	private JFrame frame;
	private JTextField txtAlto;
	private JTextField txtAncho;
	private JLabel lblNewLabel_1;
	private JButton Cerrar;

	public View() {
		initialize();
	}

	/**
	 * Se inicializa el contenido del JFrame, en este ejercicio se han definido dos
	 * areas de texto y un botón. Al introducir dos números enteros y pulsar el
	 * botón, cambiará el tamaño de la pantalla. También tiene un botón para cerrar
	 * la pantalla.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 177, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/**
		 * Botón que cambia el tamaño de la pantalla. Recibe como parámetro el ancho y
		 * el alto mediante un getText en los textField.
		 */
		JButton boton = new JButton("Cambiar Pantalla");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se captura el ancho y el alto.
				int alto = Integer.parseInt(txtAlto.getText());
				int ancho = Integer.parseInt(txtAncho.getText());
				// Se cambia el tamaño de la ventana.
				frame.setSize(alto, ancho);
			}
		});
		boton.setBounds(10, 135, 130, 23);
		frame.getContentPane().add(boton);

		txtAlto = new JTextField();
		txtAlto.setBounds(10, 36, 86, 20);
		frame.getContentPane().add(txtAlto);
		txtAlto.setColumns(10);

		JLabel lblNewLabel = new JLabel("Alto");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		txtAncho = new JTextField();
		txtAncho.setBounds(10, 90, 86, 20);
		frame.getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		lblNewLabel_1 = new JLabel("Ancho");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		/**
		 * Se cierra la ventana mediante la función dispose de la clase frame. Esta
		 * acción se realiza en el botón cerrar con el ActionListener.
		 */
		Cerrar = new JButton("Cerrar");
		Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		Cerrar.setBounds(33, 169, 89, 23);
		frame.getContentPane().add(Cerrar);

	}
}
