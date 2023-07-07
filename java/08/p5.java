class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}

public class p5{
    public static void main(String[] args) {
        Dog dog = new Dog("Swapnil", 20, "Labrador");
        dog.display();
    }
}