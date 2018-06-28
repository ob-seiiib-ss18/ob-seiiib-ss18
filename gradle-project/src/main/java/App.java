import counter.Counter;
import counter.LoopCounter;
import counter.MemCounter;
import counter.OpenCounter;
import java.util.List;

class App {

  public static void main(String[] args) {


    int[] myInts = new int[] {1, 2, 3, 4, 9, 10, 11};


    for (int i = 0 ; i < myInts.length ; i++ ) {
      System.out.print(myInts[i] + ", ");
    }

    for (int i: myInts) {
      System.out.print(i);
    }

    System.out.println();




  }
}
