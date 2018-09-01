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

  def "A deposit of 1000 is persisted"() {
    when:
      account.deposit(1000)
    then:
      1 * mockTransactionRepository.save(1000)
  }

  def "A withdraw of 1000 is persisted"() {
    when:
      account.withdraw(1000)
    then:
      1 * mockTransactionRepository.save(-1000)
  }

  def "A print statements gets the transaction and sends them to the printer"() {
    given:
      def allTransactionsList = []
    when:
      account.printStatements(mockPrinter)
    then:
      1 * mockTransactionRepository.getAll() >> allTransactionsList
      mockPrinter.print(allTransactionsList)
  }
}
