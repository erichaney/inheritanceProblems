public class Staff extends Employee
{
    private String job;
    private static int SfCount = 0;

    public Staff()
    {
        this("", "", 0.0);
    }

    public Staff(String name, String job, double salary)
    {
        super(name, salary);
        this.job = job;
        SfCount++;
    }

    public static int getCount()
    {
        return  SfCount;
    }

    public String toString()
    {
        return ("Staff " + super.toString() + " " + job);
    }
}
