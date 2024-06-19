package org.banking.deposit;

import org.banking.interfaces.IDeposit;
import org.banking.interfaces.IOperations;

import java.time.Instant;
import java.util.Map;

public class Deposit implements IDeposit {

    Integer balance,operationValue;

    public Deposit() {

    }

    public Deposit(Integer balance, Integer operationValue) {
        this.balance = balance;
        this.operationValue = operationValue;
    }

    @Override
    public Map<Instant, IOperations> proceed(int value, Map<Instant, IOperations> operations) {

        this.balance = operations.values().stream().map(v-> v.getOperationValue()).reduce(0,Integer::sum);
        this.operationValue = value;
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
