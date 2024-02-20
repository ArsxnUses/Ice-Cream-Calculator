import java.util.Scanner; //Imports the scanner module

public class CalCalc {
    
    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(System.in); //creates a new keyboard to monitor
        
        final int CAL_SCOOP = 59;
        final int CAL_TSPOON = 60;
        int creamEaten;
        int fudgeEaten;
        int calEaten; 

        System.out.println("How many scoops of Bryer's French Vanilla ice cream have you had today?");
        creamEaten = keyboard.nextInt();
        
        System.out.println("How many tea spoons of Hershey's Fudge have you had today?");
        fudgeEaten = keyboard.nextInt();
        
        calEaten = (fudgeEaten * CAL_TSPOON) + (creamEaten * CAL_SCOOP);

        System.out.println("You have eaten " + creamEaten + " scoops of icecream");
        System.out.println("You topped those scoops off with " + fudgeEaten + " teaspoons of fudge");
        System.out.println("Resulting in the consumption of " + calEaten + " calories");
    }
}