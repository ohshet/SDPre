import java.util.Scanner;
public class Objective3Lab5 {
  public static void main(String [] args) {

  Scanner input = new Scanner(System.in);

  Double MyNum1, MyNum2;

  System.out.println( "Please enter a number:" );
  MyNum1 = input.nextDouble();
  System.out.println( "Please enter another number:");
  MyNum2 = input.nextDouble();
  System.out.println( "The sum of " + MyNum1 + " + " + MyNum2 + " = " + (MyNum1 + MyNum2) );
  }
}
