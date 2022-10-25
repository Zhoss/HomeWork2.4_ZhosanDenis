package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GrassFeeding gazelle = new GrassFeeding("газель", 5, "степь", 50, "трава");
        System.out.println(gazelle);
        gazelle.grazing();

        GrassFeeding giraffe = new GrassFeeding("жираф", 8, "саванна", 55, "листва");
        System.out.println(giraffe);

        GrassFeeding horse = new GrassFeeding("лошадь", 4, "лесостепь", 40, "трава");
        System.out.println(horse);

        Predator hyena = new Predator("гиена", 1, "саванна", 60, "мясо или падаль");
        System.out.println(hyena);
        hyena.hunting();

        Predator tiger = new Predator("тигр", 6, "тайга", 60, "мясо");
        System.out.println(tiger);

        Predator bear = new Predator("медведь", 3, "лес", 50, "мясо, растительная пища, падаль");
        System.out.println(bear);

        Amphibia frog = new Amphibia("лягушка", 2, "пресноводные водоёмы");
        System.out.println(frog);
        frog.hunting();

        Amphibia aquaAnguis = new Amphibia("уж пресноводный", 1, "пресноводные водоёмы");
        System.out.println(aquaAnguis);
        aquaAnguis.eat();

        NotFlyingBird peafowl = new NotFlyingBird("павлин", 6, "джунгли", "наземный");
        System.out.println(peafowl);
        peafowl.walking();

        NotFlyingBird penguin = new NotFlyingBird("пингвин", 3, "Антарктика", "водный и наземный");
        System.out.println(penguin);

        NotFlyingBird dodo = new NotFlyingBird("птица додо", 8, "остров Маврикий", "наземный");
        System.out.println(dodo);

        FlyingBird seagull = new FlyingBird("чайка", 2, "берег и прибрежные морские воды", "летающий");
        System.out.println(seagull);
        seagull.flying();

        FlyingBird albatross = new FlyingBird("альбатрос", 4, "ледяные воды Антарктиды", "летающий");
        System.out.println(albatross);

        FlyingBird falcon = new FlyingBird("сокол", 5, "пустыня, тунда, тайга", "летающий");
        System.out.println(falcon);

        gazelle.addAnimal(horse);
        gazelle.addAnimal(gazelle);
        gazelle.addAnimal(giraffe);
        gazelle.addAnimal(horse);
        gazelle.addAnimal(hyena);
        gazelle.addAnimal(tiger);
        gazelle.addAnimal(bear);
        gazelle.addAnimal(frog);
        gazelle.addAnimal(aquaAnguis);
        gazelle.addAnimal(peafowl);
        gazelle.addAnimal(penguin);
        gazelle.addAnimal(dodo);
        gazelle.addAnimal(seagull);
        gazelle.addAnimal(albatross);
        gazelle.addAnimal(falcon);

        checkUniquenessOfAnimals(gazelle.getAnimals());
    }

    public static void checkUniquenessOfAnimals (Animal[] animals) {
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

    public static void findSameAnimals(ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i +1; j < animals.size(); j++) {
                if (animals.get(i).equals(animals.get(j))) {
                    System.out.println("Есть совпадение - " + animals.get(i).getName() + ", позиции " + (i + 1) + " и " + (j + 1));
                }
            }
        }
    }
}
