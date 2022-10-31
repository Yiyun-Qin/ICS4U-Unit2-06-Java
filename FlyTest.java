/**
 * The 2-06 program with lesson 3.
 *
 * @author  Mr. Coxall
 * @version 1.0
 * @since   2020-01-01
 */ 
public class FlyTest {
  public static void main(String[] args) {
    Airplane biplane = new Airplane();
    biplane.setSpeed(212);
    System.out.println(biplane.getSpeed());
    Jet boeing = new Jet();
    boeing.setSpeed(422);
    /**
     * here is 844.
     */
    System.out.println(boeing.getSpeed());
    int x = 0;
    while (x < 4) {
      boeing.accelerate();
      /**
       * here is 844 * 2 = 1688.
       */
      System.out.println(boeing.getSpeed());
      if (boeing.getSpeed() > 5000) {
        boeing.setSpeed(boeing.getSpeed() * 2);
      } else {
        boeing.accelerate();
      }
      x++;
    }
    System.out.println(boeing.getSpeed());
  }
}
