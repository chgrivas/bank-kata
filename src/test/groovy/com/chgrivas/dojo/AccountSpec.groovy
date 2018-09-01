package com.chgrivas.dojo

import spock.lang.Specification


class AccountSpec extends Specification {

  Printer mockPrinter
  Account account

  def setup() {
    mockPrinter = Mock(Printer)
    account = new Account()
  }

  def "Print statemets prints the title in the beginning"() {
    when:
      account.printStatements(mockPrinter)
    then:
      1 * mockPrinter.println("date || credit || debit || balance")
  }

  def "A deposit of 1000 can be handled"() {
    when:
      account.deposit(1000)
    then:
      noExceptionThrown()
  }
}
