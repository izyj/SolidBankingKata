package org.banking.interfaces;

import java.time.Instant;
import java.util.Map;

public interface IDeposit extends IOperations {

    public Map<Instant, IOperations> proceed(int value, Map<Instant,IOperations> operations);
}
