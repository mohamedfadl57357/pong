package ponggame;

public class Ball {

	private float pos_x;
	private float pos_y;
	private int x_speed = 3;
	private int y_speed = 0;
	private float size;
	private Schlaeger schlaegerLinks;
	private Schlaeger schlaegerRechts;

	public Ball(float x, float y, float size, Schlaeger schlaegerLinks, Schlaeger schlaegerRechts) {
		this.pos_x = x;
		this.setPosY(y);
		this.size = size;
		this.schlaegerLinks = schlaegerLinks;
		this.schlaegerRechts = schlaegerRechts;
	}

	public void draw(Ponggame ponggame) {
		ponggame.ellipse(pos_x, getPosY(), size, size);
		calculateNextStep();
		collision();
		rest();
	}

	private void rest() {
		if (pos_x < 0) {
			pos_x = Ponggame.WIDTH / 2;
			setPosY(Ponggame.HEIGHT / 2);
		}

	}

	private void calculateNextStep() {
		pos_x += x_speed;
		pos_y += y_speed;
	}

	private void collision() {
		float distance = Schlaeger.WIDTH + size/2;
		if (pos_x > Ponggame.WIDTH - distance) {
			x_speed *= -1;
		} 
		else if (pos_x < distance && schlaegerLinks.hasSamePosition(this)) {
			x_speed *= -1;
		}
	}

	public float getPosY() {
		return pos_y;
	}

	public void setPosY(float posY) {
		this.pos_y = posY;
	}

}
