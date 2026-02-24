public abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private String model;
    private boolean isRented;

    public Vehicle(String vehicleId, String brand, String model) {
        setVehicleId(vehicleId);
        setBrand(brand);
        setModel(model);
    }

        public String getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public boolean isRented() {
            return isRented;
        }

        public void setRented(boolean rented) {
            isRented = rented;
        }

    public abstract double calculateRentalCost(int days);

    public void rentVehicle() {
        if (!isRented) {
            isRented = true;
            System.out.println("Vehicle " + getVehicleId() + " has been rented");
        } else {
            System.out.println("Vehicle is already rented");
        }
    }
    public void returnVehicle(){
        isRented = false;
        System.out.println("Vehicle " + getVehicleId() + " has been returned");
    }

}

