package exercises.zadanie7.onarray;

public class GunArray {
    public static void main(String[] args) {

        BulletMagazineArray gun2 = new BulletMagazineArray(4);

        System.out.println(gun2.isLoaded());

        gun2.loadBullet("Bang 1!").ifPresent(System.out::println);
        gun2.loadBullet("Bang 2!").ifPresent(System.out::println);
        gun2.loadBullet("Bang 3!").ifPresent(System.out::println);
        gun2.loadBullet("Bang 4!").ifPresent(System.out::println);
        gun2.loadBullet("Bang 5!").ifPresent(System.out::println);
        gun2.loadBullet("Bang 6!").ifPresent(System.out::println);

        System.out.println(gun2.isLoaded());

        gun2.shot().ifPresent(System.out::println);
        gun2.shot().ifPresent(System.out::println);
        gun2.shot().ifPresent(System.out::println);
        gun2.shot().ifPresent(System.out::println);
        gun2.shot().ifPresent(System.out::println);

        System.out.println(gun2.isLoaded());
    }



}
