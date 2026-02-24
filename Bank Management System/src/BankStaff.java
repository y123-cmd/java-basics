public class BankStaff extends Person {
    private String employeeID;
    private String position;
    private double baseSalary;
    private int yearsExperience;

    public BankStaff(String employeeID,String name, int age, String position, double baseSalary, int yearsExperience) {
        super(name, age);
        setPosition(position);
        setEmployeeID(employeeID);
        setBaseSalary(baseSalary);
        setYearsExperience(yearsExperience);
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        if(employeeID == null||employeeID.isEmpty()){
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        }
        this.employeeID = employeeID;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        if(position == null||position.isEmpty()){
            throw new IllegalArgumentException("Position cannot be null or empty");
        }
        this.position = position;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public int getYearsExperience() {
        return yearsExperience;
    }
    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0){
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }
    public double calculateSalary(){
        return getBaseSalary() + (50 * getYearsExperience());
    }

    @Override
    public void displayRole(){
        System.out.println("manages bank operations");
    }
}
