import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args ){
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Hello, what is your name? ");
    name = keyboard.next();

    System.out.println("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("How much do you weigh, " + name + "?");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!");
    System.out.print("Finally, what's your income " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year! ");
    System.out.print("Well thanks for answering my rude questions, ");
    System.out.println(name + ".");
  }
}

/*
Can use either whole numbers, decimals, or letters in name - strings can be anything
Breaks with .5 and letters in age because it is declared as an integer
Breaks with letters in wt. and income, declared with double so must be numeric

*/
