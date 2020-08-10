package ponggame;

import processing.core.PApplet;

public class Ponggame extends PApplet {

	public static final int HEIGHT = 400;
	public static final int WIDTH = 600;

	private Ball ellipse;
	private Schlaeger schlaeger1;
	private Schlaeger schlaeger2;

	public static void main(String[] args) {
		PApplet.main("ponggame.Ponggame");
	}

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		schlaeger1 = new Schlaeger(0.0f, 0.0f, 70.0f,true);
		schlaeger2 = new Schlaeger(WIDTH-Schlaeger.WIDTH, 330, 70,false);
		ellipse = new Ball(20, 200, 20, schlaeger1, schlaeger2);
	}
	
	@Override
	public void draw() {

		background(0);

		schlaeger1.draw(this);
		schlaeger2.draw(this);
		ellipse.draw(this);
	}
	public void keyPressed() {
		if (keyCode == UP) {
			
			schlaeger1.moveUP();
			schlaeger2.moveUP();
		}
		
		else if (keyCode == DOWN ) {
			
			schlaeger1.moveDown();
			schlaeger2.moveDown();
		}
	
	}
}
