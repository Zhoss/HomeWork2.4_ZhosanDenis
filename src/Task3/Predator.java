package Task3;

import java.util.Objects;

public class Predator extends Mammal {
    private String foodType;

    public Predator(String name, int age, String habitat, int movementSpeed, String foodType) {
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
        System.out.println("Хищник " + getName() + " ест мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Хищник " + getName() + " спит");
    }

    @Override
    public void go() {
        System.out.println("Хищник " + getName() + " идет");
    }

    @Override
    public void walking() {
        System.out.println("Хищник " + getName() + " гуляет");
    }

    public void hunting() {
        System.out.println("Хищник " + getName() + " охотится, чтобы добыть пропитание в виде " + getFoodType());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator that = (Predator) o;
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
