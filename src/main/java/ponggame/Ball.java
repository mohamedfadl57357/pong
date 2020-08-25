package ponggame;

import java.util.Random;

public class Ball {

	private static final float SIZE = 20;

	private float pos_x;

	public float getPos_x() {
		return pos_x;
	}

	public void setPos_x(float pos_x) {
		this.pos_x = pos_x;
	}

	public float getPos_y() {
		return pos_y;
	}

	public void setPos_y(float pos_y) {
		this.pos_y = pos_y;
	}

	private float pos_y;
	private int x_speed;
	private int y_speed;
	private Schlaeger schlaegerLinks;
	private Schlaeger schlaegerRechts;
	private Random random = new Random();

	public Ball(Schlaeger schlaegerLinks, Schlaeger schlaegerRechts) {
		this.schlaegerLinks = schlaegerLinks;
		this.schlaegerRechts = schlaegerRechts;
		reset();
	}

	public void draw(Ponggame ponggame) {
		ponggame.ellipse(pos_x, getPosY(), SIZE, SIZE);
		calculateNextStep();
		collision();
		raender();
	}

	private void reset() {
		x_speed = 0;
		y_speed = 0;
		pos_x = Ponggame.WIDTH / 2;
		setPosY(Ponggame.HEIGHT / 2);
	}

	private void calculateNextStep() {
		pos_x += x_speed;
		pos_y += y_speed;
	}

	private void collision() {
		float distance = Schlaeger.WIDTH + SIZE / 2;
		if (pos_x >= Ponggame.WIDTH - distance && schlaegerRechts.hasSamePosition(this)) {
			x_speed *= -1;
		}
		if (pos_x <= distance && schlaegerLinks.hasSamePosition(this)) {
			x_speed *= -1;
		}
	}

	public void raender() {
		if (pos_y < 0 + SIZE / 2 || pos_y > Ponggame.HEIGHT - SIZE / 2) {
			y_speed *= -1;
		} else if (pos_x < 0) {
			Ponggame.leftScore++;
			reset();
		} else if (pos_x > Ponggame.WIDTH) {
			Ponggame.rightScore++;
			reset();
		}

	}

	public float getPosY() {
		return pos_y;
	}

	public void setPosY(float posY) {
		this.pos_y = posY;
	}

	void start() {
		if (x_speed == 0 && y_speed == 0) {
			x_speed = 2 + random.nextInt(3);
			y_speed = 1 + random.nextInt(2);
		}
	}

	public boolean isMovingLeft() {
		return x_speed < 0;
	}

	public boolean isOnLeftSide() {
		return getPos_x() < Ponggame.WIDTH / 2;
	}

	public boolean isAbove(Schlaeger schlaeger) {
		return getPos_y() < schlaeger.getMiddlePosition();
	}
}
