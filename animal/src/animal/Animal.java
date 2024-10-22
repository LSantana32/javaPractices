package animal;

public class Animal {
    String name;
    String food;
    int age;
    String breed;

    public Animal(String name, String food, int age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public void eat (){
        System.out.println("Eating...");
    }
}
