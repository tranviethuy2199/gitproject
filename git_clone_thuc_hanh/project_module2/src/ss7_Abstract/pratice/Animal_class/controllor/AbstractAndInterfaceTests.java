package ss7_Abstract.pratice.Animal_class.controllor;

import ss7_Abstract.pratice.Animal_class.model.*;

import java.util.jar.JarOutputStream;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        AnimalClass[] animals = new AnimalClass[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (AnimalClass animalClass : animals) {
            System.out.println(animalClass.makeSound());
            System.out.println(animalClass.run());


            if (animalClass instanceof Chicken) {
                Edible edible = (Chicken) animalClass;
                Fly fly = (Chicken) animalClass;
                System.out.println(edible.howToEat());
                System.out.println(fly.Fly());
            }
        }
    }
}
