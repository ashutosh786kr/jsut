interface Motor {
    int capacity = 5; // interface data member

    void run(); // abstract method
    void consume(); // abstract method
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("The washing machine is running.");
    }

    public void consume() {
        System.out.println("The washing machine is consuming " + capacity + " liters of water.");
    }
}

public class p4{
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
    }
}