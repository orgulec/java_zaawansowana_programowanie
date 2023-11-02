package exercises.zadanie7;
/*
Zadanie 7.
Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora.
Zaimplementuj metody:
loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój
i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
 */
public class Gun {
    public static void main(String[] args) {

        BulletMagazine gun1 = new BulletMagazine(4);

        System.out.println(gun1.isLoaded());

        gun1.loadBullet("Bang 1!").ifPresent(System.out::println);
        gun1.loadBullet("Bang 2!").ifPresent(System.out::println);
        gun1.loadBullet("Bang 3!").ifPresent(System.out::println);
        gun1.loadBullet("Bang 4!").ifPresent(System.out::println);
        gun1.loadBullet("Bang 5!").ifPresent(System.out::println);
        gun1.loadBullet("Bang 6!").ifPresent(System.out::println);

        System.out.println(gun1.isLoaded());

        gun1.shot().ifPresent(System.out::println);
        gun1.shot().ifPresent(System.out::println);
        gun1.shot().ifPresent(System.out::println);
        gun1.shot().ifPresent(System.out::println);
        gun1.shot().ifPresent(System.out::println);

        System.out.println(gun1.isLoaded());
    }



}
