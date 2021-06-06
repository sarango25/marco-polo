package controller;

import model.World;
import processing.core.PApplet;
	
public class ControllerMain {
	private World world;
	private PApplet app;
	
	public ControllerMain() {
		world = new World();
	}
	
	public void drawBalls() {
		world.drawBalls();
	}
	

}
