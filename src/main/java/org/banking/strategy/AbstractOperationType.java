package org.banking.strategy;

import org.banking.interfaces.IOperations;

import java.time.Instant;
import java.util.Map;

public abstract class AbstractOperationType {

    public abstract IOperations create(String name);
}
