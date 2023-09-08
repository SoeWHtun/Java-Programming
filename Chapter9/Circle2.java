public class Circle2 {
    double radius;

    static int numberofObjects = 0;
     
    Circle2 () {
        radius = 1;
        numberofObjects ++ ;
    }
    static int getnumberofObjects(){
        return numberofObjects;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
    
}
