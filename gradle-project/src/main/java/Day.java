enum Day {
  Mon(false),
  Tue(false),
  Wed(false),
  Thu(false),
  Fri(false),
  Sat(true),
  Sun(true);


  private final boolean weekend;

  Day(boolean weekend) {
    this.weekend = weekend;
  }

  boolean isWeekend() {
    return weekend;
  }



}
