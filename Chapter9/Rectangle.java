public class Rectangle {
    double width;
    double height;
    Rectangle(){
         width = 1;
         height =1;
    }
    Rectangle(double newwidth,double newheight){
        width = newwidth;
        height = newheight;
    }
    double getarearerectangle(){
        return width*height;
    }
    double getperimeterrectangle(){
        return 2*(width+height);

    }


}
