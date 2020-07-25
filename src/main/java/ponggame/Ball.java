package ponggame;

public class Ball {
	
	private float pos_x;
	private float pos_y;
	private int x_speed = 3;
	private int y_speed = 0;
	private float size;
	
	public Ball(float x, float y, float size) {
		this.pos_x = x;
		this.pos_y = y;
		this.size = size;
	}

	public void draw(Ponggame ponggame) {
		ponggame.ellipse(pos_x, pos_y, size, size);
		calculateNextStep();
	}

	private void calculateNextStep() {
		pos_x = pos_x + x_speed;
		if (pos_x >= Ponggame.WIDTH) {
			x_speed = -3;
		}
	}

}
