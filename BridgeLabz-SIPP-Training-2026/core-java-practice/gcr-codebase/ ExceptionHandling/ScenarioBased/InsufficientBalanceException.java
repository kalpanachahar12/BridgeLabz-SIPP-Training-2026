class InsufficientBalanceException extends Exception {
    double balance;

    InsufficientBalanceException(String msg, double balance) {
        super(msg);
        this.balance = balance;
    }
} 