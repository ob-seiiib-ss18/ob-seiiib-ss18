import java.util.Scanner;

class Ski {

  int price;

  // final String stringRepresentation;

  int cent;

  Scanner in;

  Ski(final int price) {
    this.price = price;
    int euro = price/100;
    cent = price%100;
    String priceString = "" + euro + "," + ( cent < 10 ? "0" : "") + cent;
  }

  void otherFun() {

    if (true) {
      // ...
    } else {
      // ...
    }

    // ...
  }

}
