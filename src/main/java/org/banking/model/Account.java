package org.banking.model;

import org.banking.interfaces.*;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Account implements IAccount {

    private Map<Instant, IOperations> operations;
    private IWithdraw withdrawService;
    private IDeposit depositService;

    private IPrintStatement printStatementService;

    public Account(IWithdraw withdrawInstance, IDeposit depositInstance, IPrintStatement printStatementInstance) {
        operations = new HashMap<>();
        withdrawService = withdrawInstance;
        depositService = depositInstance;
        printStatementService = printStatementInstance;

    }

    public Account(Map<Instant, IOperations> operationsMap) {
        operations = operationsMap;
    }
    @Override
    public void deposit(int value){
        operations = depositService.proceed(value, operations);
    }
    @Override
    public void withdraw(int value){
        operations = withdrawService.proceed(value, operations);
    }
    @Override
    public String printStatement(){
        return printStatementService.printStatement(operations);
    }



}
