package Task1_2;

import java.time.LocalDate;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (productionYear > 0 && productionYear <= LocalDate.now().getYear()) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry != null && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }

        setBodyColor(bodyColor);

        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "белый";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0 && maxSpeed < 1_079_252_849) {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "Транспорт - " + brand +
                ", модель - " + model +
                ", год производства - " + productionYear +
                ", страна производства - " + productionCountry +
                ", цвет - " + bodyColor +
                ", максимальная скорость - " + maxSpeed + " км/ч";
    }
}
