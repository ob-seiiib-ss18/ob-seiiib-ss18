class Rational {
  int numer;
  int denom;

  void print() {
    System.out.printf("%d/%d%n", numer, denom);
  }

  void extend(final int f) {
    numer *= f;
    denom *= f;
  }

  void set(final int n, final int d) {
    numer = n;
    denom = d;
  }

  void set(double d) {
    numer = (int) d;
    denom = 1;
  }

  void set() {
    numer = 0;
    denom = 1;
  }

  void mult(final Rational that) {
    this.numer = this.numer * that.numer;
    denom *= that.denom;
  }
}
