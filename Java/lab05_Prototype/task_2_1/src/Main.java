import java.util.ArrayList;
import java.util.List;

public class Main {

    static void doSomeThing(Triangle triangle){

//        Triangle  triangle1 = new Triangle(triangle);
        Triangle  triangle1 = triangle.clone();
        System.out.println(triangle1);

    }


    public static void main(String[] args) {

        float a = 3;
        float b = 4;
        float c = 5;

        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle);

        doSomeThing(triangle);



//        List<Shape> shapes = new ArrayList<>();
//        shapes.add(new Circle(10, 12, "red", 100));
//        shapes.add(new Rectangle(100, 100, "yelow", 10, 20));
//        shapes.add(new Rectangle(0, 0, "blue", 100, 100));
//        for (Shape shape : shapes) {
//            System.out.println(shape);
//        }

// TODO: implement corresponding pattern to run following code

//        List<Shape> shapesCopy = new ArrayList<>();
//        for (Shape shape : shapes) {
//            shapesCopy.add(shape.clone());
//        }
//
//        System.out.println("==== Copies ====");
//        for (Shape shape : shapesCopy) {
//            System.out.println(shape);
//        }

    }
}
