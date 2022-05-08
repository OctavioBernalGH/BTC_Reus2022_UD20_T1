<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T01</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)

<p align="justify">En este ejercicio se creará una aplicación con interfaz gráfica en la cual se construirá una ventana con un título y marco con los controles básicos, es decir, restaurar, maximizar y cerrar. Al pulsar sobre el botón cerrar se deberá cerrar completamente la aplicación. Esta ventana contendrá una etiqueta y el usuario debe poder cambiar su tamaño.</p>

En la siguiente imagen se puede observar de forma visual las diferentes funcionalidades.

![UD20-T1](https://user-images.githubusercontent.com/103035621/167310271-55fdfed6-2ad7-4682-94d1-44ec1a0fc808.png)

<p align="justify"> Para realizar este ejercicio se utilizará solamente una clase llamada View. En dicha clase se definirán los componentes que formarán la vista junto con su comportamiento utilizando los diferentes actionListeners. En este caso se utiliza solamente un ActionListener que escuchará los eventos de cerrar y cambiar pantalla.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase View.java</summary>
 
  <br>
 
  ```java
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


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
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

  ```
 </details>
