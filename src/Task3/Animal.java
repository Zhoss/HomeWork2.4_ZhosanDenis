package Task3;

import java.util.Arrays;

public abstract class Animal {
    private String name;
    private int age;



    public Animal(String name, int age) {
        setName(name);

        if (age > 0 && age < 50) {
            this.age = age;
        }
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

}
