public class Main {
    public static void main(String[] args) {
        Car car = new Car("C001 ", " Chevrolet ", " Camaro ", 55.0);
        Car car1 = new Car("D003 ", " Volkswagen " , " Impala ", 60.00);

        Motorcycle motorcycle = new Motorcycle("G007", "Yamaha ", " Yamaha 2030", 70.0);
        Motorcycle motorcycle1 = new Motorcycle(" H005", " Honda ", " Honda4 ", 80.0);

        Vehicle[] vehicles = {car, car1, motorcycle, motorcycle1};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getBrand() + " " + vehicle.getModel());
            vehicle.rentVehicle();
            System.out.println(" rental cost: " + vehicle.calculateRentalCost(5));
            vehicle.rentVehicle();
            vehicle.returnVehicle();

        }
    }
}