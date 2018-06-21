package counter;

public class MemCounter extends OpenCounter {

  private int memory;

  public void mark() {
    memory = read();
  }

  public void recall() {
    setCount(memory);
  }
}
