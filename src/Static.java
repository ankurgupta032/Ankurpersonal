//Example os static method.................
//change of college name using static method
//static is the method which run first ok..................

/*
class abc {
    int rollno;
    String name;
    static String college="ITS";
    static void change(){
        college="BBDIT";
    }
    abc(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+""+name+""+college);
    }
    class Static{
    public static void main(String[] args) {
        abc.change();
        abc s1=new abc(111,"Karan");
        abc s2=new abc(222,"Ankur");
        }
    }
}
*/
/*
class calculate{
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        int result=calculate.cube(5);
        System.out.println(result);
    }
}
*//*
class Stu{
    static int rollno;
    static int arr[];

    public static void Stu(int rollno1, int[] arr1) {
        rollno = rollno1;
        arr = arr1;
    }
    public static void display(){
        System.out.println(rollno);
        for(int res:arr){
            System.out.println(res);
        }
    }
}
public class Static {
    public static void main(String[] args) {
        Stu.Stu(23,new int[]{12,56,78,90});
        Stu.display();
    }
}
*/
/*
class abc{
    int a;
    String b;
    static String c="GLA";

    static void change(){
        c="Ankur";
    }
    abc(int a, String b) {
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a+b+c);
    }
}
class Static{
    public static void main(String[] args) {
        abc.change();
        abc s1=new abc(1,"ankur");
        s1.display();
    }
}
*/

//Lab assignment ...........................
/*
class Stu{
    static int rollno;
    static int arr[];

    public static void Stu(int rollno1, int[] arr1) {
        rollno = rollno1;
        arr = arr1;
    }
    public static void display(){
        System.out.println(rollno);
        for(int res:arr){
            System.out.println(res);
        }
    }
}
class Static {
    public static void main(String[] args) {
        Stu.Stu(23,new int[]{12,56,78,90});
        Stu.display();
    }
}
*/