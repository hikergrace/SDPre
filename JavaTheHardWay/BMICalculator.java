import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, feet, pound, height, inch;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    inch = keyboard.nextDouble();

    inches = feet * 12; //converts feet to inches
    height = inches + inch; //adds remaining inches

    m = height * 0.0254; //converts height in inches to meters


    System.out.print( "Your weight in pounds: ");
    pound = keyboard.nextDouble();


    kg = pound * .45; // converts pounds to kilograms


    bmi = kg / (m*m); //bmi calculation formula

    System.out.println("Your BMI is: " + bmi);
  }
}
