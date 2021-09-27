//We get default values when we access the same variables in the constructor without using this keyword......
/*class ram {
    int rollno;
    String name;
    float fee;

    ram(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + "" + name + "" + fee);
    }
}
   public  class This{
        public static void main(String[] args) {
            ram a=new ram(111,"Ankur",200);
            ram b=new ram(222,"Vibhu",400);
            a.display();
            b.display();
        }
    }
*/
//2- this: to invoke current class method...........
/*
class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        this.m();
    }

     public static class This {
        public static void main(String[] args) {
            A a = new A();
            a.n();
        }
    }
}*/

//3-to invoke current class constructor(default from parameterized)..
/*class A {
    A() {
        System.out.println("hello a");
    }

    A(int x) {
        this();
        System.out.println(x);
    }
}
    class This{
        public static void main(String[] args) {
            A a=new A(10);
        }
    }
*/

//4-Calling parameterized constructor from default constructor:
/*class A {
        A() {
            this(5);
            System.out.println("hello a");
        }
        A(int x) {
        System.out.println(x);
        }
        }
class This{
    public static void main(String[] args) {
        A a=new A(10);
    }
}
*/
// 5-real usage of the constructor..........
               //Important ---- reusing the constructor ...
                //known parameters should be entered first
/*
class Student{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fee){
        this(rollno,name,course);
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class This{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit","java");
        Student s2=new Student(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }
}*/
/*
class abc{
    abc(){
        this(5);
        System.out.println();
    }
    abc(int x){
        System.out.println(x);
    }
}*/
class Student {
    int rollno;
    String name, course;
    float fee;

    Student (int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
    }
}