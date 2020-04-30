package ua.lviv.iot.rege;

import ua.lviv.iot.rege.RegularExpression;



import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegularExpressionTest {
  @Test
  public void test() {

    String yourText = "1111 1111 1111 1111";
    InputStream inputedString = new ByteArrayInputStream(yourText.getBytes());
    System.setIn(inputedString);

    @SuppressWarnings("resource")
    Scanner myScanner = new Scanner(System.in);
    String text = myScanner.nextLine();
    System.out.println(text);
    RegularExpression.printText(text);
  }
}