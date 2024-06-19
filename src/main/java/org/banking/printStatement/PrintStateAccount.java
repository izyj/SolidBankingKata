package org.banking.printStatement;

import org.banking.interfaces.IOperations;
import org.banking.interfaces.IPrintStatement;

import java.time.Instant;
import java.util.Map;
import java.util.Optional;

public class PrintStateAccount implements IPrintStatement {
    @Override
    public String printStatement(Map<Instant, IOperations> operations) {
        StringBuilder statement = new StringBuilder();
        statement.append("Date \t\t Amount \t\t Balance\r\n");
        operations.forEach((k,v)->{
            statement.append(k+"\t\t"+v.getOperationValue()+"\t\t"+v.getBalance()+"\r\n");
        });

        return statement.toString();
    }
}
