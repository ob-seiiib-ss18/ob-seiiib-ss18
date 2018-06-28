package counter;

import java.util.Set;
import java.util.HashSet;

public class LoopCounter extends LtdCounter{

  public LoopCounter(final int limit) {
    super(limit);
  }

  @Override
  public LoopCounter step() {
    if (read() == getLimit()) {
      reset();
    } else {
      super.step();
    }
    return this;
  }

}
