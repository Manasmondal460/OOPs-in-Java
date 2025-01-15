// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {
        // Create instances of Animal, Dog, and Cat
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the sound method on each object
        myAnimal.sound(); // Calls the sound method of Animal class
        myDog.sound();    // Calls the overridden sound method of Dog class
        myCat.sound();    // Calls the overridden sound method of Cat class
    }
}
