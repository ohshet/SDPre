public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    String even;
    while (counter <= 20) {
    if(counter % 2 == 0){
      even = "even";
    }
    else {
      even = "odd";
    }
      System.out.println( counter + " is " + even );
      counter++;
    }
  }
}
