package basicPograms.AccessModifiers;

public class Rectangle {
    // instance variables or properties
    int length;
    int width;
    int area;
    int perimeter;

    // instance methods or member functions()
    // evaluators
    int calculateArea(){
       return this.area = length * width;
    }
    int calculatePerimeter(){
        return this.perimeter = 2 * (length + width);
    }

    // getters
    int getLength(){
       return this.length;
    }
    int getWidth(){
        return this.width;
    }

    // setters
    void setLength(int length){
        this.length = length;
    }
    void setWidth(int width){
        this.width = width;
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setLength(5);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
