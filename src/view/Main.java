package view;

import processing.core.PApplet;
import view.Main;
import controller.ControllerMain;

public class Main extends PApplet {

	ControllerMain controllerMain;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(600, 600);
	}

	public void setup() {
		controllerMain = new ControllerMain();
	}

	public void draw() {
		background(255);

		controllerMain.drawBalls();
	}
}

//Profe de antemano me disculpo, realmente después de muchos intentos no pude desarrollar efectivamente el parcial. Sin embargo no queria dejar la entrega en blanco así que te adjunto el análisis previo que hice para entender un poco la lógica del procedimiento.
