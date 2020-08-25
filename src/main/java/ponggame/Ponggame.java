package ponggame;

import java.awt.event.KeyEvent;

import processing.core.PApplet;

public class Ponggame extends PApplet {
	
	// Constructor
	// Object use
	// Inheritance
	// Interfaces
	
	public static final int HEIGHT = 400;
	public static final int WIDTH = 600;

	private Ball ball;
	private Schlaeger schlaeger1;
	private Schlaeger schlaeger2;
	
	public static  int leftScore = 0;
	public static  int rightScore = 0;

	public static void main(String[] args) {
		PApplet.main("ponggame.Ponggame");
	}

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		schlaeger1 = new Schlaeger(0.0f, 0.0f, 70.0f , 3);
		schlaeger2 = new Schlaeger(WIDTH-Schlaeger.WIDTH, 330, 70 , 10);
		ball = new Ball( schlaeger1, schlaeger2 );
	}
	
	@Override
	public void draw() {
	
		background(0);
		
		schlaeger1.draw(this);
		schlaeger2.draw(this);
		ball.draw(this);
		schlaeger1.computerSchlaeger(ball);
//		textSize(32);
//		textAlign(CENTER);
//		text( rightScore, 400 , 50); 
//		text( leftScore , 200, 50);
	}
	 void score() {
		 
	 }
	
	public void keyPressed() {
		if (keyCode == UP) {
			
			//schlaeger1.moveUP();
			schlaeger2.moveUP();
		}
		
		else if (keyCode == DOWN ) {
			
			//schlaeger1.moveDown();
			schlaeger2.moveDown();
		}
		else if (keyCode == KeyEvent.VK_SPACE) {
			ball.start();
		}
	}
}
