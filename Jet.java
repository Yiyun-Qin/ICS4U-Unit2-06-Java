/**
 * The 2-06 program with lesson 3
 * static means the variable is the same in every instance
 * while final means it can't be changed once it is assigned.
 *
 * @author  Mr. Coxall
 * @version 1.0
 * @since   2020-01-01
 */
public class Jet extends Airplane {

  private static final int MULTIPLIER = 2;

  public Jet() {
    super();
  }

  public void setSpeed(int speed) {
    super.setSpeed(speed * MULTIPLIER);
  }

  public void accelerate() {
    super.setSpeed(getSpeed() * 2);
  }
}
