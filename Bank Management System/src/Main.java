import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankStaff bankStaff = new BankStaff(" 1 ", " Norah ", 30, " Nurse ", 30000.0, 1);
        BankStaff bankStaff1 = new BankStaff(" 2 ", " James ", 34, " Surgeon ", 50000.0, 2);
        BankStaff bankStaff2 = new BankStaff(" 3 ", " Emmy ", 27, " Cardiologist ", 70000.0, 3);

        BankStaff[] allstaff ={bankStaff,bankStaff1,bankStaff2};
        for(BankStaff staff : allstaff){
            bank.hireStaff(staff);
        }


        Customer customer = new Customer(" 1 "," Mwajuma ", 29);
        Customer customer1 = new Customer(" 2 "," Joska ", 24);
        Customer customer2 = new Customer(" 3 ", " Lucy ",35);
        Customer customer3 = new Customer(" 4 ", " Bryan ",35);
        Customer customer4 = new Customer("5 ", " Risper ", 30);
        Customer[] allcustomer = {customer,customer1,customer2,customer3,customer4};

        for(Customer c : allcustomer){
            bank.registerCustomer(c);
        }

        Account account = new Account("123456789","Savings",20000.0);
        Account account1 = new Account("5678940365","Checking",50000.0);
        Account account2 = new Account("234567890h","Savings",10000.0);

        Account someAccount = new Account("123456789","Savings",20000.0);
        Account someAccount1 = new Account("675342890","Savings",50000.0);
        customer.addAccount(someAccount);
        customer2.addAccount(someAccount1);

        Account differentAccount = new Account("5678940365","Checking",50000.0);
        Account differentAccount1 = new Account("675342890","Checking",90000.0);
        Account differentAccount2 = new Account("5678940365","Savings",40000.0);
        customer1.addAccount(differentAccount);
        customer3.addAccount(differentAccount1);
        customer4.addAccount(differentAccount2);

        System.out.println("Total staff hired: " + bank.getStaffCount());
        System.out.println("Customers registered: " + bank.getCustomerCount());
        System.out.println("Mwajumas accounts: " + customer.getAccountCount());
        System.out.println("joska accounts:" + customer.getAccountCount());

        System.out.println("balance before: " + someAccount.getBalance());
        System.out.println("balance before: " + someAccount1.getBalance());

        someAccount.deposit(500);
        someAccount1.withdraw(500);
        System.out.println("balance after: " + someAccount.getBalance());
        System.out.println("balance after: " + someAccount1.getBalance());

        System.out.println("display all staff: " + bank.getStaffCount());
        System.out.println("display all accounts: " + bank.getCustomerCount());

        BankStaff highestPaid = bank.findHighestPaidStaff();
        System.out.println("Highest paid staff: " + bank.findHighestPaidStaff().getName() +
                " with salary: " + bank.findHighestPaidStaff().getName());

        }

    }
