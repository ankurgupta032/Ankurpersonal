abstract class Abstract{
    public abstract void m1();
    public abstract void m2();
}
abstract class child extends Abstract{
    public void m1(){
        System.out.println("Ankur");
    }

}
class Ankur{
    public static void main(String[] args) {
        child obj1= new child() {    //declaring the method in the main method for exection of the abstract methods.
            @Override
            public void m2() {
                System.out.println("gupta");
            }
        };
        obj1.m1();
        obj1.m2();
    }
}

//abstract class ankur{
//    public abstract void m1();
//}
//











