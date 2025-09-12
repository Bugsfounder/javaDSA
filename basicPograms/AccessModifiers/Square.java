package basicPograms.AccessModifiers;

public class Square {
    int side;
    int area;
    int perimeter;

    // evaluators
    void calculateArea(){
        this.area = side * side;
    }
    void calculatePerimeter(){
        this.perimeter = 4 * side;
    }
    // setters
    void setSide(int side){
        this.side = side;
    }
    void setArea(int area){
        this.area = area;
    }
    void setPerimeter(int perimeter){
        this.perimeter = perimeter;
    }

    // getters
    int getSide(){
        return this.side;
    }

    int getArea(){
        return this.area;
    }

    int getPerimeter(){
        return this.perimeter;
    }

    public static void main(String[] args){
        Square square = new Square();

        square.setSide(41);
        square.calculateArea();
        square.calculatePerimeter();

        System.out.println(square.getArea());
        System.out.println(square.getSide());
        System.out.println(square.getPerimeter());

    }
}
