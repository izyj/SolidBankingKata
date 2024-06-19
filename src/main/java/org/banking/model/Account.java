package org.banking.model;

import org.banking.interfaces.IDeposit;
import org.banking.interfaces.IOperations;
import org.banking.interfaces.IPrintStatement;
import org.banking.interfaces.IWithdraw;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Account {

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

    public void deposit(int value){
        operations = depositService.proceed(value, operations);
    }

    public void withdraw(int value){
        operations = withdrawService.proceed(value, operations);
    }

    public String printStatement(){
        return printStatementService.printStatement(operations);
    }



}
