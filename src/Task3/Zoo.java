package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }

    public void checkUniquenessOfAnimals() {
        ArrayList<Animal> grassFeeding = new ArrayList<>();
        ArrayList<Animal> predators = new ArrayList<>();
        ArrayList<Animal> amphibia = new ArrayList<>();
        ArrayList<Animal> notFlyingBirds = new ArrayList<>();
        ArrayList<Animal> flyingBirds = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof GrassFeeding) {
                grassFeeding.add(animals[i]);
            } else if (animals[i] instanceof Predator) {
                predators.add(animals[i]);
            } else if (animals[i].getClass() == Amphibia.class) {
                amphibia.add(animals[i]);
            } else if (animals[i].getClass() == NotFlyingBird.class) {
                notFlyingBirds.add(animals[i]);
            } else if (animals[i] instanceof FlyingBird) {
                flyingBirds.add(animals[i]);
            }
        }
        findSameAnimals(grassFeeding);
        findSameAnimals(predators);
        findSameAnimals(amphibia);
        findSameAnimals(notFlyingBirds);
        findSameAnimals(flyingBirds);
    }

    private static void findSameAnimals(ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(i).equals(animals.get(j))) {
                    System.out.println("Есть совпадение - " + animals.get(i).getName());
                }
            }
        }
    }
}
