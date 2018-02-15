import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double bmicat, m, kg, bmi, inches, feet, pound, height, inch;;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    inch = keyboard.nextDouble();

    inches = feet * 12; //converts feet to inches
    height = inches + inch; //adds remaining inches

    m = height * 0.0254; //converts height in inches to meters

    System.out.print( "Your weight in pounds: ");
    pound = keyboard.nextDouble();

    kg = pound * 0.45; // converts pounds to kilograms

    bmi = kg / (m*m); //bmi calculation formula

    System.out.println("Your BMI is: " + bmi);

  /*  System.out.print( "Enter your BMI: ");
    bmicat = keyboard.nextDouble();*/

    bmicat = bmi;
    
    System.out.println("BMI category: ");
    if ( bmicat < 15.0 ){
      System.out.println("very severely underweight");
    }
    else if ( bmicat <= 16.0 ){
      System.out.println("severely underweight");
    }
    else if (bmicat < 18.5 ){
      System.out.println("underweight");
    }
    else if (bmicat < 25.0 ){
      System.out.println("normal");
    }
    else if (bmicat < 30.0 ){
      System.out.println("overweight");
    }
    else if ( bmicat < 35.0 ){
      System.out.println("moderately obese");
    }
    else if (bmicat < 40.0 ){
      System.out.println("severely obese");
    }
    else {
      System.out.println("very severely/\"morbidly\" obese");
    }
  }
}
