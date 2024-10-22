import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Horse;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Stich","Meat",11,"Caniche");
        dog.eat();

        Animal cat = new Cat("Lazy","croquettes",9,"Siames");
        cat.eat();

        Animal horse= new Horse("Penelope", "carrot", 13, "Arabic");
        horse.eat();

    }
}