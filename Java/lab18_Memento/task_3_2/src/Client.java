public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);

        String[] edges = {
                "b",
                "c",
                "a",
                "duplicateA",
                "c",
                "b",
                "halfA"
        };

        float[] values = {
                4,
                5,
                4,
                1, // "duplicateA",
                6,
                3,
                1, // "halfA"
        };

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    break;
                case "b":
                    triangle.setB(values[index]);
                    break;
                case "c":
                    triangle.setC(values[index]);
                    break;
                case "duplicateA":
                    triangle.duplicateA();
                    break;
                case "duplicateB":
                    triangle.duplicateB();
                    break;
                case "duplicateC":
                    triangle.duplicateC();
                    break;
                case "halfA":
                    triangle.halfA();
                    break;
                case "halfB":
                    triangle.halfB();
                    break;
                case "halfC":
                    triangle.halfC();
                    break;

            }

            System.out.println("Volume = " + triangle.square());
        }



    }

}
