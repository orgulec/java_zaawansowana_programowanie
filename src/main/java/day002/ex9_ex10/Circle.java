package day002.ex9_ex10;

public class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        double distA = Math.abs(center.getX() - point.getX());
        double distB = Math.abs(center.getY() - point.getY());
        double distC = Math.pow(distA, 2) + Math.pow(distB, 2);
        return Math.sqrt(distC);
    }

    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Circle:" +
                "center=" + center.getX() + "/" + center.getY() +
                ", point=" + point.getX() + "/" + point.getY();
    }

    @Override
    public void move(MoveDirection direction) {
        center.move(direction); //tu używamy metody move() z Point2D !!!
        point.move(direction);
//        center.setX(center.getX() + direction.getX());
//        center.setY(center.getY() + direction.getY());
//        point.setX(point.getX() + direction.getX());
//        point.setY(point.getY() + direction.getY());
    }

    @Override
    public void resize(double resizeFactor) {
        center.setX(center.getX() * resizeFactor);
        center.setY(center.getY() * resizeFactor);
        point.setX(point.getX() * resizeFactor);
        point.setY(point.getY() * resizeFactor);
    }
}
