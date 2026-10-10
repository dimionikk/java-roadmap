class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    String sound() {
        return "...";
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    String sound() {
        return "Woof";
    }
}

public class DispatchDemo {
    public static void main(String[] args) {
        Animal pet = new Dog();
        System.out.println(pet.sound());
        describe(pet);
    }

    static void describe(Animal animal) {
        System.out.println("describe(Animal)");
    }

    static void describe(Dog dog) {
        System.out.println("describe(Dog)");
    }
}