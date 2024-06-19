package org.banking.interfaces;

import java.time.Instant;
import java.util.Map;

public interface IWithdraw extends IOperations {

    public Map<Instant, IOperations> proceed(int value, Map<Instant,IOperations> operations);
}
