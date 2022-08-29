class Sphere extends Shape {
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        super.setType("sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        final double PI = Math.acos(-1);

        return 4 * PI * radius * radius;
    }

    public String toString() {
        return super.getType() + ": " + super.getName() + " - [" + radius + "]";
    }
}