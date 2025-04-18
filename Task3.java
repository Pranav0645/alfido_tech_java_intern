// Superclass (Parent Class)
class Animal {
    // Instance variable
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method (can be overridden)
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass (Child Class) that inherits from Animal
class Dog extends Animal {
    // Constructor to initialize the Dog object
    public Dog(String name) {
        super(name); // Call the superclass (Animal) constructor
    }

    // Method Overriding: Dog's implementation of makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

// Another subclass (Child Class) that inherits from Animal
class Cat extends Animal {
    // Constructor to initialize the Cat object
    public Cat(String name) {
        super(name); // Call the superclass (Animal) constructor
    }

    // Method Overriding: Cat's implementation of makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " says Meow!");
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Create an object of Dog
        Animal dog = new Dog("Buddy");
        dog.makeSound(); // This will call the overridden method in Dog class

        // Create an object of Cat
        Animal cat = new Cat("Whiskers");
        cat.makeSound(); // This will call the overridden method in Cat class

        // Create an object of Animal (Parent class)
        Animal animal = new Animal("Generic Animal");
        animal.makeSound(); // This will call the method in Animal class
    }
}
