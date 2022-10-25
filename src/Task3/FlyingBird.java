package Task3;

import java.util.Objects;

public class FlyingBird extends Bird {
    private String movementType;

    public FlyingBird(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);

        setMovementType(movementType);
    }

    public final String getMovementType() {
        return movementType;
    }

    public final void setMovementType(String movementType) {
        if (movementType != null && !movementType.isBlank()) {
            this.movementType = movementType;
        }
    }

    @Override
    public void eat() {
        System.out.println("Летающая птица " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Летающая птица " + getName() + " спит");
    }

    @Override
    public void go() {
        System.out.println("Летающая птица " + getName() + " летит");
    }

    @Override
    public void hunting() {
        System.out.println("Летающая птица " + getName() + " охотится");
    }

    public void flying() {
        System.out.println("Летающая птица " + getName() + " летает над " + getHabitat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyingBird that = (FlyingBird) o;
        return Objects.equals(movementType, that.movementType) && Objects.equals(getName(), that.getName()) && Objects.equals(getAge(), that.getAge()) && Objects.equals(getHabitat(), that.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHabitat(), movementType);
    }

    @Override
    public String toString() {
        return "Летающая птица, класс " + getClass().getSimpleName() + ", " + getName() +
                ", возраст - " + getAge() + " лет" +
                ", среда обитания - " + getHabitat() +
                ", тип передвижения - " + movementType;
    }
}
