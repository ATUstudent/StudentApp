package ie.atu;

public class StudentDatabase {
    String StudentName;
    String StudentEmail;
    String CourseName;

    public StudentDatabase(String studentName, String studentEmail, String courseName) {
        StudentName  =  studentName;
        StudentEmail = studentEmail;
        CourseName   =   courseName;
    }

    public void displayInfo()
    {
        System.out.println("Enter you name\n" + StudentName + "Enter your student email\n" + StudentEmail + "Enter your Course Name\n" + CourseName);
    }
}
