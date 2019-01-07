import java.util.Scanner;

public class Objective4Lab4 {
  public static void main( String[] args) {
    int MyNum;
    Scanner input = new Scanner(System.in);
    System.out.print( "Enter a number ");
    MyNum = input.nextInt();
    if(MyNum % 2 == 0) {
      System.out.println( MyNum + " is even" );
    }
    else {
      System.out.println( MyNum + " is odd" );
    }
  }
}
