package exercises.zadanie15;

/*
Zadanie 15.
Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA, itp.
Każdy z pojazdów ma własne parametry np. cena, moc, itp. Enum powinien zawierać metody boolean isPremium() oraz boolean isRegular().
Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().
Dodatkowo w ramach klasy enum powinna być zadeklarowana i zaimplementowana metoda boolean isFasterThan().
Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o tym, że wskazany pojazd jest szybszy
bądź nie od pojazdu przekazanego w argumencie. W tym celu skorzystaj z metody compareTo().
 */
public enum Car {
    FERRARI(1_000_000, 500, 350, 'Y'),
    PORSCHE(600_000, 360, 290, 'Y'),
    MERCEDES(200_000, 250, 260, 'Y'),
    BMW(150_000, 220, 270, 'N'),
    OPEL(80_000, 190, 230, 'N'),
    FIAT(75_000, 125, 220, 'N'),
    TOYOTA(110_000, 150, 240, 'N');

    Car(Integer price, Integer power, Integer maxSpeed, char premium) {
        this.price = price;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.premium = premium;
    }

    private final int price;
    private final int power;
    private final int maxSpeed;
    private final char premium;

    public boolean isPremium() {
        System.out.println("Is " + this.name() + " premium? ");
        return premium == 'Y';
    }

    public boolean isRegular() {
        System.out.println("Is " + this.name() + " regular? ");
        return premium != 'Y';
    }

    public boolean isFasterThan(Car car) {
        System.out.println("Is " + this.name() + " faster than " + car.name() + "?");
        Integer speed = this.maxSpeed;
        return speed.compareTo(car.maxSpeed) > 0;
    }

}
