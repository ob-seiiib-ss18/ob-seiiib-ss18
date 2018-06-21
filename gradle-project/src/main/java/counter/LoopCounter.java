package counter;

import java.util.Set;
import java.util.HashSet;

class LoopCounter extends LtdCounter{


  Set<Integer> mySet = new HashSet<>();

  LoopCounter(final int limit) {
    super(limit);
  }

  @Override
  LoopCounter step() {
    if (read() == getLimit()) {
      reset();
    } else {
      super.step();
    }
    return this;
  }

}
