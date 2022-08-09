package ss7_Abstract.pratice.Animal_class.controllor;

import ss7_Abstract.pratice.Animal_class.model.AnimalClass;
import ss7_Abstract.pratice.Animal_class.model.Chicken;
import ss7_Abstract.pratice.Animal_class.model.Edible;
import ss7_Abstract.pratice.Animal_class.model.Tiger;

public class main {
    public static void main(String[] args) {
        AnimalClass[] animals = new AnimalClass[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (AnimalClass animal : animals) {
            System.out.println( animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());

            }
        }

    }
}
