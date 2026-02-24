public class Account {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String accountNumber, String accountType, double balance) {
        setAccountNumber(accountNumber);
        setAccountType(accountType);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        this.accountNumber = accountNumber;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType.equals("Savings") || accountType.equals("Checking")) {
            this.accountType = accountType;
        } else {
            throw new IllegalArgumentException("Account type must be savings or checking");
        }
    }
        public double deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                return balance;
            } else {
                throw new IllegalArgumentException("Invalid amount");
            }
        }
        public double withdraw(double amount) {
            if (amount <= balance && amount > 0) {
                balance -= amount;
                return balance;
            } else {
                throw new IllegalArgumentException("Insufficient funds");
            }
        }
            public void displayAccountInfo(){
        System.out.println("Account Number: " + getAccountNumber() + " balance: " + getBalance() + " accountType: " + getAccountType());

            }

        }

