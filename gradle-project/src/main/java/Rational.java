class Rational {

  int numer = 0;
  int denom = 1;

  {
    // if...
    System.out.println("Initialisiere.");
  }

  Rational() {
    System.out.println("Erzeuge Bruch.");
  }

  Rational(int n, int d) {
    this();
    numer = n;
    if (d == 0) {
      denom = 1;
    } else {
      denom = d;
    }
  }

  Rational(final int numer) {
    this(numer, 1);
    System.out.println("Springe zu anderem Konstruktor");
  }

  Rational(final Rational other) {
    this();
    this.numer = other.numer;
    this.denom = other.denom;
  }


  int getNumer() {
    return numer;
  }


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

  int signum() {

    if (numer * denom > 0) {
      return +1;
    }
    if (numer == 0) {
      return 0;
    }
    return -1;

  }

}
