class App {

  public static void main(String[] args) {

    System.out.println("count = " + Rational.getCount());



    Rational a = new Rational(5, 7);
    System.out.println("count = " + Rational.getCount());
    Rational b = new Rational(3, 2);
    System.out.println("count = " + Rational.getCount());

    a.print();
    b.print();

    Rational c = b.mult(a);
    System.out.println("count = " + Rational.getCount());

    a.print();
    b.print();
    c.print();




  }
}
