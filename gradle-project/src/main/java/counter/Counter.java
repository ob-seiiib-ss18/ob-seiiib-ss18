package counter;

public abstract class Counter {

  private int count = 0;
  protected void setCount(final int c) {
    count = c;
  }

  public int read() {
    return count;
  }

  public void reset() {
    count = 0;
  }

  abstract Counter step();

}
