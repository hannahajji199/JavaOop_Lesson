public class chainabstractclass {
    abstract class Animal {
        abstract void makeSound();
    }

    abstract class Pet extends Animal {
        void play() { System.out.println("Playing!"); }
    }

    class Cat extends Pet {
        @Override
        void makeSound() { System.out.println("Meow"); }
    }
}
