package com.wsb.junitdemo.exchange;

public class Exchange {

    private Float initialAmount;
    private Float amountWithRate;

    public Exchange(Float initialAmount, Float amountWithRate) {
        this.initialAmount = initialAmount;
        this.amountWithRate = amountWithRate;
    }

    public Float getInitialAmount() {
        return initialAmount;
    }

    public Float getAmountWithRate() {
        return amountWithRate;
    }
}
