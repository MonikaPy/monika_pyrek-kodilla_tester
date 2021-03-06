package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;


    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];

    }

    public void add(CashMachine value) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = value;
        this.cashMachines = newTab;
    }

    public int getNumberCashMachines() {
        return size;
    }

    public int allBalance() {
        if (this.cashMachines.length == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].balances();
        }
        return sum;
    }

    public int allDepositsTransactions(){
        if (this.cashMachines.length == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].sumNumberOfDeposits();
        }
        return sum;

    }

    public int allCreditTransactions() {
        if (this.cashMachines.length == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].sumNumberOfCredits();
        }
        return sum;
    }

    public int averageDeposit() {
        if (this.cashMachines.length == 0)
            return 0;
int count=0;
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].sumOfDeposits();
            if (this.cashMachines[i].sumOfDeposits()>0){
                count++;
            }
        }
        return sum/count;
    }

    public int averageCredit() {
        if (this.cashMachines.length == 0)
            return 0;
int count=0;
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].sumOfCredits();
            if (this.cashMachines[i].sumOfCredits()<0){
                count++;
            }
        }
        return sum/count;
    }

}
