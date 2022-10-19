package Task1_2;

import java.time.LocalDate;

public class Car extends Transport {

    public class Key {
        private String engineStart;
        private String entry;

        public Key(String engineStart, String entry) {
            if (engineStart != null && !engineStart.isBlank()) {
                this.engineStart = engineStart;
            } else {
                this.engineStart = "Remote engine start";
            }

            if (entry != null && !entry.isBlank()) {
                this.entry = entry;
            } else {
                this.entry = "Keyless entry";
            }
        }

        public String getEngineStart() {
            return engineStart;
        }

        public String getEntry() {
            return entry;
        }
    }

    public class Insurance {
        private int startPeriodYear;
        private int validityPeriodYear;
        private int cost;
        private int number;

        public Insurance(int startPeriodYear, int validityPeriodYear, int cost, int number) {
            if (startPeriodYear >= 2020 && startPeriodYear <= LocalDate.now().getYear()) {
                this.startPeriodYear = startPeriodYear;
            } else {
                System.out.println("Год начала действия страхового полиса автомобиля " + getBrand() + " " + getModel() + " указан неверно");
            }

            if (validityPeriodYear > 0 && validityPeriodYear <= 3) {
                this.validityPeriodYear = validityPeriodYear;
            } else {
                System.out.println("Срок действия страхового полиса указан некорректно");
            }

            if (cost > 0) {
                this.cost = cost;
            } else {
                System.out.println("Стоимость страхового полиса указана некорректно");
            }

            if (number > 0) {
                this.number = number;
            } else {
                System.out.println("Номер страхового полиса указан некорректно");
            }
        }

        public int getStartPeriodYear() {
            return startPeriodYear;
        }

        public int getValidityPeriodYear() {
            return validityPeriodYear;
        }

        public int getCost() {
            return cost;
        }

        public int getNumber() {
            return number;
        }
    }

    private double engineVolume;
    private String gearBox;
    private final String bodyType;
    private String registrationNumber;
    private final int seatQuantity;
    private String tireType;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed, double engineVolume, String gearBox, String bodyType, String registrationNumber, int seatQuantity, String tireType) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);

        setEngineVolume(engineVolume);

        setGearBox(gearBox);

        if (bodyType != null && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }

        setRegistrationNumber(registrationNumber);

        if (seatQuantity > 0 && seatQuantity <= 8) {
            this.seatQuantity = seatQuantity;
        } else {
            this.seatQuantity = 5;
        }

        if (tireType != null && !tireType.isBlank()) {
            this.tireType = tireType;
        } else {
            this.tireType = "зимняя";
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public String getTireType() {
        return tireType;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0 && engineVolume < 30) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public void setGearBox(String gearBox) {
        if (gearBox != null && !gearBox.isBlank()) {
            if (gearBox.equals("АКПП")) {
                this.gearBox = gearBox;
            } else if (gearBox.equals("МКПП")) {
                this.gearBox = gearBox;
            } else if (gearBox.equals("вариатор")) {
                this.gearBox = gearBox;
            } else {
                System.out.println("Выберите тип коробки передач: АКПП, МКПП или вариатор");
            }
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isBlank() && registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTireType(String tireType) {
        if (tireType != null && !tireType.isBlank()) {
            this.tireType = tireType;
        } else {
            this.tireType = "зимняя";
        }
    }

    public void setKey(Key key) {
        if (this.key == null) {
            this.key = key;
        }
    }

    public void setInsurance(Insurance insurance) {
        if (this.insurance == null) {
            this.insurance = insurance;
        }
    }

    public void refill() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " необходимо заправить бензином или дизельным топливом на заправке или зярядить на специальной электропарковке");
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() +
                ", модель - " + getModel() +
                ", объем двигатель - " + getEngineVolume() + " л" +
                ", максимальная скорость - " + getMaxSpeed() + " км/ч" +
                ", цвет кузова - " + getBodyColor() +
                ", год производства - " + getProductionYear() +
                ", страна сборки - " + getProductionCountry() +
                ", тип коробки передач - " + getGearBox() +
                ", тип кузова - " + getBodyType() +
                ", регистрационный номер - " + getRegistrationNumber() +
                ", количество посадочных мест - " + getSeatQuantity() +
                ", тип резины - " + getTireType();
    }
}
