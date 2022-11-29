import java.util.Map;

/**
 * Write a description of class Yahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yahtzee
{
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
            die2.roll();
        } else if (dieNumber == 3) {
            die3.roll();
        } else if (dieNumber == 4) {
            die4.roll();
        } else if(dieNumber == 5) {
            die5.roll();
        }
    }
    public String summerize() {
        int sum1 = val(1);
        int sum2 = val(2);
        int sum3 = val(3);
        int sum4 = val(4);
        int sum5 = val(5);
        int sum6 = val(6);
        return("1-"+sum1+"; 2-"+sum2+"; 3-"+sum3+"; 4-"+sum4+"; 5-"+sum5+"; 6-"+sum6+";");        
        
    }
    public String toString() {
        return("Dice Values: " + die1.value + " " + die2.value + " " + die3.value + " " + die4.value + " " + die5.value); 
    }
    public int val(int val) {
        int count = 0;
        int[] array = new int[]{die1.value,die2.value,die3.value,die4.value,die5.value};
        for(int i : array) {
            if(i == val) {
                count++;
            }
        }
        return count;
    }
}
