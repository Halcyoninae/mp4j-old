package main.advisors;

public abstract class JSONParser {
  private JSONParser() {

  }

  public static String parseElement(String element, String JSON) {

    String[] elements = JSON.split(",");
    for (String e : elements) {
      if (e.contains(element)) {
        String[] elementValue = e.split(":");

        if (elementValue.length == 2) {
          return elementValue[1].replace("\"", "").replace("}", "");
        }

      }
    }
    return null;
  }

}