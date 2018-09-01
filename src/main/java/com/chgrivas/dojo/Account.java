package com.chgrivas.dojo;

public class Account {

  private final TransactionRepository transactionRepository;

  public Account(TransactionRepository transactionRepository) {
    this.transactionRepository = transactionRepository;
  }

  public void deposit(int amount) {
    transactionRepository.save(amount);
  }


  public void printStatements(Printer printer) {
    printer.println("date || credit || debit || balance");
  }
}
