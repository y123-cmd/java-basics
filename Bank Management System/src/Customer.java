public class Customer extends Person {
    private String customerID;
    private final Account[] accounts;
    private int accountCount;



    public Customer( String customerID,String name, int age) {
        super(name, age);
        setCustomerID(customerID);
        this.accounts = new Account[5];
        this.accountCount = 0;

    }

    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        if (customerID == null || customerID.isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be empty");
        }
        this.customerID = customerID;
    }
    public int getAccountCount() {
        return accountCount;
    }
    public void setAccountCount(int accountCount) {
        this.accountCount = accountCount;
    }
    @Override
    public void displayRole(){
        System.out.println("customer using bank services");
    }

    public void addAccount(Account a) {
        if (accountCount < 5) {
            accounts[accountCount] = a;
            accountCount++;
        } else {
            throw new IllegalArgumentException("Customer already has enough accounts");
        }
    }
        public double calculateTotalBalance(){
        double total = 0;
        for(int i = 0; i < accountCount; i++) {
            total += accounts[i].getBalance();
        }
        return total;
        }

    }
