package ponggame;

import processing.core.PApplet;

public class Example extends PApplet {
	
	// Click on the image to give it focus,
	// and then press any key.

	public static void main(String[] args) {
		PApplet.main("ponggame.Example");
	}
	
	int value = 0;

	public void draw() {
	  fill(value);
	  rect(25, 25, 50, 50);
	}

	public void keyPressed() {
		if (keyCode == UP) {
			
			if (value == 0) {
				value = 255;
			} else {
				value = 0;
			}
		}
	}

}
