package com.chgrivas.dojo

import spock.lang.Specification


class AccountSpec extends Specification {

  Printer mockPrinter
  TransactionRepository mockTransactionRepository
  Account account

  def setup() {
    mockTransactionRepository = Mock(TransactionRepository)
    mockPrinter = Mock(Printer)
    account = new Account(mockTransactionRepository)
  }

  def "Print statemets prints the title in the beginning"() {
    when:
      account.printStatements(mockPrinter)
    then:
      1 * mockPrinter.println("date || credit || debit || balance")
  }

  def "A deposit of 1000 is persisted"() {
    when:
      account.deposit(1000)
    then:
      1 * mockTransactionRepository.save(1000)
  }
}
