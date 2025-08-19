
import java.util.Scanner;

class Student
{
    public String roll;
    public String name;
    public String course;
    public int m1, m2, m3;
    
    public int total() {
        return m1 + m2 + m3;
    }
    public float average() {
        return (float) total() / 3;
    }
    public char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }
    public String toString() {
        return "Roll No:" + roll + "\n" + 
               "Name:" + name + "\n" + 
               "Course:" + course + "\n";
    }
}

public class studentTest {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter USN: ");
        s.roll = sc.nextLine();
        System.out.println("Enter Name: ");
        s.name = sc.nextLine();
        System.out.println("Enter Course: ");
        s.course = sc.nextLine();
        System.out.println("Enter marks m1 m2 and m3: ");

        s.m1 = sc.nextInt();
        s.m2 = sc.nextInt();
        s.m3 = sc.nextInt();
        
        System.out.println("Total :" + s.total());
        System.out.println("Average :" + s.average());
        System.out.println("Grade :" + s.grade());
        System.out.println("Details:\n" + s);
    }
}
