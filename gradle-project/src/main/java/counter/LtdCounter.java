package counter;

class LtdCounter extends OpenCounter {

  private final int limit;

  public LtdCounter(final int limit) {
    super();
    this.limit = limit;
  }

  public int getLimit() {
    return limit;
  }

  @Override
  public LtdCounter step() {
    if (read() < limit) {
      super.step();
    }
    return this;
  }
}
