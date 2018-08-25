package com.chgrivas.dojo

import spock.lang.Specification


class AcceptanceSpec extends Specification {

  Printer mockPrinter = Mock(Printer)
  Account account

  def setup() {
    account = new Account()
  }

  def "A combination of transactions gets printed correctly in the statements"() {
    when:
      account.printStatements(mockPrinter)
    then:
      1 * mockPrinter.println("date || credit || debit || balance")
      1 * mockPrinter.println("14/01/2012 || || 500.00 || 2500.00")
      1 * mockPrinter.println("13/01/2012 || 2000.00 || || 3000.00")
      1 * mockPrinter.println("10/01/2012 || 1000.00 || || 1000.00")
  }

}
