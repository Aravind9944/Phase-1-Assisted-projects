
class Main {

  String languages;

  // constructor accepting single value
  Main(String lang) {
    languages = lang;
    System.out.println(languages + " Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Main obj1 = new Main("English");
    Main obj2 = new Main("Tamil");
    Main obj3 = new Main("Malayalam");
  }
}
