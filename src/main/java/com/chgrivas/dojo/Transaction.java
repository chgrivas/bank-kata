package com.chgrivas.dojo;

import java.util.Date;

public class Transaction {
  private Date date;
  private int amount;

  public Transaction(Date date, int amount) {
    this.date = date;
    this.amount = amount;
  }
}
