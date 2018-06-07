import java.util.List;

class App {

  public static void main(String[] args) {

    // Complex c = new Cartesian(3, 5);
    Complex c = new Polar(5.830951894845301, 1.0303768265243125);

    System.out.println(c.getReal());
    System.out.println(c.getImag());
    System.out.println(c.getDistance());
    System.out.println(c.getAngle());

  }
}
