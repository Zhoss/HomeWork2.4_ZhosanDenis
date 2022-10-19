package Task3;

import java.util.Objects;

public class Amphibia extends Animals {
    private String habitat;

    public Amphibia(String name, int age, String habitat) {
        super(name, age);

        setHabitat(habitat);
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        if (habitat != null && !habitat.isBlank()) {
            this.habitat = habitat;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public void hunting() {
        System.out.println("Земноводное " + getName() + " охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibia amphibia = (Amphibia) o;
        return Objects.equals(habitat, amphibia.habitat) && Objects.equals(getName(), amphibia.getName()) && Objects.equals(getAge(), amphibia.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }

    @Override
    public String toString() {
        return "Земноводное, класс " + getClass().getSimpleName() + ", " + getName() +
                ", возраст - " + getAge() + " лет" +
                ", среда обитания - " + getHabitat();
    }
}
