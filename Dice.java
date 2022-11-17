
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
  Die6 die20 = new Die6();

  /**
   * Constructor to do an initial roll to set the first value
   */
  public Dice() {
    die6.roll();
    die20.roll();
  }
  public int rollAndGetValue() {
      die6.roll();
      die20.roll();
      int sum = die6.value + die20.value;
      return sum;
  }
}

