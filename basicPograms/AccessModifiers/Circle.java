package basicPograms.AccessModifiers;

public class Circle {
    float PIE = 3.14f;
    int radius;

    // setters
    void setRadius(int radius){
        this.radius = radius;
    }

    // getters
    double getArea(){
        return PIE * radius * radius;
    }

    double getPerimeter(){
        return 2 * PIE * radius;
    }

    public static void main(String[] args){
        Circle  circle = new Circle();
        circle.setRadius(4);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
