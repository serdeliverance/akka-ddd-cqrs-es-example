package com.github.j5ik2o.bank.domain.model

case class BankAccountId(value: Long) {
  require(value > 0)
}
