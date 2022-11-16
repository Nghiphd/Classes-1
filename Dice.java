
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class Dice
{
  /**
   * Contains the current value of the die
   */
  Die6 die6 = new Die6();
  Die20 die20 = new Die20();

  /**
   * Constructor to do an initial roll to set the first value
   */
  public Dice() {
    die6.roll();
    die20.roll();
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return value;
  }

  /**
   * Roll the die! Generate random number 1 <= x <= n and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    this.value = (int)(Math.random() * n) + 1;
  }

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}

