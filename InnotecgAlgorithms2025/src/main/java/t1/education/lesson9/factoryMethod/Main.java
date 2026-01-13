package t1.education.lesson9.factoryMethod;

public class Main {

    public static void main(String[] args) {

        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory catFactory = new CatFactory();

        Animal dog = dogFactory.createAnimal();
        Animal cat = catFactory.createAnimal();

        dog.makeSound();
        cat.makeSound();


    }


}
