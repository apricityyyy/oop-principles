class ShapeUtil {
    public static void printShapes(Shape[] shapes) {
        System.out.print("[");

        for(int i = 0; i < shapes.length; i++) 
            System.out.print(shapes[i].toString() + ": " + String.format("%.3f", shapes[i].getArea()) + (i < shapes.length - 1 ? ", " : ""));

        System.out.print("]\n\n");
    }

    static void sort(Shape[] shapes) {
        for(int i = 0; i < shapes.length; i++) 
            for(int j = 0; j < shapes.length; j++) 
                if(shapes[i].getArea() < shapes[j].getArea()) {
                   swap(shapes, i, j); 
                }
    }

    static Shape findShapeByName(Shape[] shapes, String name) {
        for(int i = 0; i < shapes.length; i++) {
            if(shapes[i].getName().equals(name)) return shapes[i];
        }
        
        return null;
    }

    private static void swap(Shape[] shapes, int i, int j) {
        Shape temp;

        temp = shapes[i];
        shapes[i] = shapes[j];
        shapes[j] = temp;
    }
}