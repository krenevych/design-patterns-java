public class Triangle {

    private float a;
    private float b;
    private float c;

    /**
     * Перевіряє чи існує трикутник з заданими сторонами
     *
     * @param a сторона трикутники
     * @param b сторона трикутники
     * @param c сторона трикутники
     * @return true, якщо такий трикутник існує, та false в іншому разі
     */
    public static boolean checkExistence(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public Triangle(float a, float b, float c) {
        assert checkExistence(a, b, c);

        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Встановлює сторону "a" трикутника
     *
     * @param a сторона трикутника
     */
    public void setA(float a) {
        if (checkExistence(a, b, c))
            this.a = a;
        else System.out.println("Error: value is not set");
    }

    /**
     * Встановлює сторону "b" трикутника
     *
     * @param b сторона трикутника
     */
    public void setB(float b) {
        if (checkExistence(a, b, c))
            this.b = b;
        else System.out.println("Error: value is not set");
    }

    /**
     * Встановлює сторону "c" трикутника
     *
     * @param c сторона трикутника
     */
    public void setC(float c) {
        if (checkExistence(a, b, c))
            this.c = c;
        else System.out.println("Error: value is not set");
    }

    /**
     * Обчислює периметр трикутника
     *
     * @return периметр трикутника
     */
    public float perimeter() {
        return a + b + c;
    }

    /**
     * Обчислює площу трикутника
     *
     * @return площу трикутника
     */
    public float square() {
        float p = perimeter() / 2;
        float s = p * (p - a) * (p - b) * (p - c);
        return (float) Math.sqrt(s);
    }


}
