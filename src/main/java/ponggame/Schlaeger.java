package ponggame;

public class Schlaeger {

	public static final float WIDTH = 12.5f;

	private float pos_x;
	private float pos_y;
	private float h;
	private float y_speed = 10;

	public Schlaeger(float x, float y, float h_size, boolean left) {
		this.pos_x = x;
		this.pos_y = y;
		this.h = h_size;
	}

	public void draw(Ponggame ponggame) {
		ponggame.rect(pos_x, pos_y, WIDTH, h);
	}

	public void moveDown() {
		pos_y += y_speed;
		float pos_max = Ponggame.HEIGHT - this.h;
		if (pos_y > pos_max) {
			pos_y = pos_max;
		}

	}

	public void moveUP() {
		pos_y -= y_speed;
		if (pos_y < 0) {
			pos_y = 0;
		}
	}

	public boolean hasSamePosition(Ball ball) {
		if (ball.getPosY() > this.pos_y && ball.getPosY() < this.pos_y + this.h) {
			return true;
		}
		return false;
	}
}
