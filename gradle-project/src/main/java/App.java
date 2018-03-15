class App {
  public static void main(String[] args) {
    Rational r = new Rational();
    r.numer = 1;
    r.denom = 9;
    r.print();

    r.extend(2);
    r.print();

    r.extend(5 * 9);
    r.print();

    r.setZero();
    r.print();

    r.set(5,6);
    r.print();

    r.extend((int)3.14);
    r.print();

    Rational s = new Rational();
    s.set(2,3);
    s.print();

    s.mult(r);
    r.print();
    s.print();
  }
}
