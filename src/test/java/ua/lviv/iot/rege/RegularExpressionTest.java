package ua.lviv.iot.rege;

import ua.lviv.iot.rege.RegularExpression;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class RegularExpressionTest {
  @Test
  public void test() {

    String yourText = "He-llo the-re stra-nger!This test deletes all sente-nces whe-re are mo-re than two words with - and with !So it won't de-le-te this!And won't de-le-te th-is!Will it de-le-t-e th-is!";
    InputStream input = new ByteArrayInputStream(yourText.getBytes());
    System.setIn(input);

    @SuppressWarnings("resource")
    Scanner myScanner = new Scanner(System.in);
    String text = myScanner.nextLine();
    System.out.println(text);
    RegularExpression.printText(text);
  }
}