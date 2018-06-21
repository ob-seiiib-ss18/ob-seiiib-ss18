import counter.LoopCounter;
import counter.LtdCounter;
import counter.MemCounter;
import counter.OpenCounter;

class App {

  public static void main(String[] args) {


   System.out.println( (new OpenCounter()).step().step().step().read());


    LtdCounter c = new LtdCounter(3);

    for (int i = 0; i < 10; i++) {
      c.step();
      System.out.printf("%d ", c.read());
    }

    System.out.println();

    LoopCounter l = new LoopCounter(3);

    for (int i = 0; i < 10; i++) {
      l.step();
      System.out.printf("%d ", l.read());
    }

    System.out.println();

    MemCounter m = new MemCounter();

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        m.mark();
      }
      if (i == 8) {
        m.recall();
      } else {
        m.step();
      }
      System.out.printf("%d ", m.read());
    }

    System.out.println();

  }
}
