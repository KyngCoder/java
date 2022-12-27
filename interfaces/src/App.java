public class App {
    public static void main(String[] args) throws Exception {
        
        //creating an instance of the Rectangle class and testing if it works
        var rectangleOne = new Rectangle(4,5 ); 
        System.out.println(rectangleOne.getArea()); //20.0
        System.out.println(rectangleOne.getPerimeter()); //18.0

        //creating an instance of the Circle class and testing if it works
        var circleOne = new Circle(7); 
        System.out.println(circleOne.getArea()); //153.9
        System.out.println(circleOne.getPerimeter()); //43.98

          //creating an instance of the Triangle class and testing if it works
          var triangleOne = new Triangle(3,4,5); 
          System.out.println(triangleOne.getArea()); //6.0
          System.out.println(triangleOne.getPerimeter()); //12.0

    }
}
