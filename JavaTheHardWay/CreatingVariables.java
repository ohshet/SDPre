public class CreatingVariables {
  public static void main( String[] args ){
    int x, y, age, MyInt;
    double seconds, e, checking, MyDub;
    String firstName, lastName, title, MyStr1, MyStr2;

    x = 10;
    y = 400;
    age = 39;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    MyInt = 10;
    MyDub = 11;
    MyStr1 = "Most amplifiers only go to ";
    MyStr2 = "But this one goes to ";

    System.out.println( "The variable x contains " + x);
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( MyStr1 + MyInt );
    System.out.println( MyStr2 + MyDub );
  }
}
