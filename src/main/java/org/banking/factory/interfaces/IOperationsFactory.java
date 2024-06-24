package org.banking.factory.interfaces;

import org.banking.interfaces.IOperations;

import java.time.Instant;
import java.util.Map;

public interface IOperationsFactory {

    public IOperations create(String label, int value, Map<Instant,IOperations> operations);
}
