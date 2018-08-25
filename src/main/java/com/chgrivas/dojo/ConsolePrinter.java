package com.chgrivas.dojo;

public class ConsolePrinter implements Printer {
  @Override
  public void println(String string) {
    System.out.println(string);
  }
}
