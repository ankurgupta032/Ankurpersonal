/*// The extends keyword extends a class (indicates that a class is inherited from another class).
public class Extends {
     String brand = "Ford";         // Vehicle attribute
    public void honk() {                     // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Extends {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}*/
class Extends {
    String brand = "Ford";
    public void honk() {
        System.out.println("tuut tuut");
    }
}
    class Car extends Extends{
        String ankur="Ankur";

        public static void main(String[] args) {
            Car obj1=new Car();
            System.out.println(obj1.brand+""+obj1.ankur);
            obj1.honk();
    }
}
/*
class A{
    int a=9;
}
class B extends A{
    int b=10;
}
class Demo{
    public static void main(String[] args) {
        B obj1=new B();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
    }
}
*/