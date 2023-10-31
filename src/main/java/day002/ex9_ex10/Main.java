package day002.ex9_ex10;

public class Main{
    public static void main(String[] args) {

        Circle circle1 = new Circle(new Point2D(1,7),new Point2D(3,13));
        //tworząc Circle wstawiamy w konstruktor dwa Point2D(x,y) !!

        System.out.println("Promień: "+circle1.getRadius());
        System.out.println("Obwód: "+circle1.getPerimeter());
        System.out.println("Powierzchnia: "+circle1.getArea());

        Circle circle2 = new Circle(new Point2D(0,0),new Point2D(10,10));
        //tworząc Circle wstawiamy w konstruktor dwa Point2D(x,y) !!

        System.out.println("Promień: "+circle2.getRadius());
        System.out.println("Obwód: "+circle2.getPerimeter());
        System.out.println("Powierzchnia: "+circle2.getArea());

        System.out.println(circle1.toString());

        MoveDirection moveDirection = new MoveDirection(5,9);

        circle1.move(moveDirection);

        System.out.println(circle1.toString());
        System.out.println("Promień: "+circle1.getRadius());
        System.out.println("Obwód: "+circle1.getPerimeter());
        System.out.println("Powierzchnia: "+circle1.getArea());

        circle1.resize(5.0);
        System.out.println(circle1.toString());
        System.out.println("Promień: "+circle1.getRadius());
        System.out.println("Obwód: "+circle1.getPerimeter());
        System.out.println("Powierzchnia: "+circle1.getArea());
    }

}
