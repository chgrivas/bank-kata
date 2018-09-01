package com.chgrivas.dojo

import spock.lang.Specification


class TransactionRepositorySpec extends Specification {

  TransactionRepository transactionRepository

  def setup() {
    transactionRepository = new TransactionRepository()
  }

  def "Getting all transactions of an empty repository"() {
    when:
      def all = transactionRepository.getAll()
    then:
      all.size() == 0
  }
}
