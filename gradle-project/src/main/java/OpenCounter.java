class OpenCounter extends Object {

  private int count = 0;

  protected void setCount(final int c) {
    count = c;
  }

  void step() {
    count++;
  }

  int read() {
    return count;
  }

  void reset() {
    count = 0;
  }
}
