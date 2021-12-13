/*
    import java.util.Scanner;
    public class stu {
        public String name;
        public int rollno, marks;

        stu() {
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            rollno = sc.nextInt();
            marks = sc.nextInt();
        }

        static void Result(String n)
        {
            System.out.println(n);
        }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int max=0,i=0;
            System.out.println("Enter the number of studemts");
            int l=sc.nextInt();
            stu obj[]=new stu[l];
            for(int j=0;j<obj.length;j++)
            {
                obj[j]=new stu();
            }
            for(int k=0;k<obj.length;k++)
            {
                if(obj[k].marks>max)
                {
                    max=obj[k].marks;
                    i=k;
                }
            }
            Result(obj[i].name);

        }
    }
}
*/