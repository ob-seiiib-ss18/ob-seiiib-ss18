class RatRange {

  private Rational lower;
  private Rational upper;

  RatRange(Rational lower, Rational upper) {
    this.lower = lower;
    this.upper = upper;
  }

  RatRange(RatRange that) {
    this.lower = new Rational(that.lower);
    this.upper = new Rational(that.upper);
  }


}
