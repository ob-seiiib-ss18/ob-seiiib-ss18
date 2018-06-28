


package counter;

public class OpenCounter extends Counter {


  public OpenCounter step() {
    setCount(read() + 1);
    return this;
  }


}
