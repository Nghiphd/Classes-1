
/**
 * Write a description of class Yahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yahtzee
{
    private int value;
    Die6 die1 = new Die6();
    Die6 die2 = new Die6();
    Die6 die3 = new Die6();
    Die6 die4 = new Die6();
    Die6 die5 = new Die6();
    public Yahtzee() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    public void roll(){
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    public void roll(int dieNumber) {
        if(dieNumber == 1) {
            die1.roll();
        } else if (dieNumber == 2) {
            die1.roll();
            die2.roll();
        } else if (dieNumber == 3) {
            die1.roll();
            die2.roll();
            die3.roll();
        } else if (dieNumber == 4) {
            die1.roll();
            die2.roll();
            die3.roll();
            die4.roll();
        } else {
            die1.roll();
            die2.roll();
            die3.roll();
            die4.roll();
            die5.roll();
        }
    }
    public String summerize() {
        return ("1-" + die1.value + "2-" + die2.value + "3-" + die3.value + "4-" + die4.value + "5-" + die5.value);
    }
}
