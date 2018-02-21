import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 0;
    String foods = "Apples, Bananas, Coconuts";

    while (selection != 3) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if (selection < 2) {
        System.out.println("Hello World");
      }

      else  {
        System.out.println(foods);
      }
    }

    System.out.println("Goodbye!");
    scanner.close();


  }
}
