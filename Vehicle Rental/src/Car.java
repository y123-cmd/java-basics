public class Car extends Vehicle{
    private double dailyRate;

    public Car(String vehicleId, String brand, String model,double dailyRate) {
        super(vehicleId, brand, model);
        setDailyRate(dailyRate);
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(double dailyRate) {
        if(dailyRate < 0){
            throw new IllegalArgumentException("Daily Rate cannot be negative");
        }
        this.dailyRate = dailyRate;
    }
    @Override
    public double calculateRentalCost(int days){
        double cost = dailyRate * days;
        if(days > 7){
            cost = cost * 0.90;
        }
        return cost;

    }
}
