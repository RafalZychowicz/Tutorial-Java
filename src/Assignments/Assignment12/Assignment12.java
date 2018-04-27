package Assignments.Assignment12;

import java.util.ArrayList;
import java.util.List;

public class Assignment12 {

    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();
        points.add(new Point(2, 6));
        points.add(new Point(7, 9));
        points.add(new Point(5, 4));

        Point point1 = points.get(0);
        Point point2 = points.get(1);
        Point point3 = points.get(2);

        System.out.println("First point: " + "x: " + point1.getX() + ", z: " + point1.getY());
        System.out.println("Second point: " + "x: " + point2.getX() + ", z: " + point2.getY());
        System.out.println("Third point: " + "x: " + point3.getX() + ", z: " + point3.getY());
    }
}
