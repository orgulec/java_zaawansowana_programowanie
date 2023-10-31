package exercises.zadanie15;

public class CarApp {
    public static void main(String[] args) {

        System.out.println(Car.FERRARI.isPremium());
        System.out.println(Car.PORSCHE.isRegular());
        System.out.println(Car.OPEL.isPremium());
        System.out.println(Car.TOYOTA.isPremium());
        System.out.println(Car.FIAT.isRegular());

        System.out.println();
        System.out.println(Car.MERCEDES.isFasterThan(Car.FERRARI));
        System.out.println(Car.PORSCHE.isFasterThan(Car.BMW));
        System.out.println(Car.TOYOTA.isFasterThan(Car.OPEL));


    }
}
