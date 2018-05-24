import java.util.List;

class App {

  public static void main(String[] args) {

    List list = new List();


    Rational s = new Rational(5, 6);
    Rational r = s;
    Rational t = new Rational(5, 6);

    if (s.equals(list)) {
      //...
    }


    if (s.equals(r)) {
      System.out.println("s und r gleich");
    } else {
      System.out.println("s und r nicht gleich");
    }

    if (s.equals(t)) {
      System.out.println("s und t gleich");
    } else {
      System.out.println("s und t nicht gleich");
    }

    System.out.println(r.toString());

    System.out.println(r.hashCode());

    System.out.println(0x763d9750);


  }
}
