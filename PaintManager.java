class PaintManager {
    static Shape[] getPaintedShapes(Shape[] shapes, int nbCans, int vol) {
        // if we assume the height of paint layer to be 1 unit (just because the volume
        // is given with liter, let's consider 1 unit = 1 dm), then we can convert 
        // from volume of paint to surface area of shapes and do our calculations.
        // Because, if the height of paint layer is 1, then its volume will equal to 
        // the surface area of shape that it paints.

        double total_volume = vol * nbCans;
        double used_volume = 0;
        int cnt = 0;

        ShapeUtil.sort(shapes);

        // if the sorted areas' min member is greater than the total volume, no shape will be fully painted
        if(shapes[0].getArea() > total_volume) return null;

        for(int i = 0; i < shapes.length; i++) {
            used_volume += shapes[i].getArea();

            if(used_volume >=  total_volume) {
                break;
            } else cnt++;
        }

        Shape[] res = new Shape[cnt];

        for(int i = 0; i < res.length; i++) 
            res[i] = shapes[i]; 

        return res;
    }
}
