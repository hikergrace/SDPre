import java.util.Scanner;

public class EnterPIN{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String passwd;
    int pin, entry;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("ENTER YOUR PASSWORD: ");
    passwd = keyboard.next();

    while(! passwd.equals("hello")){
      System.out.println("\nINCORRECT PASSWORD. PLEASE TRY AGAIN");
      System.out.println("\nENTER YOUR PASSWORD");
      passwd= keyboard.next();
    }

    System.out.println("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ){
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.println("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");

  }
}
