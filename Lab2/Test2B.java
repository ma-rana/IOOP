public class Test2B {
    public static void main(String[] args) {
        Car car = new Car();
        Helper.display(car);

        // Car car = new Sedan();
        // Helper.display(car);

        Vehicle vehicle = new Sedan();
        Helper.display(vehicle);

        // Vehicle vehicle = new Sedan();
        // Helper.display((Car) vehicle);
        // The Sedan is displayed

        // Vehicle vehicle = new Truck();
        // Helper.display((Car) vehicle);

    }

    public class Helper {
        // public static void display(Car car) {
        // System.out.println("The " + car.getClass().getName()
        // + " is displayed");
        // }

        // public static void display(Vehicle vehicle) {
        // System.out.println("The " + vehicle.getClass().getName()
        // + " is displayed");
        // }

        public static void display(Vehicle car) {
            System.out.println("The " + car.getClass().getName()
                    + " is displayed");
        }
    }
}