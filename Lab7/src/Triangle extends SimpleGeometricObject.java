class Triangle extends SimpleGeometricObject {
    private double sideA = 1.0;
    private double sideB = 1.0;
    private double sideC= 1.0;

    //construct a no arg triangle
    public Triangle() {
    }
    //construct a triangle with specified values
    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        setColor(color);
        setFilled(filled);
    }
    //getters
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt((s*(s-sideA)*(s-sideB)*(s-sideC)));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    //setters
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //override string
    public String toString() {
        return "Triangle - " +
                "\nSide A: " + sideA + "\nSide B: " + sideB + "\nSide C: " + sideC
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter()
                + "\nColor: " + getColor() + "\nFilled: " + isFilled();
    }

}

