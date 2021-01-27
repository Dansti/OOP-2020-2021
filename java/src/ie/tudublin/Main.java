package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        //Goes into Dog.java
        Animal misty = new Dog("Misty");
        //Goes into Cat.java
        Animal topCat = new Cat("TopCat");

        System.out.println(misty);
        System.out.println(topCat);

        misty = topCat;

        topCat.setName("Garfield");

        System.out.println(misty);
        System.out.println(topCat);

        Cat ginger = new Cat("Ginger");

        while(ginger.getLives()!=0)
        {
            ginger.kill();
        }
    

        // What will get printed out??

        // 1. topcat, Garfield
        // 2. garfield, Garfield 


    }
} 