public class Person
{
    private String name;
    private int id;
    private static int nextId = 0;

    public Person()
    {
        this("");
    }

    public Person(String name)
    {
        this.name = name;
        id = nextId;
        nextId++;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Person " + name + " " + id;
    }

    public static int getCount()
    {
        return nextId;
    }
}
