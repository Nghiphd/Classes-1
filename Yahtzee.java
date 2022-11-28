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
        } else {
            die5.roll();
        }
    }
    public String summerize() {
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        int val4 = 0;
        int val5 = 0;
        int val6 = 0;
        val(1, val1);
        val(2, val2);
        val(3, val3);
        val(4, val4);
        val(5, val5);
        String vals = val1+" "+val2+" "+val3+" "+val4+" " +val5+" ";
        return(vals);        
        
    }
    public String toString() {
        return("Dice Values: " + die1.value + " " + die2.value + " " + die3.value + " " + die4.value + " " + die5.value); 
    }
    public void val(int val, int count) {
        if(die1.value == val) {
            count++;
        } 
        if(die2.value == val) {
            count++;
        } 
        if(die3.value == val) {
            count++;
        } 
        if(die4.value == val) {
            count++;
        } 
        if (die5.value == val) {
            count++;
        }
    }
}
