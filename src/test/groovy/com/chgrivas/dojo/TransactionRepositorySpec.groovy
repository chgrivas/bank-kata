package com.chgrivas.dojo

import spock.lang.Specification


class TransactionRepositorySpec extends Specification {

  TimeResolver mockTimeResolver
  TransactionRepository transactionRepository

  def setup() {
    mockTimeResolver = Mock(TimeResolver)
    transactionRepository = new TransactionRepository(mockTimeResolver)
  }

  def "Getting all transactions of an empty repository"() {
    when:
      def all = transactionRepository.getAll()
    then:
      all.size() == 0
  }

  def "A deposit and a withdrawal can be saved"() {
    given:
      transactionRepository.save(100);
      transactionRepository.save(-400);
    when:
      def all = transactionRepository.getAll()
    then:
      all.size() == 2
  }
}
