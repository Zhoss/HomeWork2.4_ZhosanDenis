package Task3;

import java.util.Arrays;

public abstract class Animal {
    private String name;
    private int age;

    private Animal[] animals;

    public Animal(String name, int age) {
        setName(name);

        if (age > 0 && age < 50) {
            this.age = age;
        }

        animals = new Animal[0];
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    public final void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    Animal[] getAnimals() {
        if (animals == null) {
            animals = new Animal[0];
        }
        return animals;
    }

    void addAnimal(Animal animal) {
        Animal[] animals = new Animal[getAnimals().length + 1];
        this.animals = Arrays.copyOf(this.animals, getAnimals().length + 1);
        this.animals[this.animals.length - 1] = animal;
    }
}
