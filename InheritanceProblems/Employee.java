public class Employee extends Person
{
    private double salary;
    private static int ECount = 0;

    public Employee()
    {
        this("", 0.0);
    }

    public Employee(double salary)
    {
        this("", salary);
    }

    public Employee(String name, double salary)
    {
        super(name);
        this.salary = salary;
        ECount++;
    }

    public String toString()
    {
        return ("Employee " + super.toString() + " " + salary);
    }
    
    public void giveRaise(double percent)
    {
        salary += salary*(percent/100.0);
    }

    public static int getCount()
    {
        return ECount;
    }
}
        
