package org.banking.interfaces;

import java.time.Instant;
import java.util.Map;

public interface IPrintStatement {

    public String printStatement(Map<Instant,IOperations> operations);

}
