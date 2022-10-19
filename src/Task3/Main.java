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

        Predators hyena = new Predators("гиена", 1, "саванна", 60, "мясо или падаль");
        System.out.println(hyena);
        hyena.hunting();

        Predators tiger = new Predators("тигр", 6, "тайга", 60, "мясо");
        System.out.println(tiger);

        Predators bear = new Predators("медведь", 3, "лес", 50, "мясо, растительная пища, падаль");
        System.out.println(bear);

        Amphibia frog = new Amphibia("лягушка", 2, "пресноводные водоёмы");
        System.out.println(frog);
        frog.hunting();

        Amphibia aquaAnguis = new Amphibia("уж пресноводный", 1, "пресноводные водоёмы");
        System.out.println(aquaAnguis);

        NotFlyingBirds peafowl = new NotFlyingBirds("павлин", 6, "джунгли", "наземный");
        System.out.println(peafowl);
        peafowl.walking();

        NotFlyingBirds penguin = new NotFlyingBirds("пингвин", 3, "Антарктика", "водный и наземный");
        System.out.println(penguin);

        NotFlyingBirds dodo = new NotFlyingBirds("птица додо", 8, "остров Маврикий", "наземный");
        System.out.println(dodo);

        FlyingBirds seagull = new FlyingBirds("чайка", 2, "берег и прибрежные морские воды", "летающий");
        System.out.println(seagull);
        seagull.flying();

        FlyingBirds albatross = new FlyingBirds("альбатрос", 4, "ледяные воды Антарктиды", "летающий");
        System.out.println(albatross);

        FlyingBirds falcon = new FlyingBirds("сокол", 5, "пустыня, тунда, тайга", "летающий");
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

    public static void checkUniquenessOfAnimals (Animals[] animals) {
        ArrayList<Animals> grassFeeding = new ArrayList<>();
        ArrayList<Animals> predators = new ArrayList<>();
        ArrayList<Animals> amphibia = new ArrayList<>();
        ArrayList<Animals> notFlyingBirds = new ArrayList<>();
        ArrayList<Animals> flyingBirds = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof GrassFeeding) {
                grassFeeding.add(animals[i]);
            } else if (animals[i] instanceof Predators) {
                predators.add(animals[i]);
            } else if (animals[i].getClass() == Amphibia.class) {
                amphibia.add(animals[i]);
            } else if (animals[i].getClass() == NotFlyingBirds.class) {
                notFlyingBirds.add(animals[i]);
            } else if (animals[i] instanceof FlyingBirds) {
                flyingBirds.add(animals[i]);
            }
        }
        findSameAnimals(grassFeeding);
        findSameAnimals(predators);
        findSameAnimals(amphibia);
        findSameAnimals(notFlyingBirds);
        findSameAnimals(flyingBirds);
    }

    public static void findSameAnimals(ArrayList<Animals> animals) {
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i +1; j < animals.size(); j++) {
                if (animals.get(i).equals(animals.get(j))) {
                    System.out.println("Есть совпадение - " + animals.get(i).getName() + ", позиции " + (i + 1) + " и " + (j + 1));
                }
            }
        }
    }
}
