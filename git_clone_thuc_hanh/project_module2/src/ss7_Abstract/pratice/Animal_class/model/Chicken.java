package ss7_Abstract.pratice.Animal_class.model;

public class Chicken extends AnimalClass implements Edible, Fly{
    @Override
    public String makeSound() {
        return "chicken : chip chip";
    }

    @Override
    public String run() {
        return "chạy như gà";
    }

    @Override
    public String howToEat() {
        return "cách ăn con này : " +
                "hấp , nướng , hầm..";
    }

    @Override
    public String Fly() {
        return "con này có thể bay nhưng lại rất gà";
    }
}