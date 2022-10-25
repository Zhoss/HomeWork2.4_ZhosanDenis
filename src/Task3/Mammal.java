package Task3;

public abstract class Mammal extends Animal {
    private String habitat;
    private int movementSpeed;

    public Mammal(String name, int age, String habitat, int movementSpeed) {
        super(name, age);

        setHabitat(habitat);

        setMovementSpeed(movementSpeed);
    }

    public final String getHabitat() {
        return habitat;
    }

    public final int getMovementSpeed() {
        return movementSpeed;
    }

    public final void setHabitat(String habitat) {
        if (habitat != null && !habitat.isBlank()) {
            this.habitat = habitat;
        }
    }

    public final void setMovementSpeed(int movementSpeed) {
        if (movementSpeed > 0 && movementSpeed < 110) {
            this.movementSpeed = movementSpeed;
        }
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void go();

    public abstract void walking();
}
