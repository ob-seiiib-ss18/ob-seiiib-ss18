class App {

  public static void main(String... args) {

    int[][] arr = new int[][] {{1, 2, 3}, {4, 5, 6, 8, 9}, {7}};

    int elem01 = arr[0][1];

    // System.out.println(sum(true, 1, 2, 3, 4));


    try {
      System.out.println(clip("hdjhdjh"));

    } catch (StringTooShortException e) {
      System.out.println("String zu kurz");

    } catch (NullPointerException e) {
      System.out.println("da war gar nix!");

    } catch (Exception e) {


    } finally{

      System.out.println("Ciao");

    }

  }

  static String clip(String s) throws StringTooShortException {

    if (s.length() < 2) {
      throw new StringTooShortException();
    }

    return s.substring(1, s.length() - 1);
  }

  static int sum(boolean b, int noForSum, int... numbers) {
    int sum = 0;
    for (int i : numbers) {
      sum += i;
    }
    return sum;
  }
}
