package Task3;

import java.util.Objects;

public class NotFlyingBird extends Bird {
    private String movementType;

    public NotFlyingBird(String name, int age, String habitat, String movementType) {
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
        System.out.println("Нелетающая птица " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птица " + getName() + " спит");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица " + getName() + " идет");
    }

    @Override
    public void hunting() {
        System.out.println("Нелетающая птица " + getName() + " охотится");
    }

    public void walking() {
        System.out.println("Нелетающая птица " + getName() + " гуляет по " + getHabitat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotFlyingBird that = (NotFlyingBird) o;
        return Objects.equals(movementType, that.movementType) && Objects.equals(getName(), that.getName()) && Objects.equals(getAge(), that.getAge()) && Objects.equals(getHabitat(), that.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHabitat(), movementType);
    }

    @Override
    public String toString() {
        return "Нелетающая птица, класс " + getClass().getSimpleName() + ", " + getName() +
                ", возраст - " + getAge() + " лет" +
                ", среда обитания - " + getHabitat() +
                ", тип передвижения - " + movementType;
    }
}
