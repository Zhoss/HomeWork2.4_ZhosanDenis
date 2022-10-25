package Task3;
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

        Zoo zoo = new Zoo(new Animal[]{gazelle, gazelle, giraffe, horse, hyena, tiger, bear, frog, aquaAnguis, peafowl, penguin, dodo, seagull, albatross, falcon});
        System.out.println(zoo);

        zoo.checkUniquenessOfAnimals();
    }
}
