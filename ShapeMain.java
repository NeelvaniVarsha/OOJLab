     abstract class Shape {
         protected int dimension1;
         protected int dimension2;
    
         abstract void printArea();
     }

     class Rectangle extends Shape {
         Rectangle(int length, int width) {
             dimension1 = length;
             dimension2 = width;
         }
    
         @Override
         void printArea() {
             int area = dimension1 * dimension2;
             System.out.println("Area of Rectangle: " + area);
         }
     }

     class Triangle extends Shape {
         Triangle(int base, int height) {
             dimension1 = base;
             dimension2 = height;
         }
         
         @Override
         void printArea() {
             double area = 0.5 * dimension1 * dimension2;
             System.out.println("Area of Triangle: " + area);
         }
     }

     class Circle extends Shape {
         Circle(int radius) {
             dimension1 = radius;
         }
    
         @Override
         void printArea() {
             double area = Math.PI * dimension1 * dimension1;
             System.out.println("Area of Circle: " + area);
         }
     }

     public class ShapeMain {
         public static void main(String[] args) {
             Rectangle rectangle = new Rectangle(5, 10);
             Triangle triangle = new Triangle(3, 6);
             Circle circle = new Circle(4);
        
             rectangle.printArea();
             triangle.printArea();
             circle.printArea();
         }
     }
