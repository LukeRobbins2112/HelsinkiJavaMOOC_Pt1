
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        String studentname;
        String studentnum;
        
        System.out.print("name: ");
        studentname = reader.nextLine();
        
        while (!studentname.equals("")){
            System.out.print("studentnumber: ");
            studentnum = reader.nextLine();
            students.add(new Student(studentname, studentnum));
            System.out.print("name: ");
            studentname = reader.nextLine();
        }
        
        for (Student sdt : students){
            System.out.println(sdt);
        }
        
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        
        for (Student stu : students){
            if (stu.getName().contains(term)){
                System.out.println("Result: ");
                System.out.println(stu);
            }
        }
        
        
        
           
        
    }
}