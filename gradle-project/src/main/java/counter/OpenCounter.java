


package counter;

public class OpenCounter {

  private int count = 0;
  protected void setCount(final int c) {
    count = c;
  }

  public OpenCounter() {
    super();
  }

  public OpenCounter step() {
    count++;
    return this;
  }

  public int read() {
    return count;
  }

  public void reset() {
    count = 0;
  }
}
