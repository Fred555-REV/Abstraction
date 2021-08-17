package learn.abstraction;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        Person freddy = new Person("Freddy", new BigDecimal("250.50"));
        System.out.println(freddy.getCash());
        BankAccount accountF = new BankAccount(freddy, "123456789", freddy.getCash().divide(new BigDecimal(2)), "abcd");
        System.out.println(freddy.getCash());
        System.out.println(accountF.getBalance());
        System.out.println("pin is " + accountF.getPin());

    }
}
