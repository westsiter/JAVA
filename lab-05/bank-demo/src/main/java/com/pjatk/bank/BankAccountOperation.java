package com.pjatk.bank;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccountOperation {
    private BankOperationType type;
    private BankAccount sourceAccount;
    private double money;
    private LocalDateTime operationTime;
    private BankAccount targetBankAccount;

    public BankAccountOperation(BankOperationType bankOperationType) {
        this.type = bankOperationType;
    }


    public void setSourceBankAccount(BankAccount bankAccount) {
        this.sourceAccount = bankAccount;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public void setDate(LocalDateTime operationTime){
        this.operationTime = operationTime;
    }
    public BankOperationType getType(){
        return type;
    }
    public void setTargetBankAccount(BankAccount bankAccount){
        this.targetBankAccount = bankAccount;
    }
    public double getMoney(){
        return money;
    }
    public BankAccount getSourceAccount(){
        return sourceAccount;
    }
    public BankAccount getTargetBankAccount(){
        return targetBankAccount;
    }
    public LocalDateTime getTime(){
        return operationTime;
    }

}
