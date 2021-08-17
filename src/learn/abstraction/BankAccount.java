package learn.abstraction;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    protected BigDecimal balance;
    private Person owner;
    private String pin;

    public BankAccount(Person owner, String accountNumber, BigDecimal balance, String pin) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal(0);
        deposit(balance);
        this.pin = validatePin(pin);
    }

    private void setBalance(BigDecimal amount) {
        this.balance = amount;

    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal depositAmount) {

        setBalance(balance.add(depositAmount));
        this.owner.pay(depositAmount);

    }

    public void withdraw(BigDecimal withdrawAmount) {
        this.balance = this.balance.add(withdrawAmount);

    }

    public void setPin(String pin) {
        pin = validatePin(pin);
        this.pin = pin;
    }

    public String getPin() { //for testing
        return pin;
    }

    public static String validatePin(String pinInput) {
        StringBuilder validPin = new StringBuilder();
        for (int i = 0; i < pinInput.length(); i++) {
            char pinPart = pinInput.charAt(i);
            if (!Character.isDigit(pinPart)) {
                switch (Character.toLowerCase(pinPart)) {
                    case 'a':
                    case 'b':
                        validPin.append('1');
                        break;
                    case 'c':
                    case 'd':
                    case 'e':
                        validPin.append('2');
                        break;
                    case 'f':
                    case 'g':
                    case 'h':
                        validPin.append('3');
                        break;
                    case 'i':
                    case 'j':
                    case 'k':
                        validPin.append('4');
                        break;
                    case 'l':
                    case 'm':
                    case 'n':
                        validPin.append('5');
                        break;
                    case 'o':
                    case 'p':
                    case 'q':
                        validPin.append('6');
                        break;
                    case 'r':
                    case 's':
                    case 't':
                        validPin.append('7');
                        break;
                    case 'u':
                    case 'v':
                    case 'w':
                        validPin.append('8');
                        break;
                    case 'x':
                    case 'y':
                    case 'z':
                        validPin.append('9');
                        break;
                    default:
                        int chance = (int) Math.round(Math.random() + 1);
                        if (chance == 0) {
                            validPin.append('0');
                        } else {
                            validPin.append('1');
                        }
                }
            }else {
                validPin.append(pinPart);
            }
        }
        return validPin.toString();
    }
}
