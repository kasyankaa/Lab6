package ua.lviv.iot.rege;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
  private static String regularEx = "((\\d{4}\\s){3}\\d{4}|(\\d{16}))";

  public static void printText(String text) {
    final Pattern pattern = Pattern.compile(regularEx);
    final Matcher matcher = pattern.matcher(text);

    System.out.println("Sentences found: ");
    while (matcher.find()) {
      System.out.println(matcher.group(0));
    }
    System.out.println("Text without these sentences:");
    System.out.println(matcher.replaceAll(""));
  }
}