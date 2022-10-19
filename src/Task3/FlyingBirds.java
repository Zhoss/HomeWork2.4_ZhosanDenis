package Task3;

import java.util.Objects;

public class FlyingBirds extends Birds {
    private String movementType;

    public FlyingBirds(String name, int age, String habitat, String movementType) {
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

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    @Override
    public void hunting() {

    }

    public void flying() {
        System.out.println("Летающая птица " + getName() + " летает над " + getHabitat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyingBirds that = (FlyingBirds) o;
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
