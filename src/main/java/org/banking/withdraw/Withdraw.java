package org.banking.withdraw;

import org.banking.deposit.Deposit;
import org.banking.interfaces.IOperations;
import org.banking.interfaces.IWithdraw;

import java.time.Instant;
import java.util.Map;

public class Withdraw implements IWithdraw {

    private Integer balance, operationValue;


    public Withdraw() {
    }

    @Override
    public Map<Instant, IOperations> proceed(int value, Map<Instant, IOperations> operations) {

        this.operationValue = Math.negateExact(value);
        this.balance = operations.values().stream().map(v-> v.getOperationValue()).reduce(0,Integer::sum);
        this.balance -= value;
        operations.put(Instant.now(),this);
        return operations;
    }
    @Override
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    @Override
    public Integer getOperationValue() {
        return operationValue;
    }

    public void setOperationValue(Integer operationValue) {
        this.operationValue = operationValue;
    }

}
