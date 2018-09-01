package com.chgrivas.dojo;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

  private final List<Transaction> transactionList;
  private final TimeResolver timeResolver;

  public TransactionRepository(TimeResolver timeResolver) {
    this.transactionList = new ArrayList<>();
    this.timeResolver = timeResolver;
  }

  public void save(int amount) {
    Transaction transaction = new Transaction(timeResolver.getDateTime(), amount);
    transactionList.add(transaction);
  }

  public List<Transaction> getAll() {
    return transactionList;
  }
}
