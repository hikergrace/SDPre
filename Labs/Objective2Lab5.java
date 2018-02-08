public class Objective2Lab5 {
  public static void main(String[] args){
    double side1, side2;
    side1 = 10 * 10;
    side2 = 8 * 8;

    double result = side1 + side2;
    double hypotenuse = Math.sqrt(result);

    System.out.println("The hypotenuse of a triangle with sides 10.0 and 8.0 is " + hypotenuse);
  }
}
