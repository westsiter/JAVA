package com.pjatk.bank;

import jdk.dynalink.Operation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BankAccountManager {
    private List<BankAccount> accounts = new ArrayList<>();
    private HashMap<BankOperationType, List<BankAccountOperation>> operations;

    public void addAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public void registerOperation(BankAccountOperation operation){
        List<BankAccountOperation> ops = operations.get(operation.getType());
        if(ops == null){
            ops = new ArrayList<>();
            operations.put(operation.getType(),ops);
        }
        ops.add(operation);
    }
    public void performDeposits(){
        List<BankAccountOperation> ops = operations.get(BankOperationType.DEPOSIT);
        for (BankAccountOperation operation:ops){
            operation.getSourceAccount().add(operation.getMoney());
        }
    }
    public void performWithdrawals(){
        List<BankAccountOperation> ops = operations.get(BankOperationType.WITHDRAWAL);
        for (BankAccountOperation operation:ops){
            operation.getSourceAccount().subtract(operation.getMoney());
        }
    }
    public void performTransfers(){
        List<BankAccountOperation> ops = operations.get(BankOperationType.TRANSFER);
        for (BankAccountOperation operation:ops){
            if(operation.getTime().isAfter(LocalDateTime.now())){
                continue;
            }
            operation.getSourceAccount().subtract(operation.getMoney());
            operation.getTargetBankAccount().subtract(operation.getMoney());

        }
    }
}
