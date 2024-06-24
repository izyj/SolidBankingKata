package org.banking.factory;

import org.banking.deposit.Deposit;
import org.banking.interfaces.IOperations;
import org.banking.factory.interfaces.IOperationsFactory;
import org.banking.strategy.AbstractOperationType;
import org.banking.strategy.OperationType;
import org.banking.withdraw.Withdraw;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public class OperationsFactory implements IOperationsFactory {


    private OperationType withdraw = new OperationType("WITHDRAW",(v)-> new Withdraw())
            , deposit = new OperationType("DEPOSIT",(v)-> new Deposit());

    private List<OperationType> types= List.of(withdraw,deposit);
    @Override
    public IOperations create(String label,int value, Map<Instant,IOperations> operations) {

       return  types.stream().filter(v->{return v.getLabel().equals(label);})
                .findAny()
                .map(typeOpe-> typeOpe.create( label))
        .orElseThrow();

    }
}
