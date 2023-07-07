class Car {
    private String carName;
    private String carBrand;
    private String carModel;


    public Car(String carName, String carBrand, String carModel) {
        this.carName = carName;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public void display() {
        System.out.println("Car name: " + carName);
        System.out.println("Car brand: " + carBrand);
        System.out.println("Car model: " + carModel);
        Engine engine = new Engine();
        engine.display();
    }

    class Engine {
        private String engineType;

        public Engine() {
            if (carBrand.equalsIgnoreCase("Honda")) {
                if (carModel.equalsIgnoreCase("City")) {
                    engineType = "smaller";
                } else {
                    engineType = "bigger";
                }
            } else if (carBrand.equalsIgnoreCase("Toyota")) {
                if (carModel.equalsIgnoreCase("Corolla")) {
                    engineType = "bigger";
                } else {
                    engineType = "smaller";
                }
            }
        }

        public void display() {
            System.out.println("Engine type: " + engineType);
        }
    }
}

public class p6 {
    public static void main(String[] args) {
        Car car = new Car("My Car", "Toyota", "Yaris");
        car.display();
    }
}