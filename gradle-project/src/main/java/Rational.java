public class Rational {

  private static int count;

  static int getCount() {
    return count;
  }

  private final int numer;
  private final int denom;

  private final int serial;


  Rational(int n, int d) {
    numer = n;
    if (d == 0) {
      denom = 1;
    } else {
      this.denom = d;
    }
    count++;
    serial = count;
    System.out.println("Soeben " + count + "-ten Bruch erzeugt.");
  }

  Rational(final int numer) {
    this(numer, 1);
  }

  Rational(final Rational other) {
    this.numer = other.numer;
    this.denom = other.denom;
    count++;
    serial = count;

  }


  int getNumer() {
    return numer;
  }

  void print() {
    System.out.printf("%d/%d%n", numer, denom);
  }

  Rational mult(final Rational other) {
    return new Rational(this.numer * other.numer, this.denom * other.denom);
  }

  int signum() {

    int result = -1;

    if (numer * denom > 0) {
      result = +1;
    }
    if (numer == 0) {
      result = 0;
    }
    return result;


  }

}
