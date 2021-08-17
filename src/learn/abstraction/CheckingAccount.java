package learn.abstraction;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class CheckingAccount extends BankAccount {
    private int fee;

    public CheckingAccount(Person owner, String accountNumber, BigDecimal balance, String pin, int fee) {
        super(owner, accountNumber, balance, pin);
        this.fee = fee;
    }

    private void setBalance(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(0)) < 0) {
            this.balance = this.balance.add(amount);
        }

    }

    @Override
    public void deposit(BigDecimal balance) {
        super.deposit(balance);
    }


    //    private String accountNumber;
//    private BigDecimal balance;
//    private Person owner;
//    private String pin;
//
//    public CheckingAccount(String accountNumber, BigDecimal balance, Person owner, String pin) {
//        this.accountNumber = accountNumber;
//        deposit(balance);
//        this.balance = balance;
//        this.owner = owner;
//        this.pin = pin;
//    }
//
//    private void setBalance(BigDecimal balance){
//        this.balance=balance;
//    }
//    public void deposit(BigDecimal balance){
//        this.balance = this.balance.add(balance);
//
//
//    }
//    public void withdraw(){
//
//    }
//
//    public void setPin(String pin) {
//        pin = validatePin(pin);
//        this.pin = pin;
//    }
//
//    public static String validatePin(String pinInput) {
//        StringBuilder pin = new StringBuilder();
//        for (int i = 0; i < pinInput.length(); i++) {
//            char pinPart = pinInput.charAt(i);
//            if (!Character.isDigit(pinPart)) {
//                switch (Character.toLowerCase(pinPart)) {
//                    case 'a':
//                    case 'b':
//                    case 'c':
//                        pin.append('2');
//                    case 'd':
//                    case 'e':
//                    case 'f':
//                        pin.append('3');
//                    case 'g':
//                    case 'h':
//                    case 'i':
//                        pin.append('4');
//                    case 'j':
//                    case 'k':
//                    case 'l':
//                        pin.append('5');
//                    case 'm':
//                    case 'n':
//                    case 'o':
//                        pin.append('6');
//                    case 'p':
//                    case 'q':
//                    case 'r':
//                        pin.append('7');
//                    case 's':
//                    case 't':
//                    case 'u':
//                        pin.append('8');
//                    case 'v':
//                    case 'w':
//                    case 'x':
//                        pin.append('9');
//                    case 'y':
//                    case 'z':
//                    default:
//                        int chance = (int) Math.round(Math.random()+1);
//                        if(chance==0){
//                            pin.append('0');
//                        } else {
//                            pin.append('1');
//                        }
//                }
//            }
//        }
//        return pin.toString();
//    }
}
