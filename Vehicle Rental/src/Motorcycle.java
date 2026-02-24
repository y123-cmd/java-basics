public class Motorcycle extends Vehicle {
    private double hourlyRate;

    public Motorcycle(String vehicleId, String brand, String model, double hourlyRate) {
        super(vehicleId, brand, model);
        setVehicleId(vehicleId);
        setBrand(brand);
        setHourlyRate(hourlyRate);

    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be less than 0");
        }
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateRentalCost(int days) {
        return hourlyRate * days * 8;

    }

}
