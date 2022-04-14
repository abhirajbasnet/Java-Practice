public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius>=0){
            this.radius = radius;
        }else {
            radius = 0;
        }

    }

    public double getRadius() {
        System.out.println("The radius of a cicle is " + radius);
        return radius;
    }

    public double getArea(){
        double area = (radius * radius *Math.PI);
        System.out.println("The area of the circle is " + area );
        return area;
    }
}
