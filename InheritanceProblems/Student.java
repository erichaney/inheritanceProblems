public class Student extends Person
{
    private double[] scores;
    private static int SCount = 0;
    public static final int tests = 3;

    public Student()
    {
        this("");
    }

    public Student(String name)
    {
        super(name);
        scores = new double[tests];

        SCount++;
    }

    public void setScore(int index, double score)
    {
        scores[index] = score;
    }

    public double getScore(int index)
    {
        return scores[index];
    }

    public double getAverage()
    {
        double sum = 0;

        for (double s : scores)
        {
            sum += s;
        }
        
        return sum / scores.length;
    }

    public String toString()
    {
        return ("Student " + super.toString() + " " + getAverage());
    }

    public static int getCount()
    {
        return SCount;
    }
}
