package com.chgrivas.dojo;

import java.util.List;

public class ConsolePrinter implements Printer {
  @Override
  public void print(List<Transaction> transactionList) {
    System.out.println("");
  }
}
