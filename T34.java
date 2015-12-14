package tank;

public class T34 extends AbstractTank {

	public void move(Direction direction) throws Exception {
		super.move();
	}

	public T34(TankColor color, int maxSpeed, int crew) {
		super(color, maxSpeed, crew);

	}

}
