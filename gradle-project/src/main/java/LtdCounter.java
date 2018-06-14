class LtdCounter extends OpenCounter {

  private final int limit;

  LtdCounter(final int limit) {
    this.limit = limit;
  }

  int getLimit() {
    return limit;
  }

  @Override
  void step() {
    if (read() < limit) {
      setCount(read() + 1);
    }
  }
}
