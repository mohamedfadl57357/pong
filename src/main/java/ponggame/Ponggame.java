package ponggame;

import processing.core.PApplet;

public class Ponggame extends PApplet {

	public static final int HEIGHT = 400;
	public static final int WIDTH = 600;
	private int x = 20;
	private int y = 20;
	private int x_speed = 3;
	private Ball ellipse;
	
	
	public static void main(String[] args) {
		PApplet.main("ponggame.Ponggame");
	}
	
	@Override
	public void settings() {	
		 size(WIDTH, HEIGHT);
	}
	
	@Override
	public void setup() {
		ellipse = new Ball(20, 20, 20);
	}
	
	@Override
	public void draw() {
		background(0);
		
		drawPlayerOne();
		drawPlayerTwo();
		
		ellipse.draw(this);
	}


	private void drawPlayerTwo() {
		rect(587.5f, 330 ,12.5f, 70);
	}

	private void drawPlayerOne() {
		rect(0, 0,12.5f, 70);
	}


}
