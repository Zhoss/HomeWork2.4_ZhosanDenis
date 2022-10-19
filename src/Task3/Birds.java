package Task3;

public abstract class Birds extends Animals {
    private String habitat;

    public Birds(String name, int age, String habitat) {
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
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void go();

    public abstract void hunting();
}
