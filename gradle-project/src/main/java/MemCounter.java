class MemCounter extends OpenCounter {

  private int memory;

  void mark() {
    memory = read();
  }

  void recall() {
    setCount(memory);
  }
}
