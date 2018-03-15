class App {
  public static void main(String[] args) {
    Rational r = new Rational();
    r.numer = 1;
    r.denom = 9;
    r.print();



    Rational s = new Rational();
    s.set(2);

    s.print();

    s.mult(r);

    r.mult(s);

    r.print();
    s.print();
  }
}
