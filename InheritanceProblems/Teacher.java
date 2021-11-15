public class Teacher extends Employee
{
    private String subject;
    private Student[] students;
    private static int classSize = 30;
    private int studentCount = 0;
    private static int TCount = 0;

    public Teacher()
    {
        this("","",0);
    }

    public Teacher(String name, String subject, double salary)
    {
        super(name, salary);
        this.subject = subject;
        students = new Student[classSize];
        TCount++;
    }

    public void addStudent(Student s)
    {
        students[studentCount] = s;
        studentCount++;
    }

    public String toString()
    {
        return ("Teacher " + super.toString() + " " + subject);
    }

    public static int getCount()
    {
        return TCount;
    }
    
    
}

