class App {

  public static void main(String[] args) {

    Rational r = new Rational(10, 90); // 1/9

    Rational s = new Rational(r);

    Rational t = new Rational();

    Rational u = new Rational(5);

    r.print();
    s.print();

    System.out.println("Zähler von r: " + r.numer);
    System.out.println("Zähler von r: " + r.getNumer());

    r.print();
    s.print();

    int x = r.signum();


  }
}
