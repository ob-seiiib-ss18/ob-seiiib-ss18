
class App {

  public static void main(String[] args) {

    OpenCounter c = new LtdCounter(3);

    for (int i = 0; i < 10; i++) {
      c.step();
      System.out.printf("%d ", c.read());
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
