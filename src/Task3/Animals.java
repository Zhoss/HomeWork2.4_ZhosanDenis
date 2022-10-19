package Task3;

import java.util.Arrays;

public abstract class Animals {
    private String name;
    private int age;

    private Animals[] animals;

    public Animals(String name, int age) {
        setName(name);

        if (age > 0 && age < 50) {
            this.age = age;
        }

        animals = new Animals[0];
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

    Animals[] getAnimals() {
        if (animals == null) {
            animals = new Animals[0];
        }
        return animals;
    }

    void addAnimal(Animals animal) {
        Animals[] animals = new Animals[getAnimals().length + 1];
        this.animals = Arrays.copyOf(this.animals, getAnimals().length + 1);
        this.animals[this.animals.length - 1] = animal;
    }
}
