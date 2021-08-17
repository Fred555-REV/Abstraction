package learn.abstraction;

import java.math.BigDecimal;

public class Person {
    private String name;
    private BigDecimal cash;

    public Person(String name, BigDecimal cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCash() {
        return cash;
    }

    private void setCash(BigDecimal amount) {
        cash = amount;
    }

    public void pay(BigDecimal amount) {
            setCash(cash.subtract(amount));
    }

}
