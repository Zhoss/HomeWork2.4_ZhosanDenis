package Task1_2;

public class Bus extends Transport{
    public Bus(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
    }

    public void refill() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " необходимо заправить бензином или дизельным топливом на заправке");
    }
}
