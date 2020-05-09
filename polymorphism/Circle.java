package polymorphism;
public class Circle extends Shape {

    Circle() {
   
        System.out.println("Circle!");
    }


    public void draw(){
        System.out.println("draw circle!");
    }

    public static void main(String[] args) {

        Shape s = new Circle();
        s.draw();
        
    }


}