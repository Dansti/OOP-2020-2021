package ie.tudublin;

public class Animal
{
    //Changes all callouts
    public String toString()
    {
        return name;
    }

    private String name;

    //Changes none of the callouts
    //Ask to be explained what this does
    public String getName()
    {
        return name;
    }

    //Changes the last two system callouts 
    public void setName(String name)
    {
        this.name = name;
    }

    //Changes the first two system callouts
    public Animal(String name)
    {
        this.name = name;
    }
}