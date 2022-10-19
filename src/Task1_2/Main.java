package Task1_2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 2015, "Россия", "желтый", 187, 1.7, "МКПП", "седан", "в545нм233", 5, "летняя");
        Car.Insurance ladaInsurance = lada.new Insurance(2020, 1, 10_000, 253478912);
        lada.setInsurance(ladaInsurance);
        System.out.println(lada);
        lada.refill();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 240 , 3.0, "АКПП", "хетчбэк", "у943ос989", 7, "зимняя");
        Car.Insurance audiInsurance = audi.new Insurance(2022, 2, 25_000, 654651689);
        audi.setInsurance(audiInsurance);
        System.out.println(audi);

        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 265, 3.0, "АКПП", "кроссовер", "р777рр777", 7, "летняя");
        Car.Insurance bmwInsurance = bmw.new Insurance(2021, 1, 21_000, 443849847);
        bmw.setInsurance(bmwInsurance);
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 196, 2.4, "вариатор", "седан", "о808рк442", 5, "летняя");
        Car.Insurance kiaInsurance = kia.new Insurance(2021, 2, 18_500, 213291873);
        kia.setInsurance(kiaInsurance);
        System.out.println(kia);

        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 183, 1.6, "МКПП", "хетчбэк", "а723рр946", 5, "зимняя");
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(2019, 2, 23_000, 12345678);
        hyundai.setInsurance(hyundaiInsurance);
        System.out.println(hyundai);

        changeTireType(bmw);
        checkRegistrationNumber(lada);
        checkInsuranceValidity(lada);
        checkInsuranceNumber(hyundai);
        System.out.println("");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", "", 301, 3500, 7, "Белорусский вокзал", "Минск", 11);
        System.out.println(lastochka);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 9, "Ленинградский вокзал", "Ленинград", 8);
        System.out.println(leningrad);
        leningrad.refill();
        System.out.println("");

        Bus man = new Bus("Man", "Lion’s City C", 2018, "Германия", "желтый", 60);
        System.out.println(man);

        Bus volvo = new Bus("Volvo", "7900", 2020, "Швеция", "", 55);
        System.out.println(volvo);

        Bus liaz = new Bus("ЛиАЗ", "", 2016, "Россия", "синий", 58);
        System.out.println(liaz);
        liaz.refill();
    }

    public static void changeTireType(Car car) {
        if (LocalDate.now().getMonthValue() <= 4 && LocalDate.now().getMonthValue() >= 10 && car.getTireType().equals("летняя")) {
            System.out.println("Необходимо поменять шины с летней резиной на шины с зимней");
            car.setTireType("зимняя");
        } else {
            System.out.println("Все в порядке, замена шин не требуется");
        }
    }

    public static void checkRegistrationNumber(Car car) {
        String str = car.getRegistrationNumber();
        if (str == null || str.isBlank() || str.length() != 9) {
            System.out.println("Регистрационный номер не соответствует формату");
        }
        if (str != null && str.matches("^[а-яА-Я]\\d{3}[а-яА-Я]{2}\\d{3}")) {
            System.out.println("Регистрационный номер указан верно");
        } else {
            System.out.println("Регистрационный номер указан неверно");
        }
    }

    public static void checkInsuranceValidity(Car car) {
        if ((LocalDate.now().getYear() - car.getInsurance().getValidityPeriodYear()) > car.getInsurance().getStartPeriodYear()) {
            System.out.println("Страховой полис просрочен. Требуется оформление нового страхового полиса!");
        }
    }

    public static void checkInsuranceNumber(Car car) {
        if (car.getInsurance().getNumber() != 9) {
            System.out.println("Номер страхового полиса указан некорректно");
        }
    }
}