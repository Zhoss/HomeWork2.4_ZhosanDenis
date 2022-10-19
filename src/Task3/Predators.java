package Task3;

import java.util.Objects;

public class Predators extends Mammals {
    private String foodType;

    public Predators(String name, int age, String habitat, int movementSpeed, String foodType) {
        super(name, age, habitat, movementSpeed);

        setFoodType(foodType);
    }

    public final String getFoodType() {
        return foodType;
    }

    public final void setFoodType(String foodType) {
        if (foodType != null && !foodType.isBlank()) {
            this.foodType = foodType;
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
    public void walking() {

    }

    public void hunting() {
        System.out.println("Хищник " + getName() + " охотится, чтобы добыть пропитание в виде " + getFoodType());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators that = (Predators) o;
        return Objects.equals(foodType, that.foodType) && Objects.equals(getName(), that.getName()) && Objects.equals(getAge(), that.getAge()) && Objects.equals(getHabitat(), that.getHabitat()) && Objects.equals(getMovementSpeed(), that.getMovementSpeed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHabitat(), getMovementSpeed(), foodType);
    }

    @Override
    public String toString() {
        return "Хищник, класс " + getClass().getSimpleName() + ", " + getName() +
                ", возраст - " + getAge() + " лет" +
                ", среда обитания - " + getHabitat() +
                ", средняя скорость перемещения - " + getMovementSpeed() + " км/ч" +
                ", тип пищи - " + foodType;
    }
}
