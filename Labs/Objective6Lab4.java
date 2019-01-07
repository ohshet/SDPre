public class Objective6Lab4 {
  public static void main( String[] args ) {
  int MyCount, MyTotal;

    MyCount = MyTotal = 0;

    while(MyCount <= 20) {
      MyTotal += MyCount;
      MyCount++;
    }
    System.out.println( MyTotal );
  }
}
