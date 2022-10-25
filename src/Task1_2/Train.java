package Task1_2;

public class Train extends Transport {
    private int tripPrice;
    private int tripTimeHour;
    private String departureStationName;
    private String endingStationName;
    private int wagonsQuantity;

    public Train(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed, int tripPrice, int tripTimeHour, String departureStationName, String endingStationName, int wagonsQuantity) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);

        setTripPrice(tripPrice);

        setTripTimeHour(tripTimeHour);

        setDepartureStationName(departureStationName);

        setEndingStationName(endingStationName);

        setWagonsQuantity(wagonsQuantity);
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public int getTripTimeHour() {
        return tripTimeHour;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getEndingStationName() {
        return endingStationName;
    }

    public int getWagonsQuantity() {
        return wagonsQuantity;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice >= 0) {
            this.tripPrice = tripPrice;
        }
    }

    public void setTripTimeHour(int tripTimeHour) {
        if (tripTimeHour > 0) {
            this.tripTimeHour = tripTimeHour;
        }
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName != null && !departureStationName.isBlank()) {
            this.departureStationName = departureStationName;
        }
    }

    public void setEndingStationName(String endingStationName) {
        if (endingStationName != null && !endingStationName.isBlank()) {
            this.endingStationName = endingStationName;
        }
    }

    public void setWagonsQuantity(int wagonsQuantity) {
        if (wagonsQuantity > 0) {
            this.wagonsQuantity = wagonsQuantity;
        }
    }

    public void refill() {
        System.out.println("Поезд " + getBrand() + " " + getModel() + " необходимо заправить дизельным топливом");
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() +
                ", модель - " + getModel() +
                ", год производства - " + getProductionYear() +
                ", страна производства - " + getProductionCountry() +
                ", цвет - " + getBodyColor() +
                ", максимальная скорость - " + getMaxSpeed() + " км/ч" +
                ", стоимость поездки - " + tripPrice + " руб." +
                ", время поездки - " + tripTimeHour + " ч" +
                ", станция отправления - " + departureStationName +
                ", станция прибытия - " + endingStationName +
                ", количество вагонов - " + wagonsQuantity + " шт.";
    }
}
