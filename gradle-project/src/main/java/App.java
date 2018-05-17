class App {

  public static void main(String[] args) {

    int i = 527364;

    String dayStr = "Hallo";

    Day day = Day.valueOf("Wed"); // == Day.Wed

    for (Day d : Day.values()) {

      System.out.println(d + ": " + d.isWeekend());
    }


  }

}
