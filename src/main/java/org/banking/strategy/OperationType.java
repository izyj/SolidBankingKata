package org.banking.strategy;

import org.banking.interfaces.IOperations;

import java.time.Instant;
import java.util.Map;
import java.util.function.Function;

public class OperationType extends AbstractOperationType {

   private String label;

   private Function<String,IOperations> create;

    public OperationType (String label,Function<String,IOperations> create) {
        this.label = label;
        this.create = create;
    }

    public String type(){
       return  label;
   }
    @Override
    public IOperations create(String name) {

        return create.apply(name);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Function<String,IOperations> getCreate() {
        return create;
    }

    public void setCreate(Function<String,IOperations> create) {
        this.create = create;
    }


}
