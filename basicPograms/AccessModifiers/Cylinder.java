package basicPograms.AccessModifiers;

public class Cylinder {
    int radius;
    int height;
    double PIE = 3.14;

    Cylinder (int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    int getRadius(){
        return this.radius;
    }

    int getHeight(){
        return  this.height;
    }

    void setRadius(int radius){
        this.radius = radius;
    }

    void setHeight(int height){
        this.height = height;
    }


    double getSurfaceArea(){
        // 2πrh+2πr2
        return (2 * PIE * radius *height) + (2 * PIE * (radius * radius));
    }

    double getVolume(){
        // πr^2h
        return PIE * (radius * radius) * height;
    }
}
