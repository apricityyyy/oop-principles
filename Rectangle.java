class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        super.setType("rectangle"); 
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public String toString() {
        return super.getType() + ": " + super.getName() + " - [" + width + ", " + height + "]";
    }
}
