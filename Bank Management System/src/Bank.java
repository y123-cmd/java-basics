public class Bank {
    private int staffCount;
    private int customerCount;
    private BankStaff[] bankstaff;
    private Customer[] customer;

    public int getStaffCount() {
        return staffCount;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public BankStaff[] getBankstaff() {
        return bankstaff;
    }

    public Customer[] getCustomers() {
        return customer;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public void setBankstaff(BankStaff[] bankstaff) {
        this.bankstaff = bankstaff;
    }

    public void setCustomers(Customer[] customer) {
        this.customer = customer;
    }

    public Bank() {
        this.staffCount = 0;
        this.customerCount = 0;
        this.bankstaff = new BankStaff[20];
        this.customer = new Customer[50];
    }

    public  void hireStaff(BankStaff staff) {
        if (staffCount < 20) {
            bankstaff[staffCount] = staff;
            staffCount++;
        } else {
            throw new IllegalArgumentException("Array is full");
        }
    }

    public void registerCustomer(Customer customer) {
        if (customerCount < 50) {
            this.customer[customerCount] = customer;
            customerCount++;
        } else {
            throw new IllegalArgumentException("Array is full");
        }
    }

    public Customer findHighestBalanceCustomer() {
        if (customerCount == 0) {
            throw new IllegalArgumentException("Customer is empty");
        }
        Customer highestCustomer = customer[0];

        for (int i = 1; i < customerCount; i++) {
            if (customer[i].getAccountCount() > highestCustomer.getAccountCount()) {
                highestCustomer = customer[i];
            }
        }
        return highestCustomer;
    }

    public BankStaff findHighestPaidStaff() {
        if (staffCount == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        BankStaff highestStaff = bankstaff[0];
        for (int i = 1; i < staffCount; i++) {
            if (bankstaff[i].calculateSalary() > highestStaff.calculateSalary()) {
                highestStaff = bankstaff[i];
            }
        }
        return highestStaff;
    }

}

